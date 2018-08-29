package com.example.root.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText e1;
private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsum,bsub,bmul,bdiv,beq,clear;
int val1,val2;
boolean sum,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.x);
        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        b0=findViewById(R.id.zero);
        bsum=findViewById(R.id.sum);
        bsub=findViewById(R.id.sub);
        bmul=findViewById(R.id.mul);
        bdiv=findViewById(R.id.div);
        beq=findViewById(R.id.equal);
        clear=findViewById(R.id.clear);
        onClickFunc();
    }
    public void onClickFunc(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"0");
            }
        });
        bsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               val1=Integer.parseInt(e1.getText()+"");
               sum=true;
               e1.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(e1.getText()+"");
                sub=true;
                e1.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(e1.getText()+"");
                mul=true;
                e1.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(e1.getText()+"");
                div=true;
                e1.setText(null);
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sum == true) {

                    val2 = Integer.parseInt(e1.getText() + "");
                    e1.setText(val1+val2+"");
                }
                if(sub==true){
                    val2 = Integer.parseInt(e1.getText() + "");
                    e1.setText(val1-val2+"");
                }
                if(mul==true){
                    val2 = Integer.parseInt(e1.getText() + "");
                    e1.setText(val1*val2+"");
                }
                if(div==true){
                    val2 = Integer.parseInt(e1.getText() + "");
                    e1.setText(val1/val2+"");
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
            }
        });
    }
}
