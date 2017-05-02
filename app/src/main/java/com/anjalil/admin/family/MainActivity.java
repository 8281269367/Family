package com.anjalil.admin.family;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.anjalil.admin.family.person.Marriage;
import com.anjalil.admin.family.person.Person;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    protected EditText getName;
    protected EditText getDate;
    protected RadioGroup radioGroup;
    protected RadioButton radioFemale;
    protected RadioButton radioMale;
    protected String gender;
    protected Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person a = new Person("AjithKumar A K",new Date(4),"MALE");
        Person b = new Person("emma watson",new Date((4)),"FEMALE");

        Marriage marriage = new Marriage(a,b,new Date(2017,04,21),"Coavai");
        Log.i("HI",a.getName());
        Toast.makeText(MainActivity.this,marriage.getSpouse(a).getName()+" "+marriage.getSpouse(a).getGender(),Toast.LENGTH_LONG).show();

        getName = (EditText)findViewById(R.id.nameEditText);
        getDate = (EditText)findViewById(R.id.dateEditText);
        radioGroup = (RadioGroup)findViewById(R.id.radioGrp);
        radioFemale = (RadioButton)findViewById(R.id.radioF);
        radioMale = (RadioButton) findViewById(R.id.radioM);
        button  = (Button) findViewById(R.id.submit_btn);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = getName.getText().toString();
                String date = getDate.getText().toString();

                Toast.makeText(getApplicationContext(),name+date+gender,Toast.LENGTH_LONG).show();

            }
        });
        
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioF:
                if (checked)
                        gender="FEMALE";
                    break;
            case R.id.radioM:
                if (checked)
                    gender="MALE";
                    break;
        }
    }
    }
