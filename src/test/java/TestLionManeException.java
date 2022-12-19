import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class TestLionManeException {
    FelineInterface lionInterfaceMock;

    @Test
    public void lionManeExceptions() {
        try {
            String sex = "qwerty";
            Lion lion = new Lion(sex, lionInterfaceMock);
            lion.doesHaveMane();
            Assert.fail("Используйте допустимые значения пола животного - самей или самка");
        } catch (Exception thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }
}

