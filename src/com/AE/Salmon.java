package com.AE;

/**
 * Created by Angel on 3/7/17.
 */
public class Salmon {
    int count;
// true constructor
//    public Salmon() {
//        this.count = 4;
//    }
//doesn't have a return type so return default value of 0
    public void Salmon(){
       count = 4;
   }

    public static void main(String[] args) {
        Salmon s = new Salmon();
        System.out.println(s.count);
    }
}
