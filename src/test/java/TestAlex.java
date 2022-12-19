import com.example.Alex;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestAlex {
    @Test
    public void alexKittenTest() throws Exception {
        Alex alex = new Alex();
        Assert.assertEquals(0, alex.getKittens());
    }
    @Test
    public void alexPlaceOfLiving() throws Exception {
        Alex alex = new Alex();
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
    @Test
    public void alexFriends() throws Exception {
        Alex alex = new Alex();
        Assert.assertEquals(Arrays.asList("зебрa Марти", "бегемотихa Глория", "жираф Мелман"), alex.getFriends());
    }
    @Test
    public void alexFood() throws Exception {
        Alex alex = new Alex();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба", "Программисты"), alex.getFood());
    }
}
