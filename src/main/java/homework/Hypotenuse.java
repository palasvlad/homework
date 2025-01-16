package homework;

import java.lang.Math;

import org.junit.Test;

public class Hypotenuse {
    double latura1trdr = 15.6;
    double latura2trdr = 24.65;

    @Test
    public void ipotenuza(){
        System.out.println("Ipotenuza triunghiului dreptunghic este de: "+ Math.hypot(latura2trdr,latura1trdr));
    }
}
