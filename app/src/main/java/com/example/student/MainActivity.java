package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.student.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.sort.setOnClickListener(view -> {
            String[]names={"\nMs Ravand : 14\n","\nZahra Ghavam saeedi : 13\n","\nAlireza Bahari : 18\n","\nBahar Razavi : 19\n","\nMahdiyar Merrixi : 13\n","\nMohammadreza Asiyaban : 10\n"};
            Arrays.sort(names);
            binding.test.setText(Arrays.toString(names));

        });
        binding.gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.sharait.setText("14.5");

            }
        });


    }
}
