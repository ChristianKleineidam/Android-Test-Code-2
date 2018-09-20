package com.example.ckleineidam.testproject;

import android.content.Context;
import android.databinding.BaseObservable;
import android.util.Log;


public class ViewModel extends BaseObservable {
    private static final String TAG = "VIEW_MODEL";

    private Context mActivity;

    public ViewModel(Context context) {
        this.mActivity=context;
    }

    public void testButton(){
        Log.i(TAG, "Button Click");
    }
}
