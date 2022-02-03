package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Boolean isOperationClick;
    private float firstVar;
    private float secondVar;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                //клик на единицу
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("1");
                }else if (isOperationClick){
                    tvResult.setText("1");
                }else {
                    tvResult.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_two:
                //клик на двойку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("2");
                }else if (isOperationClick){
                    tvResult.setText("2");
                }else {
                    tvResult.append("2");
                }
                isOperationClick = false;
                break;

            case R.id.btn_three:
                //клик на тройку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("3");
                }else if (isOperationClick){
                    tvResult.setText("3");
                }else {
                    tvResult.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.btn_four:
                //клик на тройку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("4");
                }else if (isOperationClick){
                    tvResult.setText("4");
                }else {
                    tvResult.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.btn_five:
                //клик на тройку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("5");
                }else if (isOperationClick){
                    tvResult.setText("5");
                }else {
                    tvResult.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.btn_six:
                //клик на тройку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("6");
                }else if (isOperationClick){
                    tvResult.setText("6");
                }else {
                    tvResult.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.btn_seven:
                //клик на тройку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("7");
                }else if (isOperationClick){
                    tvResult.setText("7");
                }else {
                    tvResult.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.btn_eight:
                //клик на тройку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("8");
                }else if (isOperationClick){
                    tvResult.setText("8");
                }else {
                    tvResult.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.btn_nine:
                //клик на тройку
                if (tvResult.getText().toString().equals("0")){
                    tvResult.setText("9");
                }else if (isOperationClick){
                    tvResult.setText("9");
                }else {
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;

            case R.id.btn_clear:
                //клик на очистку
                tvResult.setText("0");
                firstVar = 0;
                secondVar = 0;
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                //клик на плюс
                operation = "+";
                isOperationClick = true;
                //
                firstVar = Integer.parseInt(tvResult.getText().toString());
                break;
            case R.id.btn_divide:
                //клик на деление
                operation = "/";
                isOperationClick = true;
                //
                firstVar = Integer.parseInt(tvResult.getText().toString());
                break;
            case R.id.btn_times:
                //клик на плюс
                operation = "*";
                isOperationClick = true;
                //
                firstVar = Integer.parseInt(tvResult.getText().toString());
                break;
            case R.id.btn_minus:
                operation = "-";
                isOperationClick = true;
                firstVar = Integer.parseInt(tvResult.getText().toString());
                break;
            case R.id.btn_equal:
                //клик на равно
                isOperationClick = true;
                //21
                secondVar = Integer.parseInt(tvResult.getText().toString());
                float result = 0;
                switch (operation){
                    case "+":
                        result = firstVar + secondVar;
                        break;
                    case "-":
                        result = firstVar - secondVar;
                        break;
                    case "*":
                        result = firstVar * secondVar;
                        break;
                    case "/":
                        result = firstVar / secondVar;
                        break;
                }
                tvResult.setText(result+"");
                break;
        }
    }
}