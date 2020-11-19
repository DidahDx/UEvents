package com.app.uevents.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.app.uevents.R;

import java.util.Objects;

public class FragFeatured extends Fragment {

    /* renamed from: v */
    View f51v;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.f51v = inflater.inflate(R.layout.frag_featured, container, false);
        Bundle bundle = getArguments();
        ImageView imageView = (ImageView) this.f51v.findViewById(R.id.img_banner);
        if (bundle != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable((Context) Objects.requireNonNull(getContext()), bundle.getInt("banner")));
        }
        return this.f51v;
    }
}
