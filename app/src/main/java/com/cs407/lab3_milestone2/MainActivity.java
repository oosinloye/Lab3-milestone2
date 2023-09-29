package com.cs407.lab3_milestone2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
// testing
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        Button firstFragmentButton = findViewById(R.id.firstButtonFragment);
        firstFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, FirstFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("showing First")
                        .commit();
            }
        });
        Button secondFragmentButton = findViewById(R.id.secondButtonFragment);
        secondFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, SecondFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("showing Second")
                        .commit();
            }
        });

    }

}