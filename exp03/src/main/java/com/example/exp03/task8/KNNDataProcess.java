package com.example.exp03.task8;

import com.example.exp03.task8.lib.KNN;

public class KNNDataProcess extends DataProcess {
    private KNN knn;

    public KNNDataProcess(KNN knn){
        this.knn = knn;
    }

    @Override
    protected void classify() {
        this.knn.run();
    }
}
