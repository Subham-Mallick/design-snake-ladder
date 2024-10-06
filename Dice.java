package org.example.LLD.oops.snakeAndLadder;

import java.util.Random;
import lombok.Data;

@Data
public class Dice {
    public static int roll() {
        return new Random().nextInt(6)+1;
    }
}
