package com.example.marlon.calculodenotas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    private EditText et4, et5, et6, et8, et9, et10, et12, et13, et14, et20, et21, et22;
    private TextView txt1, txt2, txt3, txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SharedPreferences prefe1 = getSharedPreferences("Desarrollo", Context.MODE_PRIVATE);
        et4 = (EditText) findViewById(R.id.et4);
        et4.setText(prefe1.getString("primer", ""));
        et5 = (EditText) findViewById(R.id.et5);
        et5.setText(prefe1.getString("segundo", ""));
        et6 = (EditText) findViewById(R.id.et6);
        et6.setText(prefe1.getString("tercer", ""));


        txt1=(TextView)findViewById(R.id.txt1);
        txt1.setText(prefe1.getString("resul","0"));
        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1 = getSharedPreferences("Desarrollo", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefe1.edit();
                    String t11 = et4.getText().toString();
                    editor.putString("primer", et4.getText().toString());
                    String t12 = et5.getText().toString();
                    String t13 = et6.getText().toString();

                    double n11 = Double.valueOf(t11);
                    double n12 = Double.valueOf(t12);
                    double n13 = Double.valueOf(t13);
                    if (n11 >= 0 && n11 < 6) {

                        double cal = (((n11 + n12) / 2) * 0.6) + (n13 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt1.setText(resul);
                    } else {
                        Toast noti1 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti1), Toast.LENGTH_LONG);
                        noti1.show();
                    }
                }catch (Exception e)
                {


                }}

        });
        et5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t11=et4.getText().toString();
                    String t12=et5.getText().toString();
                    editor.putString("segundo", et5.getText().toString());
                    String t13=et6.getText().toString();

                    double n11=Double.valueOf(t11);
                    double n12=Double.valueOf(t12);
                    double n13=Double.valueOf(t13);
                    if (n11 >= 0 && n11 < 6) {

                        double cal = (((n11 + n12) / 2) * 0.6) + (n13 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt1.setText(resul);
                    } else {
                        Toast noti1 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti1), Toast.LENGTH_LONG);
                        noti1.show();
                    }
                }catch (Exception e)
                {


                }}

        });

        et6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t11=et4.getText().toString();
                    String t12=et5.getText().toString();
                    String t13=et6.getText().toString();
                    editor.putString("tercer", et6.getText().toString());

                    double n11=Double.valueOf(t11);
                    double n12=Double.valueOf(t12);
                    double n13=Double.valueOf(t13);
                    if (n11 >= 0 && n11 < 6) {

                        double cal = (((n11 + n12) / 2) * 0.6) + (n13 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt1.setText(resul);
                    } else {
                        Toast noti1 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti1), Toast.LENGTH_LONG);
                        noti1.show();
                    }
                }catch (Exception e)
                {


                }}

        });
        //segunda materia

        SharedPreferences prefe2 = getSharedPreferences("Distribuidos", Context.MODE_PRIVATE);
        et8 = (EditText) findViewById(R.id.et8);
        et8.setText(prefe2.getString("primer", ""));
        et9 = (EditText) findViewById(R.id.et9);
        et9.setText(prefe2.getString("segundo", ""));
        et10 = (EditText) findViewById(R.id.et10);
        et10.setText(prefe2.getString("tercer", ""));

        txt2=(TextView)findViewById(R.id.txt2);
        txt2.setText(prefe2.getString("resul1","0"));
        et8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("Distribuidos",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t21=et8.getText().toString();
                    editor.putString("primer", et8.getText().toString());
                    String t22=et9.getText().toString();
                    String t23=et10.getText().toString();

                    double n21=Double.valueOf(t21);
                    double n22=Double.valueOf(t22);
                    double n23=Double.valueOf(t23);
                    if (n21 >= 0 && n21 < 6) {

                        double cal = (((n21 + n22) / 2) * 0.6) + (n23 * 0.4);
                        String resul1 = Double.toString(cal);
                        editor.putString("resul1", resul1);

                        editor.commit();
                        txt2.setText(resul1);
                    } else {
                        Toast noti4 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti4), Toast.LENGTH_LONG);
                        noti4.show();
                    }
                }catch (Exception e)
                {


                }}

        });
        et9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("Distribuidos",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t21=et8.getText().toString();
                    editor.putString("segundo", et9.getText().toString());
                    String t22=et9.getText().toString();

                    String t23=et10.getText().toString();

                    double n21=Double.valueOf(t21);
                    double n22=Double.valueOf(t22);
                    double n23=Double.valueOf(t23);
                    if (n21 >= 0 && n21 < 6) {

                        double cal = (((n21 + n22) / 2) * 0.6) + (n23 * 0.4);
                        String resul1 = Double.toString(cal);
                        editor.putString("resul1", resul1);

                        editor.commit();
                        txt2.setText(resul1);
                    } else {
                        Toast noti4 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti4), Toast.LENGTH_LONG);
                        noti4.show();
                    }
                }catch (Exception e)
                {


                }}

        });

        et10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("Distribuidos",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t21=et8.getText().toString();
                    String t22=et9.getText().toString();
                    String t23=et10.getText().toString();
                    editor.putString("tercer", et10.getText().toString());

                    double n21=Double.valueOf(t21);
                    double n22=Double.valueOf(t22);
                    double n23=Double.valueOf(t23);
                    if (n21 >= 0 && n21 < 6) {

                        double cal = (((n21 + n22) / 2) * 0.6) + (n23 * 0.4);
                        String resul1 = Double.toString(cal);
                        editor.putString("resul1", resul1);

                        editor.commit();
                        txt1.setText(resul1);
                    } else {
                        Toast noti4 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti4), Toast.LENGTH_LONG);
                        noti4.show();
                    }
                }catch (Exception e)
                {


                }}

        });

        //Materia tres

        SharedPreferences prefe3 = getSharedPreferences("Calculo", Context.MODE_PRIVATE);
        et12 = (EditText) findViewById(R.id.et12);
        et12.setText(prefe3.getString("primer", ""));
        et13 = (EditText) findViewById(R.id.et13);
        et13.setText(prefe3.getString("segundo", ""));
        et14 = (EditText) findViewById(R.id.et14);
        et14.setText(prefe3.getString("tercer", ""));

        txt3=(TextView)findViewById(R.id.txt3);
        txt3.setText(prefe3.getString("resul2","0"));
        et12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Calculo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();
                    String t31=et12.getText().toString();
                    editor.putString("primer", et12.getText().toString());
                    String t32=et13.getText().toString();
                    String t33=et14.getText().toString();

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);
                    if (n31 >= 0 && n31 < 6) {

                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul2 = Double.toString(cal);
                        editor.putString("resul2", resul2);

                        editor.commit();
                        txt3.setText(resul2);
                    } else {
                        Toast noti6 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti6), Toast.LENGTH_LONG);
                        noti6.show();
                    }
                }catch (Exception e)
                {


                }}

        });
        et13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Calculo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();
                    String t31=et12.getText().toString();
                    String t32=et13.getText().toString();
                    editor.putString("segundo", et13.getText().toString());
                    String t33=et14.getText().toString();

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);
                    if (n31 >= 0 && n31 < 6) {

                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul2 = Double.toString(cal);
                        editor.putString("resul2", resul2);

                        editor.commit();
                        txt3.setText(resul2);
                    } else {
                        Toast noti6 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti6), Toast.LENGTH_LONG);
                        noti6.show();
                    }
                }catch (Exception e)
                {


                }}

        });

        et14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Calculo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();
                    String t31=et12.getText().toString();
                    String t32=et13.getText().toString();
                    String t33=et14.getText().toString();
                    editor.putString("tercer", et14.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);
                    if (n31 >= 0 && n31 < 6) {

                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul2 = Double.toString(cal);
                        editor.putString("resul2", resul2);

                        editor.commit();
                        txt1.setText(resul2);
                    } else {
                        Toast noti6 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti6), Toast.LENGTH_LONG);
                        noti6.show();
                    }
                }catch (Exception e)
                {


                }}

        });
        // Materia cuatro
        final SharedPreferences prefe4 = getSharedPreferences("Calculo1", Context.MODE_PRIVATE);
        et20 = (EditText) findViewById(R.id.et20);
        et20.setText(prefe4.getString("primer", ""));
        et21 = (EditText) findViewById(R.id.et21);
        et21.setText(prefe4.getString("segundo", ""));
        et22 = (EditText) findViewById(R.id.et22);
        et22.setText(prefe4.getString("tercer", ""));

        txt4=(TextView)findViewById(R.id.txt4);
        txt4.setText(prefe4.getString("resul3","0"));
        et20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe4=getSharedPreferences("Calculo1",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe4.edit();
                    String t41=et20.getText().toString();
                    editor.putString("primer", et20.getText().toString());
                    String t42=et21.getText().toString();
                    String t43=et22.getText().toString();

                    double n41=Double.valueOf(t41);
                    double n42=Double.valueOf(t42);
                    double n43=Double.valueOf(t43);
                    if (n41 >= 0 && n41 < 6) {

                        double cal = (((n41 + n42) / 2) * 0.6) + (n43 * 0.4);
                        String resul3 = Double.toString(cal);
                        editor.putString("resul3", resul3);

                        editor.commit();
                        txt4.setText(resul3);
                    } else {
                        Toast noti9 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti9), Toast.LENGTH_LONG);
                        noti9.show();
                    }
                }catch (Exception e)
                {


                }}

        });
        et21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe4=getSharedPreferences("Calculo1",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe4.edit();
                    String t41=et20.getText().toString();
                    String t42=et21.getText().toString();
                    editor.putString("segundo", et21.getText().toString());
                    String t43=et22.getText().toString();

                    double n41=Double.valueOf(t41);
                    double n42=Double.valueOf(t42);
                    double n43=Double.valueOf(t43);
                    if (n41 >= 0 && n41 < 6) {

                        double cal = (((n41 + n42) / 2) * 0.6) + (n43 * 0.4);
                        String resul3 = Double.toString(cal);
                        editor.putString("resul3", resul3);

                        editor.commit();
                        txt4.setText(resul3);
                    } else {
                        Toast noti9 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti9), Toast.LENGTH_LONG);
                        noti9.show();
                    }
                }catch (Exception e)
                {


                }}

        });

        et22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe4=getSharedPreferences("Calculo1",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe4.edit();
                    String t41=et20.getText().toString();
                    String t42=et21.getText().toString();
                    String t43=et22.getText().toString();
                    editor.putString("tercer", et22.getText().toString());

                    double n41=Double.valueOf(t41);
                    double n42=Double.valueOf(t42);
                    double n43=Double.valueOf(t43);
                    if (n41 >= 0 && n41 < 6) {

                        double cal = (((n41 + n42) / 2) * 0.6) + (n43 * 0.4);
                        String resul3 = Double.toString(cal);
                        editor.putString("resul3", resul3);

                        editor.commit();
                        txt4.setText(resul3);
                    } else {
                        Toast noti9 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti9), Toast.LENGTH_LONG);
                        noti9.show();
                    }
                }catch (Exception e) {
                }}

        });


        txt1 = (TextView) findViewById(R.id.txt1);
        txt1.setText(prefe1.getString("resul", ""));
        txt2 = (TextView) findViewById(R.id.txt2);
        txt2.setText(prefe2.getString("resul1", ""));
        txt3 = (TextView) findViewById(R.id.txt3);
        txt3.setText(prefe3.getString("resul2", ""));
        txt4 = (TextView) findViewById(R.id.txt4);
        txt4.setText(prefe4.getString("resul3", ""));



    }

    public void calcular1(View v)
    {


            SharedPreferences preferencias = getSharedPreferences("Desarrollo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferencias.edit();

            String t11 = et4.getText().toString();
            editor.putString("primer", et4.getText().toString());

            String t12 = et5.getText().toString();
            editor.putString("segundo", et5.getText().toString());

            String t13 = et6.getText().toString();
            editor.putString("tercer", et6.getText().toString());

            double n11 = Double.valueOf(t11);
            double n12 = Double.valueOf(t12);
            double n13 = Double.valueOf(t13);

            double cal = (((n11 + n12) / 2) * 0.6) + (n13 * 0.4);
            String resul = Double.toString(cal);
            editor.putString("resul", resul);

            editor.commit();
            txt1.setText(resul);
        }
    public void calcular2(View v)
    {
        SharedPreferences preferencias = getSharedPreferences("Distribuidos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();

        String t21 = et8.getText().toString();
        editor.putString("primer", et8.getText().toString());

        String t22 = et9.getText().toString();
        editor.putString("segundo", et9.getText().toString());

        String t23 = et10.getText().toString();
        editor.putString("tercer", et10.getText().toString());

        double n21 = Double.valueOf(t21);
        double n22 = Double.valueOf(t22);
        double n23 = Double.valueOf(t23);

        double cal = (((n21 + n22) / 2) * 0.6) + (n23 * 0.4);
        String resul2 = Double.toString(cal);
        editor.putString("resul1", resul2);

        editor.commit();
        txt2.setText(resul2);
    }

    public void calcular3(View v)
    {

        SharedPreferences preferencias = getSharedPreferences("Calculo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();

        String t31 = et12.getText().toString();
        editor.putString("primer", et12.getText().toString());

        String t32 = et13.getText().toString();
        editor.putString("segundo", et13.getText().toString());

        String t33 = et14.getText().toString();
        editor.putString("tercer", et14.getText().toString());

        double n31 = Double.valueOf(t31);
        double n32 = Double.valueOf(t32);
        double n33 = Double.valueOf(t33);

        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
        String resul3 = Double.toString(cal);
        editor.putString("resul2", resul3);

        editor.commit();
        txt3.setText(resul3);
    }

    public void calcular4(View v)
    {


        SharedPreferences preferencias = getSharedPreferences("Calculo1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();

        String t41 = et20.getText().toString();
        editor.putString("primer", et20.getText().toString());

        String t42 = et21.getText().toString();
        editor.putString("segundo", et21.getText().toString());

        String t43 = et22.getText().toString();
        editor.putString("tercer", et22.getText().toString());

        double n41 = Double.valueOf(t41);
        double n42 = Double.valueOf(t42);
        double n43 = Double.valueOf(t43);

        double cal = (((n41 + n42) / 2) * 0.6) + (n43 * 0.4);
        String resul4 = Double.toString(cal);
        editor.putString("resul3", resul4);

        editor.commit();
        txt4.setText(resul4);
    }


    public void total(View v) {
        String t1 = txt1.getText().toString();
        String t2 = txt2.getText().toString();
        String t3 = txt3.getText().toString();
        String t4 = txt4.getText().toString();

        double n1 = Double.valueOf(t1);
        double n2 = Double.valueOf(t2);
        double n3 = Double.valueOf(t3);

        double total = (n1 + n2 + n3) / 3;

        Toast noti65 = Toast.makeText(MainActivity.this,getResources().getString(R.string.noti65) + " " + String.format("%.2f", total) , Toast.LENGTH_LONG);
        noti65.show();
    }
    public void acerca(View v)
    {
        Intent i = new Intent(this, acerca.class );
        startActivity(i);
    }
}
