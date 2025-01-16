package homework;

import org.junit.Test;

public class stringex {
    String exampleString= "Alabalaportocala";

    @Test
    public void printstring(){
        System.out.println(exampleString);
    }

    @Test
    public void concatStrings(){
        System.out.println(exampleString+exampleString);
    }

    @Test
    public void replaceAwithBinString(){
        String modifiedString;
        modifiedString= exampleString.replace('a','b').replace('A','B');
        System.out.println(modifiedString);
    }
}
