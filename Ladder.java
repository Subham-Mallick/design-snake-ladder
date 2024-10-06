package org.example.LLD.oops.snakeAndLadder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ladder {
    private int start;
    private int end;
}
