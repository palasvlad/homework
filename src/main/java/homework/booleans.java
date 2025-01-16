package homework;

import org.junit.Test;

public class booleans {
    Boolean testbool = true;
    int a = 10;
    int b = 20;

    @Test
    public void printbool(){
        System.out.println("The bool is:"+testbool);
    }

    @Test
    public void compareab(){
        testbool= a>b;
        System.out.println(testbool);
    }

}
