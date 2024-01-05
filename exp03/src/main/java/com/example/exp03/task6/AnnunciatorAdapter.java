package com.example.exp03.task6;

import com.example.exp03.task6.lib.Annunciator;

public class AnnunciatorAdapter extends Annunciator implements Observer {
    @Override
    public void highTemp() {
        super.alarm();
    }
}
