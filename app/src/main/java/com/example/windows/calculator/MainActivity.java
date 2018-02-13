package com.example.windows.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView valueView;
    String value;
    Double firstValue;
    Double secondValue;
    Double result;

//    Button buttonZero,
//            buttonOne,
//            buttonTwo,
//            buttonThree,
//            buttonFour,
//            buttonFive,
//            buttonSix,
//            buttonSeven,
//            buttonEight,
//            buttonNine,
//            buttonPlus,
//            buttonMinus,
//            buttonTimes,
//            buttonDivide,
//            buttonEquals,
//            buttonPlusOrMinus,
//            buttonComma,
//            buttonClear,
//            buttonBackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button
                buttonZero = findViewById(R.id.btn_0),
                buttonOne = findViewById(R.id.btn_1),
                buttonTwo = findViewById(R.id.btn_2),
                buttonThree = findViewById(R.id.btn_3),
                buttonFour = findViewById(R.id.btn_4),
                buttonFive = findViewById(R.id.btn_5),
                buttonSix = findViewById(R.id.btn_6),
                buttonSeven = findViewById(R.id.btn_7),
                buttonEight = findViewById(R.id.btn_8),
                buttonNine = findViewById(R.id.btn_9),
                buttonPlus = findViewById((R.id.btn_plus)),
                buttonMinus = findViewById(R.id.btn_minus),
                buttonTimes = findViewById(R.id.btn_times),
                buttonDivide = findViewById(R.id.btn_divide),
                buttonEquals = findViewById(R.id.btn_equals),
                buttonPlusOrMinus = findViewById(R.id.btn_plusOrMinus),
                buttonComma = findViewById(R.id.btn_comma),
                buttonClear = findViewById(R.id.btn_clear),
                buttonBackspace = findViewById(R.id.btn_backspace);

        valueView = findViewById(R.id.tv_value);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("0");
                setValue("0");
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("1");
                setValue("1");
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("2");
                setValue("2");
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("3");
                setValue("3");
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("4");
                setValue("4");
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("5");
                setValue("5");
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("6");
                setValue("6");
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("7");
                setValue("7");
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("8");
                setValue("8");
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("9");
                setValue("9");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Double.parseDouble(value);
                resetValue();
                resetView();
                //setView("+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Double.parseDouble(value);
                resetView();
                resetValue();
                //setView("-");
            }
        });

        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Double.parseDouble(value);
                resetView();
                resetValue();
                //setView("*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Double.parseDouble(value);
                resetView();
                resetValue();
                //setView("/");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondValue = Double.parseDouble(value);
                result = firstValue + secondValue;
                resetView();
                setView(Double.toString(result));
            }
        });

    }

    public void setView(String v){
        if(valueView !=null){
            valueView.setText(valueView.getText()+v);
        }
        else{
            valueView.setText(""+v);
        }
    }

    public void resetView(){
        valueView.setText("");
    }

    public void resetValue(){
        value = null;
    }

    public void resetAll(){
        firstValue = null;
        secondValue = null;
        valueView = null;
    }

    public void setValue(String number){
        if(valueView==null){
            value = number;
        }else{
            value = valueView.getText().toString()+number;
        }
    }


}
