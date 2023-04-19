package org.example;

public class Region implements Travel_App, Travel_App2 extends myClass {

    int val;

    ByTwos(){

        val = 0;
    }

    public int getNext(){
        val += 2;
        return val;
    }
}
