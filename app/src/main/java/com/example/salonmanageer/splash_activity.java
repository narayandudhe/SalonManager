package com.example.salonmanageer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activity);
        new Thread() {
            public void run() {
                try {
                    AnonymousClass1.sleep(2000);
                    splash_activity.this.startActivity(new Intent(splash_activity.this.getBaseContext(), HomeActivity.class));
                    splash_activity.this.finish();
                } catch (Exception e) {
                }
            }
        }.start();
    }
}

