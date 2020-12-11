package com.example.bottomnavview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView= findViewById(R.id.bottomNavigationView);
        NavHostFragment navHostFragment= (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        NavigationUI.setupWithNavController(navigationView,navHostFragment.getNavController());
    }
}