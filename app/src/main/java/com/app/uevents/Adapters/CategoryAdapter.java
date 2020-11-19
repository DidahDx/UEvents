package com.app.uevents.Adapters;

import android.content.Context;
import android.util.Log;
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

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryHolder> {
    List<Category> categories = new ArrayList();
    Context context;

    public CategoryAdapter(Context context2, List<Category> categories2) {
        this.context = context2;
        this.categories = categories2;
    }

    @NonNull
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CategoryHolder(LayoutInflater.from(this.context).inflate(R.layout.item_category, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull CategoryHolder categoryHolder, int i) {
        categoryHolder.title.setText(this.categories.get(i).getTitle());
    }

    public int getItemCount() {
        Log.d("Size", "" + this.categories.size());
        return this.categories.size();
    }

    class CategoryHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;

        public CategoryHolder(@NonNull View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
