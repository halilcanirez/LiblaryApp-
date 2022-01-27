package com.search;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class SearchResultBook{
        private String key;
        private String title;
        private List<String> author_name;
        private String cover_i;
        private int first_publish_year;

}
