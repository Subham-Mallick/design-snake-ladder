package org.example.LLD.oops.snakeAndLadder;

import java.util.Queue;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Game {
    private Board board;
    private Queue<Player> playerQueue;

    public void start() {
        boolean gameWon = false;
        while(!gameWon) {
            Player player = playerQueue.poll();

            int newPosition = board.movePlayer(player);

            if(newPosition == board.getSize()) {
                gameWon = true;
                System.out.println(player.getName()+" won!");
            } else {
                player.setPosition(newPosition);
                System.out.println(player.getName()+" position: "+player.getPosition());
                playerQueue.offer(player);
            }

        }
    }


}
