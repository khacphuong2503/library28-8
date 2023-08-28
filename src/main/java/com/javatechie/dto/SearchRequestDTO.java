package com.javatechie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchRequestDTO {
    private String keyword;
    private String sortBy;
    private String sortOrder;
    private int page;
    private int size;

}