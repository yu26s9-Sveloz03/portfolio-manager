package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<IValuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<IValuable>();
    }

    public void add(IValuable asset) {
        assets.add(asset);
    }

    public double getValue(){
        double value = 0;
        for (IValuable asset : assets){
            value += asset.getValue();
        }
        return value;
//        double value = 0;
//        assets.forEach(asset -> {
//           value += asset.getValue();
//        });
    }

    public IValuable getMostValuable() {
        double biggestValue = 0;
        IValuable mostValuable = null;
        for (IValuable asset : assets) {
            if (asset.getValue() > biggestValue){
                biggestValue = asset.getValue();
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    public IValuable getLeastValuable() {
        double leastValue = 0;
        IValuable leastValuable = null;
        for (IValuable asset : assets) {
            if (asset.getValue() > leastValue){
                leastValue = asset.getValue();
                leastValuable = asset;
            }
        }
        return leastValuable;
    }
}
