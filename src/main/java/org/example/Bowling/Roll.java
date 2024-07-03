package org.example.Bowling;

import lombok.Data;
import java.util.Random;
import java.util.Random;

@Data

public class Roll implements IGenerateur { //c'est le lancer qui va faire tomber un certain nb de quille

    private int pins;


    @Override
    public int randomPin(int max) {
        Random random = new Random();
        pins = random.nextInt(max);
        return pins;

    }

}

