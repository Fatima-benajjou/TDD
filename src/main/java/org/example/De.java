package org.example;

import java.util.Random;

public class De implements Ide{
    @Override
    public int getRoll() {
        Random random = new Random();
        return random.nextInt(6);
    }


}
