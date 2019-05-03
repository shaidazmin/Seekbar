package com.example.nz.classsix;

import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class NewActivityt extends AppCompatActivity {


    RatingBar ratingBar;
    TextView textView,textView2,textView3;
    SeekBar seekBar;
    Switch switchID;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_activityt);


        try {


            // Rating Bar ...................................

            ratingBar = (RatingBar) findViewById(R.id.rtingBar);
            switchID = (Switch) findViewById(R.id.switchID);
            textView = (TextView) findViewById(R.id.result);
            textView2 = (TextView) findViewById(R.id.seekBarResult);
            seekBar = (SeekBar) findViewById(R.id.seekBarID);

            textView.setText("Current rating is : " + ratingBar.getProgress());
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    textView.setText("Your rating is : " + rating);
                }
            });


            /// Seek bar ....................

            textView2.setText("Value : " + seekBar.getProgress() + " / " + seekBar.getMax());

            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    textView2.setText("Value : " + progress + " / " + seekBar.getMax());

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(NewActivityt.this, "SeekBar is Starting", Toast.LENGTH_SHORT).show();

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(NewActivityt.this, "SeekBar is Stoped", Toast.LENGTH_SHORT).show();

                }
            });



        // Switch bar ...


        switchID.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(NewActivityt.this,"Switch is on",Toast.LENGTH_SHORT).show();

                  //  textView3.setText("Switch is on");
                }else {

                    Toast.makeText(NewActivityt.this,"Switch is off ",Toast.LENGTH_SHORT).show();
                  //  textView3.setText("Switch is off");
                }
            }
        });


   // textView3.setText("Switch is on ");




        }
        catch (Exception e){

            Toast.makeText(NewActivityt.this,"Sorry",Toast.LENGTH_SHORT).show();
        }

    }
}
