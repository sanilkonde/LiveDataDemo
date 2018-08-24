package com.example.sanil.livedataexample;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    MutableLiveData<DemoBean> demoBeanLiveData = new MutableLiveData<>();
    int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DemoBean demoBean = new DemoBean.Builder().setName(""+i).build();
//        demoBean.setName(""+i);


        demoBeanLiveData.observe(this, new Observer<DemoBean>() {
            @Override
            public void onChanged(@Nullable DemoBean demoBean) {

                ((TextView)findViewById(R.id.txtVw)).setText(demoBean.getName());
            }
        });

        findViewById(R.id.addButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i+=1;

                DemoBean demoBean = new DemoBean.Builder().setName(""+i).build();
                demoBeanLiveData.setValue(demoBean);
            }
        });


        ((TextView)findViewById(R.id.txtVw)).setText(demoBean.getName());

    }
}
