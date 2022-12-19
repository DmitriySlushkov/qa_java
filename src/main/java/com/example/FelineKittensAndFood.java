package com.example;

import java.util.List;

public class FelineKittensAndFood implements FelineInterface {

    @Override
    public int getKittens() {
        return getKittens(100);
    }

    @Override
    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба", "Программисты");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}
