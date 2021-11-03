import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
private HelloWorld helloWorld;

    @Before
    public void createHelloWorldTest(){
        helloWorld = new HelloWorld();
    }

    @Test
    public void printJenkins() {
        String expected = "This Works on Jenkins";
        String actual = helloWorld.printJenkins();
        assertEquals(expected, actual);

    }
}