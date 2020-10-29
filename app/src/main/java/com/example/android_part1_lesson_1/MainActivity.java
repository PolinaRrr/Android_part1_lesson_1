package com.example.android_part1_lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public TextView getResult() {
        TextView result = (TextView) findViewById(R.id.result);
        return result;
    }


    public int getFirstOperand() throws Exception {
        EditText el1 = (EditText) findViewById(R.id.num1);
        String num1 = el1.getText().toString();

        if (!num1.equals("")) {
            return Integer.parseInt(num1);
        } else {
            throw new Exception("Введите оба числа");
        }
    }

    public int getSecondOperand() throws Exception {
        EditText el2 = (EditText) findViewById(R.id.num2);
        String num2 = el2.getText().toString();
        if (!num2.equals("")) {
            return Integer.parseInt(num2);
        } else {
            throw new Exception("Введите оба числа");
        }

    }

    public void onButtonAddClick(View v) {
        try {
            int add = getFirstOperand() + getSecondOperand();
            getResult().setText(Integer.toString(add));
        } catch (Exception e) {
            getResult().setText(e.getMessage());
        }
    }

    public void onButtonSubClick(View v) {
        try {
            int sub = getFirstOperand() - getSecondOperand();
            getResult().setText(Integer.toString(sub));
        } catch (Exception e) {
            getResult().setText(e.getMessage());
        }

    }

    public void onButtonMultiClick(View v) {
        try {
            int multi = getFirstOperand() * getSecondOperand();
            getResult().setText(Integer.toString(multi));
        } catch (Exception e) {
            getResult().setText(e.getMessage());
        }

    }

    public void onButtonDivClick(View v) {
        try {
            if (getSecondOperand() != 0) {
                int div = getFirstOperand() / getSecondOperand();
                getResult().setText(Integer.toString(div));
            } else {
                getResult().setText("На ноль делить нельзя");
            }

        } catch (Exception e) {
            getResult().setText(e.getMessage());
        }

    }

}