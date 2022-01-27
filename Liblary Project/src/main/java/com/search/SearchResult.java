package com.search;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class SearchResult {
    private int numFound;
    private List<SearchResultBook> docs;
}
