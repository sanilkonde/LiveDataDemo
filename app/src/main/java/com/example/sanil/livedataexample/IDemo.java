package com.example.sanil.livedataexample;

import android.arch.lifecycle.LiveData;

/**
 * Created by sanil on 16-08-2018.
 */

public interface IDemo {
    LiveData<DemoBean> getDemoBeanLiveData();
}
