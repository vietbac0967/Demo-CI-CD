package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
  
  private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }
  @Test
  public void greeterSayGoodbye(){
    assertThat(greeter.sayGoodbye(),containsString("Goodbye have a nice day"));
  }

}