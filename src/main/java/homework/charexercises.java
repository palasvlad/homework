package homework;

import org.junit.Test;

public class charexercises {
    Character examplechar = 'A';
    Character examleLowerCase= 'b';
    String stringexample= "string";

    @Test
    public void printchar(){
        System.out.println("valoarea variablilei de tip char este: "+ examplechar);
    }

    @Test
    public void switchacase(){
        System.out.println("Conversie lower case: "+ Character.toLowerCase(examplechar) + " Conversie to upper case: "+ Character.toUpperCase(examleLowerCase));
    }

    @Test
    public void concat(){
        System.out.println("Concatenam string cu char: "+examplechar+stringexample+examplechar);
    }
}


