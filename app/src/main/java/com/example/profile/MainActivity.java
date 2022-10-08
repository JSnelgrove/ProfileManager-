package com.example.profile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mapsbtn = findViewById(R.id.OnOpenInGoogleMaps);
        ImageButton imagebtn = findViewById(R.id.imageView2);

        mapsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText teamAddress = (EditText) findViewById(R.id.LocationEdit);
                Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q= " + teamAddress.getText());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        imagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivityForResult(intent, 0);

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(0, resultCode, data);
        if (resultCode == RESULT_CANCELED) return;
        //Getting the Avatar Image we show to our users
        ImageButton avatarImage = (ImageButton) findViewById(R.id.imageView2);
        //Figuring out the correct image
        String drawableName;
        switch (data.getIntExtra("imageID",R.id.Avatar1)) {
            case (R.id.Avatar1):
                drawableName = "@android:drawable/sym_call_outgoing";
                break;
            case (R.id.Avatar2):
                drawableName = "@android:drawable/sym_call_missed";
                break;
            case (R.id.Avatar3):
                drawableName = "@android:drawable/sym_call_incoming";
                break;
            case (R.id.Avatar4):
                drawableName = "@android:drawable/stat_sys_vp_phone_call_on_hold";
                break;
            case (R.id.Avatar5):
                drawableName = "@android:drawable/stat_sys_vp_phone_call";
                break;
            case (R.id.Avatar6):
                drawableName = "@android:drawable/stat_sys_phone_call_forward";
                break;
            default:
                drawableName = "@drawable/ic_launcher_foreground";
                break;
        }
        int	resID	=	getResources().getIdentifier(drawableName,	"drawable",  getPackageName());
        avatarImage.setImageResource(resID);
    }

}
