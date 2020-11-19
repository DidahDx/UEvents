package com.app.uevents.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.app.uevents.Models.Category;
import com.app.uevents.R;

import java.util.ArrayList;
import java.util.List;

public class NearByAdapter extends RecyclerView.Adapter<NearByAdapter.CategoryHolder> {
    List<Category> categories = new ArrayList();
    int[] colors = {R.color.deeppurple, R.color.yello, R.color.light_green,
            R.color.fair, R.color.light_red};
    Context context;

    public NearByAdapter(Context context2) {
        this.context = context2;
    }

    @NonNull
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CategoryHolder(LayoutInflater.from(this.context).inflate(R.layout.item_near_by, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull CategoryHolder categoryHolder, int i) {
        categoryHolder.tag.setBackgroundColor(ContextCompat.getColor(this.context, this.colors[i]));
    }

    public int getItemCount() {
        return 5;
    }

    class CategoryHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tag;
        TextView title;

        public CategoryHolder(@NonNull View itemView) {
            super(itemView);
            this.tag = (TextView) itemView.findViewById(R.id.tv_tag);
        }
    }
}
