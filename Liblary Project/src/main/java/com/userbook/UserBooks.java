package com.userbook;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.cassandra.core.mapping.*;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@Table(value = "usersbook_by_bookid_userid")
public class UserBooks {

    @PrimaryKey
    private UserBooksPrimaryKey key;

    @Column("started_date")
    @CassandraType(type =Name.DATE)
    private LocalDate startedDate;

    @Column("coplated_date")
    @CassandraType(type =Name.DATE)
    private LocalDate completedDate;

    @Column("reading_status")
    @CassandraType(type =Name.TEXT)
    private String reading_status;

    @Column("rating")
    @CassandraType(type =Name.INT)
    private int rating;

}
