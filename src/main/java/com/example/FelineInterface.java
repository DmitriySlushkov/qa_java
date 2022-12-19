package com.example;

import java.util.List;
//Интерфейс, для иньекции зависимостей Feline
public interface FelineInterface {
    int getKittens();

    List<String> getFood(String animalKind) throws Exception;

    int getKittens(int kittensCount);
}