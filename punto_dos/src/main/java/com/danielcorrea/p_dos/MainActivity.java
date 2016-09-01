package com.danielcorrea.p_dos;

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

    EditText eTo, eSubject, eMessage;
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
        eMessage = (EditText) findViewById(R.id.eMessage);
        bSend = (Button) findViewById(R.id.bSend);
        radioGr = (RadioGroup) findViewById(R.id.radioGr);
        radio0 = (RadioButton) findViewById(R.id.radio0);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);

        bSend.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


                    float to,subject;
                    float message=0;


                    // Is the button now checked?
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




                switch(aux) {
                    case 0:

                        message = to + subject;
                        break;
                    case 1:

                        message = to - subject;
                        break;
                    case 2:

                        message = to * subject;
                        break;
                    case 3:

                        message = to / subject;
                        break;

                }


                /*if (radio0.isChecked()){
                    message = to + subject;
                }
                if (radio1.isChecked()){
                    message = to - subject;
                }
                if (radio2.isChecked()){
                    message = to * subject;
                }
                if (radio3.isChecked()){
                    message = to / subject;
                }*/
                    // Check which radio button was clicked
                    /*switch(radioGr.getCheckedRadioButtonId()) {
                        case R.id.radio0:

                                message = to + subject;
                                break;
                        case R.id.radio1:

                                message = to - subject;
                                break;
                        case R.id.radio2:

                                message = to * subject;
                                break;
                        case R.id.radio3:

                                message = to / subject;
                                break;

                    }*/






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
                }
                break;
            case R.id.radio1:
                if (marcado) {
                    aux = 1;
                }
                break;
            case R.id.radio2:
                if (marcado) {
                    aux = 2;
                }
                break;
            case R.id.radio3:
                if (marcado) {
                    aux = 3;
                }
                break;

        }
    }
}