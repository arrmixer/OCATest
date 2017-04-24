package com.AE;

/**
 * Created by Angel on 4/24/17.
 */
public class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.isCanHop();
    }
}
