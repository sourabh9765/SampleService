package com.example.sourabh.sampleservice;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sourabh.sampleservice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.btn1.setOnClickListener(this);
        binding.btn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getApplicationContext(),SampleService.class);
        switch (v.getId()){
            case R.id.btn1:

                startService(intent);
                break;
            case R.id.btn2:
                stopService(intent);
                break;
        }


    }
}
