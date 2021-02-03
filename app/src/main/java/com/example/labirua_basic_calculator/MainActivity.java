package com.example.labirua_basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.labirua_calculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAddition,buttonSubtraction,buttonDivision,buttonMultiplication,buttonClear,buttonEquals,buttonDecimalPoint,buttonModulo;

        buttonAddition = findViewById(R.id.buttonAddition);
        buttonSubtraction = findViewById(R.id.buttonSubtraction);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonModulo = findViewById(R.id.buttonModulo);

        buttonAddition.setOnClickListener(this);
        buttonSubtraction.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonMultiplication.setOnClickListener(this);
        buttonModulo.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){

        EditText txtOperand1Output,txtOperand2Output;

        txtOperand1Output = findViewById(R.id.txtOperand1Output);
        txtOperand2Output = findViewById(R.id.txtOperand2Output);

        TextView txtAnswer,txtResult;

        txtAnswer = findViewById(R.id.txtAnswer);

        Double op1o = 0.0;
        Double op2o = 0.0;
        Double ans = 0.0;

        op1o = Double.parseDouble(txtOperand1Output.getText().toString());
        op2o = Double.parseDouble(txtOperand2Output.getText().toString());

        switch(v.getId()){
            case R.id.buttonAddition:
                ans = op1o + op2o;
                txtAnswer.setText(Double.toString(ans));

                break;
            case R.id.buttonSubtraction:
                ans = op1o - op2o;
                txtAnswer.setText(Double.toString(ans));

                break;
            case R.id.buttonDivision:
                ans = op1o / op2o;
                txtAnswer.setText(Double.toString(ans));

                break;
            case R.id.buttonMultiplication:
                ans = op1o * op2o;
                txtAnswer.setText(Double.toString(ans));

                break;
            case R.id.buttonModulo:
                ans = op1o % op2o;
                txtAnswer.setText(Double.toString(ans));
                break;






        }



    }
}