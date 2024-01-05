package com.example.exp03.task6;

import com.example.exp03.task6.lib.InsulatedDoor;

public class InsulatedDoorAdapter extends InsulatedDoor implements Observer {
    @Override
    public void highTemp() {
        super.close();
    }
}
