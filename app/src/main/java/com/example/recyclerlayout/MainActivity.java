package com.example.recyclerlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        states.add(new State("Беларусь", "Минск", R.drawable.Беларусь));
        states.add(new State("Англия", "Лондон", R.drawable.Англия));
        states.add(new State("Испания", "Мадрид", R.drawable.Испания));
        states.add(new State("Франция", "Париж", R.drawable.Франция));
        states.add(new State("Германия", "Берлин", R.drawable.Германия));
    }
}