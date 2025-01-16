package homework;

import org.junit.Test;

public class weathercheck {
    boolean isSunny = false;
    boolean isWarm = true;
    boolean chanceOfRain = true;
    boolean shouldGoOut=false;

    @Test
    public void evaluateweaather(){
        if((isSunny && isWarm) || (isWarm && !chanceOfRain)){
            shouldGoOut = true;
        }
        System.out.println("Should I go out? "+ shouldGoOut);
    }
}
