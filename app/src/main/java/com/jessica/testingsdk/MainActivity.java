package com.jessica.testingsdk;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jessica.mylibrary.*;

public class MainActivity extends AppCompatActivity {
    TesterObject test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = new TesterObject();
        String halooo = test.echo("Halo halo");
        Toast.makeText(this, halooo, Toast.LENGTH_SHORT).show();
    }
}