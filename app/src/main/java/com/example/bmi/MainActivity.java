package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(btn_listner);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(btn_listner);


        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(btn_listner);




    }

    private Button.OnClickListener btn_listner = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button: {
                    Intent it = new Intent();
                    it.setClass(MainActivity.this, Main2Activity.class);
                    startActivity(it);
                    break;
                }
                case R.id.button4: {
                    Intent it = new Intent();
                    it.setClass(MainActivity.this, Main3Activity.class);
                    startActivity(it);
                    break;
                }
                case R.id.button5: {
                    Intent it = new Intent();
                    it.setClass(MainActivity.this, Main4Activity.class);
                    startActivity(it);
                    break;
                }

            }
        }




    };
}