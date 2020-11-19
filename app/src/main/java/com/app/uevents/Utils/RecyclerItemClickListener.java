package com.app.uevents.Utils;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
    GestureDetector mGestureDetector;
    private OnItemClickListener mListener;

    public RecyclerItemClickListener(Context context, OnItemClickListener listener) {
        this.mListener = listener;
        this.mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }

    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        View childView = view.findChildViewUnder(e.getX(), e.getY());
        if (childView == null || this.mListener == null || !this.mGestureDetector.onTouchEvent(e)) {
            return false;
        }
        this.mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean arg0) {
    }

    public void onTouchEvent(RecyclerView arg0, MotionEvent arg1) {
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }
}
