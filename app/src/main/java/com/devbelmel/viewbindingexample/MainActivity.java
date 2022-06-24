package com.devbelmel.viewbindingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.devbelmel.viewbindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View viewBinding=binding.getRoot();
        setContentView(viewBinding);
        binding.buttonBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.setText(R.string.hellobinding);
                binding.textView.setTextSize(0,34);
            }
        });
    }
}