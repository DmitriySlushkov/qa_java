import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestFelineKittens {
    @Mock
    Feline feline;

    @Test
    public void felineKittensEmptyValue(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void felineKittens(){
        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(5);
        Assert.assertEquals(5, feline.getKittens(5));
    }

}
