package com.example.exp03.task8;

import com.example.exp03.task8.lib.DecisionTree;
import com.example.exp03.task8.lib.KNN;

public class DTDataProcess extends DataProcess {
    private DecisionTree dt;

    public DTDataProcess(DecisionTree dt){
        this.dt = dt;
    }

    @Override
    protected void classify() {
        this.dt.run();
    }
}
