package com.app.uevents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LoginActivity.this.startActivity(new Intent(LoginActivity.this.getBaseContext(), MainActivity.class));
            }
        });
    }
}
