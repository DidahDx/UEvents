package com.app.uevents.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.uevents.Activities.EventViewActivity;
import com.app.uevents.Adapters.NearByAdapter;
import com.app.uevents.Adapters.TopPicksAdapter;
import com.app.uevents.Models.Category;
import com.app.uevents.R;
import com.app.uevents.Utils.RecyclerItemClickListener;

import java.util.ArrayList;

public class FragmentSuggested extends Fragment {
    private ArrayList<Category> categories = new ArrayList<>();

    /* renamed from: v */
    private View f54v;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.f54v = inflater.inflate(R.layout.frag_suggested, container, false);
        setViews();
        return this.f54v;
    }

    private void setViews() {
        RecyclerView recyclerTop = (RecyclerView) this.f54v.findViewById(R.id.recycler_top);
        recyclerTop.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerTop.setAdapter(new TopPicksAdapter(getContext()));
        recyclerTop.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                FragmentSuggested.this.startActivity(new Intent(FragmentSuggested.this.getContext(), EventViewActivity.class));
            }
        }));
        RecyclerView recyclerView = (RecyclerView) this.f54v.findViewById(R.id.recycler_suggested);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new NearByAdapter(getContext()));
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                FragmentSuggested.this.startActivity(new Intent(FragmentSuggested.this.getContext(), EventViewActivity.class));
            }
        }));
    }
}
