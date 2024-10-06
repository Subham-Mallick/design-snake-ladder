package org.example.LLD.oops.snakeAndLadder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SnakeGame {

    public static void main(String[] args) {

        List<Snake> snakes = List.of(
                Snake.builder().start(99).end(5).build(),
                Snake.builder().start(80).end(40).build(),
                Snake.builder().start(75).end(22).build(),
                Snake.builder().start(62).end(19).build(),
                Snake.builder().start(43).end(10).build(),
                Snake.builder().start(37).end(2).build()
        );

        List<Ladder> ladders = List.of(
                Ladder.builder().start(2).end(38).build(),
                Ladder.builder().start(7).end(14).build(),
                Ladder.builder().start(15).end(26).build(),
                Ladder.builder().start(28).end(84).build(),
                Ladder.builder().start(51).end(67).build(),
                Ladder.builder().start(78).end(98).build()
        );

        Board board = new Board(100, snakes, ladders);

        Player player1 = Player.builder().name("Subham").position(0).build();
        Player player2 = Player.builder().name("Arnab").position(0).build();
        Player player3 = Player.builder().name("Aretra").position(0).build();
        Player player4 = Player.builder().name("Puja").position(0).build();

        Queue<Player> playerQueue = new LinkedList<>(List.of(player1, player2, player3, player4));

        Game game = Game.builder().board(board).playerQueue(playerQueue).build();

        game.start();


    }
}
