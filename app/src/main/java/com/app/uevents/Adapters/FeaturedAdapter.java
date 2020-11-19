package com.app.uevents.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.uevents.Models.Event;
import com.app.uevents.R;

import java.util.ArrayList;
import java.util.List;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedHolder> {
    Context context;
    List<Event> events = new ArrayList();

    public FeaturedAdapter(Context context2, List<Event> events2) {
        this.context = context2;
        this.events = events2;
    }

    @NonNull
    public FeaturedHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new FeaturedHolder(LayoutInflater.from(this.context).inflate(R.layout.item_featured_event, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull FeaturedHolder featuredHolder, int i) {
    }

    public int getItemCount() {
        return this.events.size();
    }

    class FeaturedHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public FeaturedHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.img_category);
        }
    }
}
