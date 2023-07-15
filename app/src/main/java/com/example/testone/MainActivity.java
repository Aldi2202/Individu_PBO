package com.example.testone;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.testone.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button tampilkan;

    EditText nama, alamat;

    TextView hasil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilkan = findViewById(R.id.btntampilkan);
        nama = findViewById(R.id.edtnama);
        alamat =  findViewById(R.id.edtalamat);
        hasil =  findViewById(R.id.txthasill);

        tampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("Hello Nama Saya " + nama.getText().toString()
                        + " dan Alamat Saya di " + alamat.getText().toString());
            }
        });
    }
}