package com.AE;

/**
 * Created by Angel on 4/24/17.
 */
public class Order {
    String value = "t";
    { value += "a"; }
    { value += "c"; }
    public Order(){
        value += "b";
    }
    public Order(String s){
        value += s;
    }



}
