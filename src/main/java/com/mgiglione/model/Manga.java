package com.mgiglione.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Manga {
    private String title;
    private String description;
    private Integer volumes;
    private Double score;
}
