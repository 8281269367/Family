package com.anjalil.admin.family;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.anjalil.admin.family.person.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person b = new Person("emma watson",1992,"female");
        Person a = new Person("Ajith",1995,"Male",b);
        Log.i("HI",a.getName());
        Toast.makeText(MainActivity.this,a.getWifeName(),Toast.LENGTH_LONG).show();
    }
}
