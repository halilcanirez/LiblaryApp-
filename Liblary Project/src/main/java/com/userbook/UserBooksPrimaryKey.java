package com.userbook;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;


@PrimaryKeyClass
@Getter
@Setter
public class UserBooksPrimaryKey {
    @Id
    @PrimaryKeyColumn(name = "user_id", ordinal = 0 ,type = PrimaryKeyType.PARTITIONED)
    private String userId;
    @Id @PrimaryKeyColumn(name = "book_id", ordinal = 1 ,type = PrimaryKeyType.PARTITIONED)
    private String bookId;
}
