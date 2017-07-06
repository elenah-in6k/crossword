package com.crossword;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Crossword {

    @Id
    public @Getter @Setter int id;
    private @Getter @Setter List<List<String>> grid;
    private @Getter @Setter List<CrosswordInfo> info;
}
