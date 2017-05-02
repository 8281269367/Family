package com.anjalil.admin.family.person;

import java.util.Date;

/**
 * Created by admin on 4/20/2017.
 */

public class Person {
    private String name = "";
    private Date date_of_birth;
    private String gender;

    public Person(String name, Date yob, String gender){
        this.gender = gender;
        this.name = name;
        this.date_of_birth = yob;

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Date getDate_of_birth(){
        return this.date_of_birth;
    }
    public String getGender()
    {
        return this.gender;
    }

}
