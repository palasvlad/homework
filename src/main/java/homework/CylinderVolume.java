package homework;

import org.junit.Test;

import java.lang.Math;

public class CylinderVolume {
    double raza = 3.55;
    double inaltimea = 700.45;
    double pii = Math.PI;

    @Test
    public void volume() {
        System.out.println("Volumul cilindrului este de: " + (pii * Math.pow(raza,2) * inaltimea));
    }

}
