package com.example.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acttivity);
    }

    public void layout4(View view) {
        startActivity(new Intent(HomeActtivity.this, layout4.class));
    }

    public void layou3(View view) {
        startActivity(new Intent(HomeActtivity.this, layout3.class));
    }

    public void layout1(View view) {
        startActivity(new Intent(HomeActtivity.this, layout1.class));
    }

    public void layout2(View view) {
        startActivity(new Intent(HomeActtivity.this, layout2.class));
    }
}
