package edu.upc.dsa.jocandroid;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String input, answer;
    private double digit1;
    private double digit2;
    String op;
    Boolean trig;
    private TextView pantalla;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnigual, btnsuma, btnresta, btnmultiplicacion;
    private Button btndivision, btncoseno, btnseno, btngrados, btneliminar, btntang, btnradianes;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = findViewById(R.id.pantalla);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnigual = findViewById(R.id.btnigual);
        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmultiplicacion = findViewById(R.id.btnmultiplicacion);
        btndivision = findViewById(R.id.btndivision);
        btncoseno = findViewById(R.id.btncoseno);
        btnseno = findViewById(R.id.btnseno);
        btngrados = findViewById(R.id.btngrados);
        btneliminar = findViewById(R.id.btneliminar);
        btntang = findViewById(R.id.btntang);
        btnradianes = findViewById(R.id.btnradianes);
        answer = "";
        input = "";
        digit1 = 0.0;
        digit2 = 0.0;
        op = "";
        trig = false;
    }
    public void ButtonClick(View view) {
        Button button = (Button) view;
        String data = button.getText().toString();
        switch (data) {
            case "0":
                input += "0";
                break;
            case "1":
                input += "1";
                break;
            case "2":
                input += "2";
                break;
            case "3":
                input += "3";
                break;
            case "4":
                input += "4";
                break;
            case "5":
                input += "5";
                break;
            case "6":
                input += "6";
                break;
            case "7":
                input += "7";
                break;
            case "8":
                input += "8";
                break;
            case "9":
                input += "9";
                break;
            case "+":
                trig = false;
                operation();
                op = "+";
                break;
            case "-":
                trig = false;
                operation();
                op = "-";
                break;
            case "X":
                trig = false;
                operation();
                op = "X";
                break;
            case "/":
                trig = false;
                operation();
                op = "/";
                break;
            case "=":
                trig = false;
                solve(op);
                input = answer;
                break;
            case "eliminar":
                input = "";
                digit1 = 0.0;
                digit2 = 0.0;
                answer = "";
                op = "";
                trig = false;
                break;
            case "cos":
                trig = true;
                solveTrig("cos");
                input = answer;
                break;
            case "sen":
                trig = true;
                solveTrig("sen");
                input = answer;
                break;
            case "tan":
                trig = true;
                solveTrig("tan");
                input = answer;
                break;
            case "rad":
                solveTrig("rad");
                input = answer;
                break;
            case "deg":
                solveTrig("deg");
                input = answer;
                break;
            default:
                if (input == null) {
                    input = "";
                }

        }
        pantalla.setText(input);
    }
    private void operation(){
        if (op.compareTo("")==0){
            digit1 = Double.parseDouble(input);
        }
        else
            digit2 = Double.parseDouble(input);
        input = "";
        pantalla.setText(input);
    }
    private void solve(String s){
        double res;
        if (op.compareTo("") == 0) {
            digit1 = Double.parseDouble(input);
        }
        else
            digit2 = Double.parseDouble(input);

        switch (s) {
            case "+":
                res = digit1 + digit2;
                answer = String.valueOf(res);
                break;
            case "-":
                res = digit1 - digit2;
                answer = String.valueOf(res);
                break;
            case "X":
                res = digit1 * digit2;
                answer = String.valueOf(res);
                break;
            case "/":
                res = digit1 / digit2;
                answer = String.valueOf(res);
                break;


        }

    }
    private void solveTrig(String s) {
        double res;
        digit1 = Double.parseDouble(input);

        switch (s) {
            case "cos":
                res = Math.cos(digit1);
                answer = String.valueOf(res);
                break;
            case "sen":
                res = Math.sin(digit2);
                answer = String.valueOf(res);
                break;
            case "tan":
                res = Math.tan(digit1);
                answer = String.valueOf(res);
                break;
            case "rad":
                if(trig)
                {
                    res = Math.toRadians(digit1);
                    answer = String.valueOf(res);
                }
                break;
            case "deg":
                if(trig)
                {
                    res = Math.toDegrees(digit1);
                    answer = String.valueOf(res);
                }
                break;
        }
    }

}