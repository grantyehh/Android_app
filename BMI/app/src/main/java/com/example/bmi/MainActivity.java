package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.TagLostException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView show;
    private EditText height;
    private EditText weight;
    private Button trans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.textView4);
        height = findViewById(R.id.editTextNumber);
        weight = findViewById(R.id.editTextNumber2);
        trans = findViewById(R.id.button);
        trans.setOnClickListener(myOnClickListener);
    }
    private View.OnClickListener myOnClickListener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double h = Double.parseDouble(height.getText().toString);
                    double w = Double.parseDouble(weight.getText().toString());
                    double bmi = w / Math.pow(h/100,2);
                    show.setText("Your BMI is: " + bmi +" !");
                }
            };
}