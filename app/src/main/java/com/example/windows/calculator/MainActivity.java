package com.example.windows.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView valueView;
    Double firstValue;
    Double secondValue;

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
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("1");
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("2");
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("3");
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("4");
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("5");
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("6");
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("7");
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("8");
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("9");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("-");
            }
        });

        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("x");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setView("/");
            }
        });

    }

    public void setView(String v){
        if(valueView !=null){
            valueView.setText(valueView.getText()+v);
        }
        else{
            valueView.setText(v);
        }
    }

    public void resetValue(){

    }

    public void resetAll(){

    }


}
