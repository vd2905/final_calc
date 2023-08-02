package com.example.final_calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button btn00,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSum,btnSub,btnMulti,btnDiv,btnEqual,btnPer,btnPoint,btnClear,btnAc;
    TextView txt1,txt2;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);

        btn00=findViewById(R.id.btn00);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btnSum=findViewById(R.id.btnSum);
        btnSub=findViewById(R.id.btnSub);
        btnMulti=findViewById(R.id.btnMulti);
        btnDiv=findViewById(R.id.btnDiv);
        btnPer=findViewById(R.id.btnPer);
        btnEqual=findViewById(R.id.btnEqual);
        btnPoint=findViewById(R.id.btnPoint);
        btnClear=findViewById(R.id.btnClear);
        btnAc=findViewById(R.id.btnAc);

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"00");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+"9");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=txt1.getText().toString();
                txt1.setText(data+".");
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt1.getText().toString();
                txt1.setText(data + "+");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt1.getText().toString();
                txt1.setText(data + "-");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt1.getText().toString();
                txt1.setText(data + "*");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt1.getText().toString();
                txt1.setText(data + "/");
            }
        });
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = txt1.getText().toString();
                txt1.setText(data + "%");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = txt1.getText().toString();

                data=data.replaceAll("×","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("÷","/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult="";

                Scriptable scriptable=rhino.initStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data,"Javsscript",1,null).toString();

                txt2.setText(finalResult);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
                txt2.setText("");
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=txt1.getText().toString();
                if(res.length()>0)
                {
                    res=res.substring(0,res.length()-1);
                    txt1.setText(res);
                }
            }
        });

    }

}
