package com.sample.mvc;

import com.sample.mvc.CalculatModelImpl.onCalculatListener;

public interface CalculatModel {
	void calculate(int num1, int num2, onCalculatListener listener);
}
