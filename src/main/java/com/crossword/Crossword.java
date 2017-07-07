package com.crossword;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Crossword {
    @Id
    private String id;
    private List<List<String>> grid;
    private List<CrosswordInfo> info;
    private String testField;

}
