package com.crossword;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class CrosswordInfo {
    private @Getter @Setter List<Integer> horizontalPosition;

    private @Getter @Setter List<Integer> verticalPosition;

    private @Getter @Setter String question;

    private @Getter @Setter Integer number;
}
