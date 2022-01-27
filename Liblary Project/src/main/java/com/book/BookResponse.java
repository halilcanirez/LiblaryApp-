package com.book;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
public class BookResponse {


    private String id;


    private String name;


    private String description;


    private LocalDate publishedDate;


    private List<String> coverIds;


    private List<String> authorNames;

    private List<String> authorIds;

}
