package com.example.p_tres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTo, eSubject, eMessage, elado, eradio;
    Button bSend;
    RadioGroup radioGr;
    RadioButton radio0,radio1,radio2,radio3;
    int aux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTo = (EditText) findViewById (R.id.eTo);
        eSubject = (EditText) findViewById (R.id.eSubject);
        elado = (EditText) findViewById (R.id.elado);
        eradio = (EditText) findViewById (R.id.eradio);
        eMessage = (EditText) findViewById(R.id.eMessage);
        bSend = (Button) findViewById(R.id.bSend);
        radioGr = (RadioGroup) findViewById(R.id.radioGr);
        radio0 = (RadioButton) findViewById(R.id.radio0);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);

        eTo.setVisibility(View.INVISIBLE);
        eSubject.setVisibility(View.INVISIBLE);
        elado.setVisibility(View.INVISIBLE);
        eradio.setVisibility(View.INVISIBLE);

        bSend.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


                float to=0,subject=0,lado=0,radio=0;
                float message=0;


                if(TextUtils.isEmpty(eTo.getText().toString())){
                    to=0;
                }else {
                    to = Float.parseFloat(eTo.getText().toString());
                }
                if(TextUtils.isEmpty(eSubject.getText().toString())){
                    subject=0;
                }else{
                    subject = Float.parseFloat(eSubject.getText().toString());
                }
                if(TextUtils.isEmpty(elado.getText().toString())){
                    lado=0;
                }else {
                    lado = Float.parseFloat(elado.getText().toString());
                }
                if(TextUtils.isEmpty(eradio.getText().toString())){
                    radio=0;
                }else{
                    radio = Float.parseFloat(eradio.getText().toString());
                }

                switch(aux) {
                    case 0:

                        message = lado*lado;
                        break;
                    case 1:

                        message = (to*subject)/2;
                        break;
                    case 2:

                        message = to * subject;
                        break;
                    case 3:

                        message = radio*radio*(float)Math.PI;
                        break;

                }






                eMessage.setText(String.valueOf(message)); //opcion1
                //eMessage.setText(Float.toString(message));

            }
        });

    }

    public void onRadioButtonClicked(View view) {
        boolean marcado = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio0:
                if (marcado) {
                    aux = 0;
                    eTo.setVisibility(View.INVISIBLE);
                    eSubject.setVisibility(View.INVISIBLE);
                    elado.setVisibility(View.VISIBLE);
                    eradio.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.radio1:
                if (marcado) {
                    aux = 1;
                    eTo.setVisibility(View.VISIBLE);
                    eSubject.setVisibility(View.VISIBLE);
                    elado.setVisibility(View.INVISIBLE);
                    eradio.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.radio2:
                if (marcado) {
                    aux = 2;
                    eTo.setVisibility(View.VISIBLE);
                    eSubject.setVisibility(View.VISIBLE);
                    elado.setVisibility(View.INVISIBLE);
                    eradio.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.radio3:
                if (marcado) {
                    aux = 3;
                    eTo.setVisibility(View.INVISIBLE);
                    eSubject.setVisibility(View.INVISIBLE);
                    elado.setVisibility(View.INVISIBLE);
                    eradio.setVisibility(View.VISIBLE);
                }
                break;

        }
    }
}