package com.example.parceler;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.parceler.Parcels;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG="Second";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Parcelable parcelable = getIntent().getParcelableExtra("DATA_KEY");
        User user = Parcels.unwrap(parcelable);

        Log.e(TAG,"onCreate" +user.toString());

    }
}
