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

    String mates_s = et1_m.getText().toString();
    String fisica_s = et1_f.getText().toString();
    String quimica_s = et1_q.getText().toString();

    int mates_int = Integer.parseInt(mates_s);
    int fisica_int = Integer.parseInt(fisica_s);
    int quimica_int = Integer.parseInt(quimica_s);

    int promedio = (mates_int + fisica_int + quimica_int) / 3;

    // hacemos las comprobaciones

    if (promedio > 5){
        tv_e.setText("Estatus aprobado con " + promedio);
    }
    else tv_e.setText("Estatus suspenso con " + promedio);

    //prueba






}




}
