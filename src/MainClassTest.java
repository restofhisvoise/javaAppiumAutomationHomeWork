import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    private boolean getClassString;

    /*@Test
    public void testLocalNumber()
    {
        int a = this.getLocalNumber();
        if (a == 14) {
            System.out.println("Returned 14");
        } else {
            System.out.println("14 did not returned");
        }
    }

    @Test
    public void testGetClassNumber()
    {
        int b = this.getClassNumber();
        if (b > 45) {
            System.out.println("Class number > 45");
        } else {
            System.out.println("Class number > 45");
        }
    }*/
    @Test
    public void testGetClassString()
    {
        String c = "Hello, world";

        String s1 = "Hello, world";
        String s2 = "hello, world";
        System.out.println("s1 consist of: " + s1);

        if (s1.equals(c)) {
            System.out.println("Line is correct");
        } else if (s2.equals(c)) {
            System.out.println("Line is not correct");
        } else if (!s1.equals(c)) {
            Assert.fail("Test failed: Line is not full: without 'Hello'");
        } else if (!s2.equals(c))
            Assert.fail("Test failed: Line is not full: without 'hello'");
    }
}
