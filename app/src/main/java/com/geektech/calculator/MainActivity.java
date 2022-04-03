package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer first, second;
    private Boolean isOperationClick;
    private String oriation;
    private Button nextbotton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
nextbotton = findViewById(R.id.btn_next);
nextbotton.setVisibility(View.GONE);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:

                tvResult.setText("1");




                break;
            case R.id.btn_two:
                tvResult.setText("2");


                break;
            case R.id.btn_three:
                tvResult.setText("3");


                break;
            case R.id.btn_fhour:
                tvResult.setText("4");


                break;
            case R.id.btn_five:
            tvResult.setText("5");


            break;
            case R.id.btn_six:
                tvResult.setText("6");


                break;
            case R.id.btn_seven:
                tvResult.setText("7");


                break;
            case R.id.btn_eight:
                tvResult.setText("8");


                break;
            case R.id.btn_nine:
                tvResult.setText("9");


                break;
            case R.id.btn_zero:
                tvResult.setText("0");


                break;
            case R.id.btn_tochka:
                tvResult.setText(".");


                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                first = 0;
                second = 0;
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                    oriation = "+";

                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_minus:
                oriation = "-";

                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_multiplacation:
                oriation = "x";

                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_division:
                oriation = "/";

                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_precent:
                oriation = "%";

                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_plusminus:
                oriation = "+/-";

                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;


            case R.id.btn_equal:
                second = Integer.parseInt(tvResult.getText().toString());
                Integer result = 0;

                if(isOperationClick = true){
                   nextbotton.setVisibility(View.VISIBLE);
                }
                nextbotton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        intent.putExtra("Key", tvResult.getText().toString());
                        startActivity(intent);
                        finishActivity(123);
                    }
                });
                switch (oriation){
                    case "+":
                result  = first + second;
                break;
                    case "+/-":
                        result = first - (first * 2);
                        result = second - (second * 2);
                    case "-":
                        result  = first - second;
                        break;
                    case "x":
                        result  = first * second;
                        break;
                    case "/":
                        result  = first / second;
                        break;
                    case "%":
                        result  = (second * 100) / first;
                        break;
                }
                tvResult.setText(result.toString());
                break;
        }

    }
}
