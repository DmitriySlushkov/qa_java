package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    FelineInterface felineInterface;

    public Lion(String sex, FelineInterface felineInterface) throws Exception {
        this.felineInterface = felineInterface;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
//    public Lion(String sex) throws Exception {
//        if ("Самец".equals(sex)) {
//            hasMane = true;
//        } else if ("Самка".equals(sex)) {
//            hasMane = false;
//        } else {
//            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
//        }
//    }

    public int getKittens() {
        return felineInterface.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineInterface.getFood("Хищник");
    }
}
