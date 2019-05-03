package com.example.nz.classsix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            button = (Button) findViewById(R.id.buton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, NewActivityt.class);
                    startActivity(intent);
                }
            });
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this,"Sorry ",Toast.LENGTH_SHORT).show();
        }
    }
}
