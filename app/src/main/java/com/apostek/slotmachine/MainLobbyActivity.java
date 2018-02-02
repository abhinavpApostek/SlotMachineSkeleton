package com.apostek.slotmachine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.apostek.slotmachine.viewmodel.MainLobbyViewModel;

/**
 * Created by abhinav on 2/2/18.
 */

class MainLobbyActivity extends AppCompatActivity {

    MainLobbyViewModel mainLobbyViewModel;
    int chips,gems,coins;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel();
        mainLobbyViewModel
    }

    private void setViewModel() {
    }

    public MainLobbyViewModel getMainLobbyViewModel() {
        return mainLobbyViewModel;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
