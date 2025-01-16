package homework;

import org.junit.Test;

public class RectanglePerimeter {
    int lungime=19;
    int latime=54;

    @Test
    public void calculatePerimeter(){
        System.out.println("Perimetrul dreptunghiului este: "+ ((2*lungime)+(2*latime)));
    }
}
