package com.luciekimotho.a52weekschallenge.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.luciekimotho.a52weekschallenge.R;
import com.luciekimotho.a52weekschallenge.databinding.ActivityMainBinding;
import com.luciekimotho.a52weekschallenge.viewmodel.WeekViewModel;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main );
        binding.setVm(new WeekViewModel(getApplication()));
        //Log.d("Calculator","End of bind");

    }
}
