package com.sample.mvp;

/**
 * Created by magic on 2016/9/14.
 */
public class CalculatModelImpl implements CalculatModel {

    @Override
    public int calculat(int num1, int num2) {
        try {
            int result = num1 / num2;
            android.util.Log.e("eee", "eee  result = " + result + "  num1 = " + num1 + "  num2 = " + num2);
            return result;
        } catch(Exception e) {
            return -1;
        }
    }
}
