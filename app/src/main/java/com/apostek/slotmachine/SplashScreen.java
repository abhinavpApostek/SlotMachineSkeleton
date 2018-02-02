package com.apostek.slotmachine;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by abhinav on 4/1/18.
 */

public class SplashScreen extends AppCompatActivity {

    //check version from json to indicate room to update itself
    int machineUIInfoVersion;
    int machineInfoVersion;
    int miniGameInfoVersion;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView with spash screen drawable and show progress bar meanwhile
        new Thread() {
            @Override
            public void run() {
                updateRoomWithMachineInfoJson();
                updateRoomWithMachineUIInfoJson();
                updateRoomWithMiniGameInfoJson();
                //other methods to get time from server and store it in shared preference
                startMainLobbyActivity();
            }
        }.start();
    }

    private void startMainLobbyActivity() {
        startActivity(new Intent(this,MainLobbyActivity.class));
    }

    //check version and update room
     void updateRoomWithMachineUIInfoJson() {
    }


    //check version and update room
    private void updateRoomWithMachineInfoJson() {
    }


    //check version and update room
    private void updateRoomWithMiniGameInfoJson() {
    }

}
