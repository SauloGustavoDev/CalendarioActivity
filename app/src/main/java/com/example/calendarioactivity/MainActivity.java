package com.example.calendarioactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import com.example.calendarioactivity.databinding.ActivityMainBinding;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MaterialCalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        binding.calendarView.state().edit()
                .setMinimumDate(CalendarDay.from(2015, 1, 1))
                .setMaximumDate(CalendarDay.from(2023, 1, 1))
                .commit();*/
        CharSequence meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro","Outubro", "Novembro", "Dezembro"};
        CharSequence semanas[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        binding.calendarView.setWeekDayLabels(semanas);
        binding.calendarView.setTitleMonths(meses);
        binding.calendarView.setOnMonthChangedListener(new OnMonthChangedListener() {
            @Override
            public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
                Log.i("data: ", "valor: " + (date.getMonth()+1) + "/" + date.getYear());
            }
        });
/*
        binding.calendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@android.support.annotation.NonNull @NonNull MaterialCalendarView widget, @android.support.annotation.NonNull @NonNull CalendarDay date, boolean selected) {
                Log.i("data: ", "valor: " + date);
            }
        });
        ------------------- Esse de baixo é um calendario da biblioteca padrão do android, o de cima de é uma biblioteca importada no buildGradle
        binding.calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

            }
        });
         */
    }
}