package com.example.exp03.task6;

import com.example.exp03.task6.lib.SecurityDoor;

public class SecurityDoorAdapter extends SecurityDoor implements Observer {
    @Override
    public void highTemp() {
        super.open();
    }
}
