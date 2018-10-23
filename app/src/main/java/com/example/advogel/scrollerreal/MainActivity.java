package com.example.advogel.scrollerreal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;

    Button q1;
    Button q2;
    Button q3;
    Button q4;
    Button q5;
    Button q6;
    Button q7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (RadioButton) findViewById(R.id.radioButton11); //1
        q2 = (RadioButton) findViewById(R.id.radioButton22); //2
        q3 = (RadioButton) findViewById(R.id.radioButton31); //1
        q4 = (RadioButton) findViewById(R.id.radioButton41); //1
        q5 = (RadioButton) findViewById(R.id.radioButton52); //2
        q6 = (RadioButton) findViewById(R.id.radioButton61); //1
        q7 = (RadioButton) findViewById(R.id.radioButton71); //1

    }

    public void score(View view){
        int correct = 0;

        if(q1.isSelected())
            correct++;
        if(q2.isSelected())
            correct++;
        if(q3.isSelected())
            correct++;
        if(q4.isSelected())
            correct++;
        if(q5.isSelected())
            correct++;
        if(q6.isSelected())
            correct++;
        if(q7.isSelected())
            correct++;

            b.setText(correct+"/7");

    }
}
