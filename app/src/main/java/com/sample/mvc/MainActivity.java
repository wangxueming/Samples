package com.sample.mvc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements CalculatModelImpl.onCalculatListener{

	private EditText mTxt1, mTxt2;
	private TextView mResult;
	private Button mCal;
	
	CalculatModelImpl mModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxt1 = (EditText) findViewById(R.id.txt1);
        mTxt2 = (EditText) findViewById(R.id.txt2);
        mCal = (Button) findViewById(R.id.cal);
        mCal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mModel.calculate(Integer.valueOf(mTxt1.getText().toString()).intValue(), 
						Integer.valueOf(mTxt2.getText().toString()).intValue(),
						MainActivity.this);
			}
		});
        mResult = (TextView) findViewById(R.id.txt_result);
        mModel = new CalculatModelImpl();
    }
	@Override
	public void onSuccess(int result) {
		mResult.setText("success:" + result);
	}
	@Override
	public void onError() {
		mResult.setText("failed...");
	}
}
