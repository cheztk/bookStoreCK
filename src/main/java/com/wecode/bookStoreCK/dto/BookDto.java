package com.wecode.bookStoreCK.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "BookDto", description = "All detail about book")
public class BookDto {

    @ApiModelProperty(
            value = "UUID",
            dataType = "UUID",
            example = "b5607d38-8fc1-43ef-b44e-34967083c80a",
            notes = "The database generated uuid for book_id",
            required = true
    )
    private UUID id;

    @ApiModelProperty(
            value = "title",
            dataType = "String",
            example = "test title",
            notes = "Book Title",
            required = true
    )
    private String title;

    @ApiModelProperty(
            value = "description",
            dataType = "String",
            example = "book description",
            notes = "book description",
            required = true
    )
    private String description;

    @ApiModelProperty(
            value = "release year",
            dataType = "int",
            example = "2021",
            notes = "The year book released",
            required = true
    )
    private int releaseYear;

}
