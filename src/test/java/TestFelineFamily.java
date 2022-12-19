import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;



public class TestFelineFamily {
    @Test
    public void felineFamily(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
}
