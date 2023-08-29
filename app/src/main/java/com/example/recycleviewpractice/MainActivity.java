package com.example.recycleviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button Listbtn,Gridbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        Listbtn = findViewById(R.id.listBtn);
        Gridbtn = findViewById(R.id.gridBtn);

        LinearLayoutManager l1 = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(l1);

        Listbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setLayoutManager(l1);
            }
        });
        GridLayoutManager g1 = new GridLayoutManager(this,2);
        Gridbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setLayoutManager(g1);
            }
        });
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("Masala", R.drawable.a));
        foods.add(new Food("Chataka",R.drawable.b));
        foods.add(new Food("Pataka",R.drawable.c));
        foods.add(new Food("IceCreame",R.drawable.d));
        foods.add(new Food("Magedar",R.drawable.e));
        foods.add(new Food("Chandani",R.drawable.f));
        foods.add(new Food("Tikhha",R.drawable.g));
        FoodAdapter adapter = new FoodAdapter(this,foods);
        recyclerView.setAdapter(adapter);
    }
}