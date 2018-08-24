package com.example.sanil.livedataexample;

import android.arch.lifecycle.LiveData;

/**
 * Created by sanil on 16-08-2018.
 */

public class DemoBean{

    private String name;

    private DemoBean(Builder builder) {
        this.name = builder.name;
    }

    public String getName()
    {
        return name;
    }


    public static class Builder
    {
        private String name;

        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public DemoBean build()
        {
            return new DemoBean(this);
        }


    }



}
