package com.crossword;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CrosswordInfo {

    @Id
    private Integer id;
    private Integer firstSymbolPosition;
    private Integer lastSymbolPosition;
    private Integer wordPosition;
    private String layout;
    private String question;
    private Integer number;
}
