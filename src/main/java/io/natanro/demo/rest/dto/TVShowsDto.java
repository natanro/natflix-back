package io.natanro.demo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class TVShowsDto {
    private Long id;
    private String overview;
    private String popularity;
    private Double voteAverage;
    private LocalDate firstAirDate;
    private String name;
    private String originalName;
}
