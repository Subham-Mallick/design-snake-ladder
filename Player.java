package org.example.LLD.oops.snakeAndLadder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Player {
    private String name;
    private int position;
}
