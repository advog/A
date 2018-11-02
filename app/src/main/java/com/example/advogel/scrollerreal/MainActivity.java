
package com.example.advogel.scrollerreal;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;

    Button q1;
    EditText q2;
    Button q3;
    Button q4;
    Button q5;
    Button q6;
    Button q7;
    Button q8;

    Snackbar snack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (RadioButton) findViewById(R.id.radioButton11); //1
        q2 = (EditText) findViewById(R.id.radioButton22); //2
        q3 = (RadioButton) findViewById(R.id.radioButton31); //1
        q4 = (RadioButton) findViewById(R.id.radioButton41); //1
        q5 = (RadioButton) findViewById(R.id.radioButton52); //2
        q6 = (RadioButton) findViewById(R.id.radioButton61); //1
        q7 = (CheckBox) findViewById(R.id.radioButton71); //1
        q8 = (CheckBox) findViewById(R.id.radioButton72); //1
        snack = Snackbar.make(findViewById(R.id.parent),"",Snackbar.LENGTH_LONG);
    }

    public void score(View view){
        int correct = 0;

        if(q1.isSelected())
            correct++;

        if(q2.getText().equals("shamalama"))
            correct++;

        if(q3.isSelected())
            correct++;
        if(q4.isSelected())
            correct++;
        if(q5.isSelected())
            correct++;

        if(q6.isSelected())
            correct++;

        if(q7.isSelected() && q8.isSelected())
            correct++;

        snack.setText(correct + "/7");
        snack.show();


    }
}
