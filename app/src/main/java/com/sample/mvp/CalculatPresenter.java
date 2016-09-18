package com.sample.mvp;

import com.sample.mvc.CalculatModel;

/**
 * Created by magic on 2016/9/14.
 */
public class CalculatPresenter {
    private CalculatModelImpl mModelImpl;
    private IMainView mIView;
    public CalculatPresenter(IMainView iview) {
        mModelImpl = new CalculatModelImpl();
        mIView = iview;
    }

    public void calculat(int num1, int num2) {
        mIView.setResTxt(mModelImpl.calculat(num1, num2));
    }
}
