package com.example.exp03.task6;

import com.example.exp03.task6.lib.CautionLight;

public class CautionLightAdapter extends CautionLight implements Observer {
    @Override
    public void highTemp() {
        super.flicker();
    }
}
