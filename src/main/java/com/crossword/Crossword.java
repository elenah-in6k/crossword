package com.crossword;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Crossword {
    private @Getter @Setter List<List<String>> grid;
    private @Getter @Setter List<CrosswordInfo> info;
}
