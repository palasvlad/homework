package homework;

import org.junit.Test;

public class FtoC {
    double Fahrenheit = 80;

    @Test
    public void convert(){
        System.out.println(Fahrenheit + " grade Fahrenheit sunt " + ((Fahrenheit - 32)/1.8) + "grade C");
    }
}
