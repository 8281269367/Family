package com.anjalil.admin.family.person;

import java.util.Date;

/**
 * Created by admin on 4/21/2017.
 */

public class Marriage {
    private Date date_of_marriage;
    private String address_of_marriage,name_of_husband,name_of_wife;
    private int no_of_childs;
    private boolean validity;

    public Marriage(Person male,Person female,Date date_of_marriage,String address_of_marriage){
        name_of_husband = male.getName();
        name_of_wife = female.getName();
        this.date_of_marriage = date_of_marriage;
        this.address_of_marriage = address_of_marriage;

    }

    public Date getDate(){
        return this.date_of_marriage;
    }
    public Person getSpouse(Person person) {
        Person person1 = null;
        if (person.getGender() == "MALE") {
            person1 = new Person(this.name_of_wife);
        }else
            person1 = new Person(this.name_of_husband);
        return person1;
    }
}

