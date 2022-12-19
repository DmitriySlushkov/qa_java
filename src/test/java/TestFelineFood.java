import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

@RunWith(Parameterized.class) //Параметерезированный тест
public class TestFelineFood {
    String typeAnimal;
    List<String> result;

    public TestFelineFood(String typeAnimal, List<String> result){
        this.typeAnimal = typeAnimal;
        this.result = result;
    }

    @Parameterized.Parameters // Параметры
    public static Object[][] getTestData(){
        return new Object[][]{
                {"Травоядное", List.of("Плоды", "Различные растения")}, //Значение и результат
                {"Хищник", List.of("Мыши", "Ящерицы", "Маленькие собаки")}, //Значение и результат
                {"", List.of("Неизвестное животное, используйте значение Травоядное или Хищник")}, //Значение и результат
        };
    }
    Feline feline =  Mockito.mock(Feline.class); // Создал стаб
    @Test // Тест
    public void eatFeline() throws Exception {
        Mockito.when(feline.getFood(typeAnimal)).thenReturn(result); // Если метод получает тип животного, будет возвращать значение из параметра
        Assert.assertEquals(result, feline.getFood(typeAnimal)); // Проверка, что при отправке типа получаем верное значение
    }
}
