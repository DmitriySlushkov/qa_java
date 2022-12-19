import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    @Mock
    Feline mockFeline;

    @Test
    public void catFoodTest() throws Exception {
        Cat cat = new Cat(mockFeline);
        Mockito.when(cat.getFood()).thenReturn(List.of("Растения","корма"));
        Assert.assertEquals((List.of("Растения","корма")), cat.getFood());
    }
    @Test
    public void catSoundTest(){
        Cat cat = new Cat(mockFeline);
        Assert.assertEquals("Мяу", cat.getSound());
    }
}
