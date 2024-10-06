package org.example.LLD.oops.snakeAndLadder;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private int size;
    private List<Snake> snakeList;
    private List<Ladder> ladderList;

    public int movePlayer(Player player) {
        int diceValue = Dice.roll();
        int newPosition = player.getPosition() + diceValue;

        System.out.println("\nDice : "+diceValue);

        if(newPosition > size) {
            return player.getPosition();
        }

        for (Snake snake : snakeList) {
            if(snake.getStart() == newPosition) {
                System.out.println(player.getName()+ " SNAKE kha gaya. Wapis jao :"+snake.getEnd());
                return snake.getEnd();
            }
        }

        for (Ladder ladder : ladderList) {
            if(ladder.getStart() == newPosition) {
                System.out.println(player.getName()+ " siri mil gai. Jump to :"+ladder.getEnd());
                return ladder.getEnd();
            }
        }

        return newPosition;

    }
}
