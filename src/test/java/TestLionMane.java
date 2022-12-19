import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class TestLionMane {
    FelineInterface lionInterfaceMock;
    private final String sex;
    private final boolean result;

    public TestLionMane(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }

    @Test
    public void lionManeTest() throws Exception {
        Lion lion = new Lion(sex, lionInterfaceMock);
        Assert.assertEquals(result, lion.doesHaveMane());
    }

}
