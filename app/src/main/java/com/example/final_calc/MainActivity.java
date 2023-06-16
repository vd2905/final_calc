package com.example.final_calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn00,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSum,btnSub,btnMulti,btnDiv,btnEqual,btnPer,btnPoint,btnClear,btnAc;

    TextView txt1;

    float n1,n2;

    boolean sum,sub,multi,div,per;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.txt1);

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
                txt1.setText(txt1.getText()+"00");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"9");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+".");
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt1==null)
                {
                    txt1.setText("");
                }
                else
                {
                    n1=Float.parseFloat(txt1.getText()+"");
                    sum=true;
                    txt1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt1==null)
                {
                    txt1.setText("");
                }
                else
                {
                    n1=Float.parseFloat(txt1.getText()+"");
                    sub=true;
                    txt1.setText(null);
                }
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt1==null)
                {
                    txt1.setText("");
                }
                else
                {
                    n1=Float.parseFloat(txt1.getText()+"");
                    multi=true;
                    txt1.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt1==null)
                {
                    txt1.setText("");
                }
                else
                {
                    n1=Float.parseFloat(txt1.getText()+"");
                    div=true;
                    txt1.setText(null);
                }
            }
        });
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt1==null)
                {
                    txt1.setText("");
                }
                else
                {
                    n1=Float.parseFloat(txt1.getText()+"");
                    per=true;
                    txt1.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2=Float.parseFloat(txt1.getText()+"");
                if(sum==true)
                {
                    txt1.setText(n1+n2+"");
                    sum=false;
                }
                if(sub==true)
                {
                    txt1.setText(n1-n2+"");
                    sub=false;
                }
                if(multi==true)
                {
                    txt1.setText(n1*n2+"");
                    multi=false;
                }
                if(div==true)
                {
                    txt1.setText(n1/n2+"");
                    div=false;
                }
                if(per==true)
                {
                    txt1.setText(n1%n2+"");
                    per=false;
                }

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
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
