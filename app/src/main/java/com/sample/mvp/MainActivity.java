package com.sample.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sample.mvc.R;

public class MainActivity extends Activity implements IMainView {

	private EditText mTxt1, mTxt2;
	private TextView mResult;
	private Button mCal;

    CalculatPresenter mPresenter;

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
                mPresenter.calculat(getNum1Txt(), getNum2Txt());
			}
		});
        mResult = (TextView) findViewById(R.id.txt_result);
		mPresenter = new CalculatPresenter(this);
    }

	@Override
	public int getNum1Txt() {
		return Integer.valueOf(mTxt1.getText().toString()).intValue();
	}

	@Override
	public int getNum2Txt() {
		return Integer.valueOf(mTxt2.getText().toString()).intValue();
	}

	@Override
	public void setResTxt(int result) {
		mResult.setText(String.valueOf(result));
	}
}
