package com.javatechie.dto;

import com.javatechie.entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SearchResponseDTO {
    private List<UserInfo> results;
    private int totalResults;
}
