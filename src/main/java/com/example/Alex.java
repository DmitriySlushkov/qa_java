package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {
    private static String sex = "Самец";
    static FelineInterface felineInterface = new FelineKittensAndFood();

    public Alex() throws Exception {
        super(sex, felineInterface);

    }

    @Override
    public int getKittens(){
        return 0;
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    public List<String> getFriends(){
        return Arrays.asList("зебрa Марти", "бегемотихa Глория", "жираф Мелман");
    }

}
