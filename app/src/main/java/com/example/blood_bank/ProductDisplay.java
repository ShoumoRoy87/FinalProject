package com.example.blood_bank;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_display);

        Button button1,button2;
        button1=findViewById(R.id.donor);
        button2=findViewById(R.id.quantity);

    button1.setOnClickListener(v -> {

        Intent intent=new Intent(ProductDisplay.this, OrderActivity.class);
        startActivity(intent);



    });



    }
}