package com.example.profile;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageButton;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.profile.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageButton a1 =findViewById(R.id.Avatar1);
        ImageButton a2= findViewById(R.id.Avatar2);
        ImageButton a3= findViewById(R.id.Avatar3);
        ImageButton a4= findViewById(R.id.Avatar4);
        ImageButton a5= findViewById(R.id.Avatar5);
        ImageButton a6= findViewById(R.id.Avatar6);
        Intent returnIntent = new Intent();

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton selectedImage = (ImageButton) view;

                returnIntent.putExtra("imageID", a1.getId());
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton selectedImage = (ImageButton) view;
                returnIntent.putExtra("imageID", a2.getId());
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton selectedImage = (ImageButton) view;
                returnIntent.putExtra("imageID", a3.getId());
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton selectedImage = (ImageButton) view;
                returnIntent.putExtra("imageID", a4.getId());
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton selectedImage = (ImageButton) view;
                returnIntent.putExtra("imageID", a5.getId());
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton selectedImage = (ImageButton) view;
                returnIntent.putExtra("imageID", a6.getId());
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });

    }

}