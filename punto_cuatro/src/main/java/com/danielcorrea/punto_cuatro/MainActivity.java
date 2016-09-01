package com.danielcorrea.punto_cuatro;
import java.util.ArrayList;
import java.util.List;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
public class MainActivity extends AppCompatActivity {

    EditText eTo, eSubject, eMessage, elado;
    Button bSend;
    RadioGroup radioGr;
    RadioButton radio0,radio1;
    DatePicker edate;
    Spinner spinner1;
    String city;
    CheckBox cdepo,clecto,carte,cgames;
    String Sex,log,pas,corr,pas1;
    List<String> hobbi ;
    TextView salida;
    Calendar calendar;
     TextView dateView,hobbis,citi,mail,pass,logg;
     int year, month, day,aux=1,aux2=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        eTo = (EditText) findViewById (R.id.eTo);
        eSubject = (EditText) findViewById (R.id.eSubject);
        elado = (EditText) findViewById (R.id.elado);
        edate = (DatePicker) findViewById (R.id.edate);
        eMessage = (EditText) findViewById(R.id.eMessage);
        bSend = (Button) findViewById(R.id.bSend);
        radioGr = (RadioGroup) findViewById(R.id.radioGr);
        radio0 = (RadioButton) findViewById(R.id.radio0);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        cdepo = (CheckBox) findViewById(R.id.cdepo);
        carte = (CheckBox) findViewById(R.id.carte);
        clecto = (CheckBox) findViewById(R.id.clecto);
        cgames = (CheckBox) findViewById(R.id.cgames);
        salida = (TextView) findViewById(R.id.salida);
        logg = (TextView) findViewById(R.id.logg);
        pass = (TextView) findViewById(R.id.pass);
        hobbis = (TextView) findViewById(R.id.hobbis);
        mail = (TextView) findViewById(R.id.mail);
        citi = (TextView) findViewById(R.id.citi);

        dateView = (TextView) findViewById(R.id.dateview);

        year = edate.getDayOfMonth();

        month = edate.getMonth();
        day =edate.getYear();

        citi.setVisibility(View.INVISIBLE);
        List<String> list = new ArrayList<String>();
        list.add("Medellin");
        list.add("Cali");
        list.add("Manizales");
        list.add("Pereira");
        list.add("Bogota");
        list.add("Barranquilla");

       /* ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,list);

        dataAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(dataAdapter);

        // Spinner item selection Listener
        addListenerOnSpinnerItemSelection();*/


        bSend.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {




               /* spinner1 = (Spinner) findViewById(R.id.spinner1);
                if(TextUtils.isEmpty(eMessage.getText().toString())){
                   Toast.makeText(MainActivity.this, "No ha Ingresado nombre de usuario", Toast.LENGTH_SHORT).show();
                }else {
                    log = eMessage.getText().toString();
                    if(TextUtils.isEmpty(eTo.getText().toString())){
                        Toast.makeText(MainActivity.this, "No ha Ingresado contraseña", Toast.LENGTH_SHORT).show();
                    }else {
                        pas =eTo.getText().toString();
                        if(TextUtils.isEmpty(eSubject.getText().toString())){
                            Toast.makeText(MainActivity.this, "No ha Ingresado contraseña", Toast.LENGTH_SHORT).show();
                        }else{
                            pas1 = (eSubject.getText().toString());
                            if(pas!=pas1){
                                Toast.makeText(MainActivity.this, "Las contraseñas no coinsiden", Toast.LENGTH_SHORT).show();
                            }else{

                                if(TextUtils.isEmpty(elado.getText().toString())){
                                    Toast.makeText(MainActivity.this, "No ha ingresado correo", Toast.LENGTH_SHORT).show();
                                }else {
                                    corr = (elado.getText().toString());
                                    if(aux2==1){
                                        Toast.makeText(MainActivity.this, "No ha ingresado el genero", Toast.LENGTH_SHORT).show();
                                    }else{
                                        if(aux==1){
                                            Toast.makeText(MainActivity.this, "No ha ingresado la ciudad", Toast.LENGTH_SHORT).show();
                                        }else{
                                            logg.setText(log);
                                            pass.setText(pas);
                                            mail.setText(corr);
                                            salida.setText(Sex);
                                            dateView.setText(new StringBuilder().append(day).append("/")
                                                    .append(month).append("/").append(year));
                                            citi.setVisibility(View.VISIBLE);
                                            hobbis.setText(hobbi.toString());
                                        }
                                    }
                                }






                            }

                        }


                    }

                }




                 //opcion1
                //eMessage.setText(Float.toString(message));
*/
            }
        });

    }

    /*public void addListenerOnSpinnerItemSelection(){

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                aux=0;
                city = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                aux=1;
            }
        });
    }*/


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        hobbi = new ArrayList<String>();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.cdepo:
                if (checked)
                    hobbi.add("Deportes");



            case R.id.clecto:
                if (checked)
                    hobbi.add("Lectura");

            case R.id.carte:
                if (checked)
                    hobbi.add("Arte");


            case R.id.cgames:
                if (checked)
                    hobbi.add("Video Juegos");


        }
    }

    public void onRadioButtonClicked(View view) {
        boolean marcado = ((RadioButton) view).isChecked();
        aux2=1;
        switch(view.getId()) {
            case R.id.radio0:
                if (marcado) {
                    aux2=0;
                   Sex="Hombre";

                }
                break;
            case R.id.radio1:
                if (marcado) {
                    aux2=0;
                    Sex="Mujer";

                }
                break;


        }
    }
}


