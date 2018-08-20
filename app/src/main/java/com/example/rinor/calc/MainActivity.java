package com.example.rinor.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText first_num,second_num;
    TextView rezultati;
    Button sum,subt,mult,div,fact,pow,res,nje,dy,tre,kate,pese,gjashte,shtate,tete,nente,zero;
    double result;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         first_num = (EditText)findViewById(R.id.numri_pare);
         second_num = (EditText)findViewById(R.id.numri_dyte);
         rezultati = (TextView)findViewById(R.id.rezultati);
         sum = (Button)findViewById(R.id.sum);
         subt = (Button)findViewById(R.id.subt);
         mult = (Button)findViewById(R.id.multiply);
         div = (Button)findViewById(R.id.divide);
         fact = (Button)findViewById(R.id.fact);
         pow = (Button)findViewById(R.id.pow);
         res = (Button)findViewById(R.id.result_button);
         nje = (Button)findViewById(R.id.nje);
        dy = (Button)findViewById(R.id.dy);
        tre = (Button)findViewById(R.id.tre);
        kate = (Button)findViewById(R.id.kater);
        pese = (Button)findViewById(R.id.pese);
        gjashte = (Button)findViewById(R.id.gjashte);
        shtate = (Button)findViewById(R.id.shtate);
        tete = (Button)findViewById(R.id.tete);
        nente = (Button)findViewById(R.id.nente);
        zero = (Button)findViewById(R.id.zero);


            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    first_num.setText(first_num.getText().toString() + "0");
                }
            });

        nje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "1");
            }
        });
        dy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "2");
            }
        });
        tre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "3");
            }
        });
        kate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "4");
            }
        });
        pese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "5");
            }
        });
        gjashte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "6");
            }
        });
        shtate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "7");
            }
        });
        tete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "8");
            }
        });
        nente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText(first_num.getText().toString() + "9");
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(first_num.getText().toString());
                n2 = Integer.parseInt(second_num.getText().toString());
                result = n1 + n2;
                rezultati.setText(String.valueOf(result));

            }
        });
        subt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(first_num.getText().toString());
                n2 = Integer.parseInt(second_num.getText().toString());
                result = n1 - n2;
                rezultati.setText(String.valueOf(result));

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(first_num.getText().toString());
                n2 = Integer.parseInt(second_num.getText().toString());
                result = n1 * n2;
                rezultati.setText(String.valueOf(result));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(first_num.getText().toString());
                n2 = Integer.parseInt(second_num.getText().toString());
                result = n1 / n2;
                rezultati.setText(String.valueOf(result));

            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(first_num.getText().toString());
                n2 = Integer.parseInt(second_num.getText().toString());
                result = 1;

                while (n2!=0) {
                    result *= n1;
                    --n2;
                }
                rezultati.setText(String.valueOf(result));
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(first_num.getText().toString());
                  int i,resulti = 1;
                  for (i=1;i<=n1;i++)
                  {
                      resulti = resulti*i;
                  }
                      rezultati.setText(String.valueOf(resulti));

            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num.setText("");
                second_num.setText("");
                rezultati.setText("");
            }
        });


    }

}
