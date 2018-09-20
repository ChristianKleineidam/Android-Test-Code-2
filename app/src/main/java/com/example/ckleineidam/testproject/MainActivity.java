package com.example.ckleineidam.testproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ckleineidam.testproject.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ViewModel mModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mModel = new ViewModel(this);
        binding.setViewModel(mModel);
    }
}
