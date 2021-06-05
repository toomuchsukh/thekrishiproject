package com.example.thekrishiproject.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class baseviewholder extends RecyclerView.ViewHolder{

    private int mCurrentPosition;
    public baseviewholder(@NonNull View itemView) {
        super(itemView);
    }
    protected abstract void clear();
    public void onBind(int position){
        mCurrentPosition=position;
        clear();
    }

    public int getmCurrentPosition() {
        return mCurrentPosition;
    }
}
