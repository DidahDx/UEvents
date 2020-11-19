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
import com.app.uevents.R;
import com.app.uevents.Utils.RecyclerItemClickListener;

public class FragmentNearBy extends Fragment {

    /* renamed from: v */
    private View f53v;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.f53v = inflater.inflate(R.layout.frag_nearby, container, false);
        setViews();
        return this.f53v;
    }

    private void setViews() {
        RecyclerView recyclerView = (RecyclerView) this.f53v.findViewById(R.id.recycler_nearby);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new NearByAdapter(getContext()));
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                FragmentNearBy.this.startActivity(new Intent(FragmentNearBy.this.getContext(), EventViewActivity.class));
            }
        }));
    }
}
