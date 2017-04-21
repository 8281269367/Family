package com.anjalil.admin.family;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.anjalil.admin.family.person.Marriage;
import com.anjalil.admin.family.person.Person;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person a = new Person("AjithKumar A K",1995,"MALE");
        Person b = new Person("emma watson",1992,"FEMALE");
        Marriage marriage = new Marriage(a,b,new Date(2017,04,21),"Coavai");
        Log.i("HI",a.getName());
        Toast.makeText(MainActivity.this,marriage.getSpouse(a).getName()+" "+marriage.getSpouse(a).getGender(),Toast.LENGTH_LONG).show();
    }
}
