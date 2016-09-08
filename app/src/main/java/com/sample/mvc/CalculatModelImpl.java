package com.sample.mvc;

public class CalculatModelImpl implements CalculatModel{

	public CalculatModelImpl() {
		
	}
	public interface onCalculatListener {
	    public void onSuccess(int result);
	    public void onError();
	}
	@Override
	public void calculate(int num1, int num2, onCalculatListener listener) {
		try {
			int result = num1 / num2;
			android.util.Log.e("eee", "eee  result = " + result + "  num1 = " + num1 + "  num2 = " + num2);
			listener.onSuccess(result);
		} catch(Exception e) {
			listener.onError();
		}
	}
}
