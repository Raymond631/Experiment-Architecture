package com.example.exp03.task8;

import com.example.exp03.task8.lib.NaiveBayes;

public class NBDataProcess extends DataProcess {
    private NaiveBayes nb;

    public NBDataProcess(NaiveBayes nb) {
        this.nb = nb;
    }

    @Override
    protected void classify() {
        this.nb.run();
    }
}
