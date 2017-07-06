package com.crossword;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class CrosswordInfo {

    @Id
    private @Getter @Setter Integer id;

    private @Getter @Setter Integer firstSymbolPosition;

    private @Getter @Setter Integer lastSymbolPosition;

    private @Getter @Setter Integer wordPosition;

    private @Getter @Setter String layout;

    private @Getter @Setter String question;

    private @Getter @Setter Integer number;
}
