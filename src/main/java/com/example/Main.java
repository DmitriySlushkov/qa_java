package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        FelineInterface felineInterface = new FelineKittensAndFood();
        Lion lion = new Lion("Самец", felineInterface);
        Alex alex = new Alex();
        System.out.println(alex.getPlaceOfLiving());
        System.out.println(alex.getFriends());
        System.out.println(alex.doesHaveMane());
        System.out.println(alex.getKittens());
        System.out.println(alex.getFood());


    }
}
