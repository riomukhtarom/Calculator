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
    boolean operator = false;
    boolean statusPlus = false;
    boolean statusMinus = false;
    boolean statusTimes = false;
    boolean statusDivide = false;

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
                buttonComma = findViewById(R.id.btn_comma),
                buttonClear = findViewById(R.id.btn_clear);

        valueView = findViewById(R.id.tv_value);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("0");
                setView("0");
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("1");
                setView("1");
                System.out.println(value);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("2");
                setView("2");
                System.out.println(value);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("3");
                setView("3");
                System.out.println(value);
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("4");
                setView("4");
                System.out.println(value);
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("5");
                setView("5");
                System.out.println(value);
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("6");
                setView("6");
                System.out.println(value);
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("7");
                setView("7");
                System.out.println(value);
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("8");
                setView("8");
                System.out.println(value);
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue("9");
                setView("9");
                System.out.println(value);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Double.parseDouble(value);
                resetValue();
                resetView();
                operator = true;
                statusPlus = true;
                //setView("+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Double.parseDouble(value);
                resetView();
                resetValue();
                operator = true;
                statusMinus = true;
                //setView("-");
            }
        });

        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Double.parseDouble(value);
                resetView();
                resetValue();
                operator = true;
                statusTimes = true;
                //setView("*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstValue = Double.parseDouble(value);
                resetView();
                resetValue();
                operator = true;
                statusDivide = true;
                //setView("/");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondValue = Double.parseDouble(value);
                setResult();
                System.out.println(firstValue);
                System.out.println(secondValue);
                System.out.println(result);
                resetView();
                setView(Double.toString(result));
                resetAll();
                operator = true;
            }
        });

        buttonComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue(".");
                setView(".");
                System.out.println(value);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetView();
                resetAll();
            }
        });

    }

    public void setView(String v){
        System.out.println("sebelum"+operator);

        if(valueView !=null){
            if(operator){
                valueView.setText(""+v);
                operator = false;
            }
            else {
                valueView.setText(valueView.getText()+v);
            }
        }
        else{
            valueView.setText(""+v);
        }

        System.out.println("sesudah"+operator);
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
        value = null;
    }

    public void setValue(String number){
        if(valueView==null){
            value = number;
        }else{
            value = valueView.getText().toString()+number;
        }
    }

    public void setResult(){
        System.out.println(statusPlus);
        System.out.println(statusMinus);
        System.out.println(statusTimes);
        System.out.println(statusDivide);

        if(statusPlus){
            result = firstValue + secondValue;
            statusPlus = false;
        }
        if(statusMinus){
            result = firstValue - secondValue;
            statusMinus = false;
        }
        if(statusTimes){
            result = firstValue * secondValue;
            statusTimes = false;
        }
        if(statusDivide){
            result = firstValue / secondValue;
            statusDivide = false;
        }
    }

}
