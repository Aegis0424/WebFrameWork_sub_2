package kr.ac.hansung.dto;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
public class ProductDto {

    @NotBlank
    private String name;

    @Min(0)
    private int price;

    private String description;
    @Min(0)
    private int stock;
}
