package com.example.carlos.cursoandroidgeekipedia_miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1_m;
    private EditText et1_f;
    private EditText et1_q;
    private TextView tv_e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    et1_m = findViewById(R.id.et1_mates);
    et1_f = findViewById(R.id.et2_fisica);
    et1_q = findViewById(R.id.et3_quimica);
    tv_e = findViewById(R.id.tv_estatus);

    }

public void estatus(View view){

    String mates = et1_m.getText().toString();
    String fisica = et1_f.getText().toString();
    String quimica = et1_q.getText().toString();



}




}
