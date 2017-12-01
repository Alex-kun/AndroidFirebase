package com.example.miapp2;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.miapp2.fragments.LoginFragment;
import com.example.miapp2.fragments.LoginFragmentListener;
import com.example.milib.FireBaseAdmin;
import com.example.milib.fragments.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    public LoginFragment loginFragment;
    public RegisterFragment registerFragment;
    MainActivityEvents mainActivityEvents;
    FireBaseAdmin fireBaseAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginFragment = (LoginFragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
        mainActivityEvents = new MainActivityEvents(this);
        loginFragment.setListener(mainActivityEvents);
        registerFragment = (RegisterFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);


        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.show(loginFragment);
        transition.commit();
        //transition.hide(registerFragment);
        //transition.hide(loginFragment);
        //transition.commit();

        /*fireBaseAdmin=new FireBaseAdmin(this);
        fireBaseAdmin.setListener(mainActivityEvents);
        fireBaseAdmin.loginWithEmailPass("Yony","PASS");*/
    }
}

class MainActivityEvents implements LoginFragmentListener,FireBaseAdmin.FireBaseAdminListener{
    MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity=mainActivity;
    }

    @Override
    public void OnRegisteredClicked() {
        FragmentTransaction transition = this.mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(this.mainActivity.registerFragment);
        transition.hide(this.mainActivity.loginFragment);
        transition.commit();

    }

    @Override
    public void OnLoginClicked() {

    }

    @Override
    public void fireBaseAdminUserConnected(boolean blconnected) {

    }
}









