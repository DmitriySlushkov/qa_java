import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestLion {
    @Mock
    FelineInterface lionInterfaceMock;

    @Test
    public void lionKittensTest() throws Exception {
        Lion lion = new Lion("Самец", lionInterfaceMock);
        Mockito.when(lion.getKittens()).thenReturn(2);
        Assert.assertEquals((2), lion.getKittens());
        System.out.println(lion.getKittens());
    }
    @Test
    public void lionFoodTest() throws Exception {
        Lion lion = new Lion("Самец", lionInterfaceMock);
        Mockito.when(lion.getFood()).thenReturn(List.of("Растения","корма"));
        Assert.assertEquals((List.of("Растения","корма")), lion.getFood());
    }
}
