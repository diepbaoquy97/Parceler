package com.example.parceler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSecondActivity();
            }
        });
    }

    public void gotoSecondActivity(){
        User user = new User("CENG",1);
        Parcelable parcelable = Parcels.wrap(user);

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("DATA_KEY",parcelable);
        startActivity(intent);
    }
}
