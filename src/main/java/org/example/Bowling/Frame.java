package org.example.Bowling;

import jdk.jfr.DataAmount;
import jdk.jshell.spi.ExecutionControl;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class Frame {

    private int scoreTotal = 0;

    private boolean lastFrame; //si il est true on est au dernier tour
    private IGenerateur generateur;
    private List<Integer> rolls;
    private Roll roll;


    public Frame(IGenerateur generateur, boolean lastFrame) {

        this.lastFrame = lastFrame;
        this.generateur = generateur;
        rolls = new ArrayList<>();
        roll = (Roll) generateur;

    }

    public boolean makeRoll() {

        int max = 10 - scoreTotal;
        int score = roll.randomPin(max);
        rolls.add(score);
        scoreTotal += score; //       scoreTotal = scoreTotal + score;

        if(score == 10 && (rolls.size() == 1 || rolls.size()==2) && lastFrame) {
            return true;
        }


        if (score <20 && score >=10 && rolls.size() == 1 && lastFrame) {
            return true;
        }


        if (score == 10 || rolls.size() > 2) {
            return false;
        }
//        if (rolls.size() > 2) {
//            return false;
//        }

        return true;
    }
}
