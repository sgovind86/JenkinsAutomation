import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_App {

    @Test
    public void test_app(){
        System.out.println("Test case 1");
    }

    @Test
    public void test_app1(){
        System.out.println("Test case 2");
    }

    @Test
    public void test_app2(){
        System.out.println("Test case 2");
        Assertions.fail();
    }

}
