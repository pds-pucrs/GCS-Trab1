package main.java.hello;

import static org.jnit.*;

@BeforeClass
public class Greeter {
    public String sayHello() {
        return "Hello world!";
    }

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertEquals();
    }
}