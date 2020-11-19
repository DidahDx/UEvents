package com.app.uevents.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.uevents.Models.Category;
import com.app.uevents.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryEventsAdapter extends RecyclerView.Adapter<CategoryEventsAdapter.CategoryHolder> {
    List<Category> categories = new ArrayList();
    Context context;

    public CategoryEventsAdapter(Context context2) {
        this.context = context2;
    }

    @NonNull
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CategoryHolder(LayoutInflater.from(this.context)
                .inflate(R.layout.item_category_event, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull CategoryHolder categoryHolder, int i) {
    }

    public int getItemCount() {
        return 8;
    }

    class CategoryHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;

        public CategoryHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
