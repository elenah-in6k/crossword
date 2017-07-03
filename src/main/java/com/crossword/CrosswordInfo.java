package com.crossword;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class CrosswordInfo {
    private @Getter @Setter Integer firstSymbolPosition;

    private @Getter @Setter Integer lastSymbolPosition;

    private @Getter @Setter Integer wordPosition;

    private @Getter @Setter String layout;

    private @Getter @Setter String question;

    private @Getter @Setter Integer number;
}
