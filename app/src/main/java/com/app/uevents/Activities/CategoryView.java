package com.app.uevents.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.uevents.Adapters.CategoryEventsAdapter;
import com.app.uevents.Models.Category;
import com.app.uevents.R;
import com.app.uevents.Utils.RecyclerItemClickListener;

import java.util.ArrayList;

public class CategoryView extends AppCompatActivity {
    private ArrayList<Category> categories = new ArrayList<>();

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CategoryView.this.finish();
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 2));
        recyclerView.setAdapter(new CategoryEventsAdapter(getBaseContext()));
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getBaseContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                CategoryView.this.startActivity(new Intent(CategoryView.this.getBaseContext(), EventViewActivity.class));
            }
        }));
    }
}
