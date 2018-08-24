package com.example.sanil.livedataexample;

import android.app.Application;
import android.app.Service;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/**
 * Created by sanil on 17-08-2018.
 */

interface Age
{

    void getAge();
    void getAge1();
    void getAge2();
    void getAge3();
}
class AnonymousDemo extends Service
{


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(fd, writer, args);
    }
}

// Myclass implement the methods of Age Interface
final class MyClass extends Abc
{
    final int s;



    MyClass()
    {
        s = 1;
    }

    MyClass(int x)
    {
        s = x;
    }


    public void getAge(int s)
    {
        // printing the age
        s = 10;
        System.out.print("Age is "+s);
    }


    @Override
    public void getAge() {

    }

    @Override
    public void getAge2() {

    }

    @Override
    public void getAge3() {

    }
}


abstract class Abc implements Age
{
    public void getAge1()
    {

    }
}