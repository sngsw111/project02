package com.example.demo.util;

//함께가요 게시글 검색에 대한 클래스
public class SearchCriteria extends Criteria {
	private String searchType="";
	private String keyword="";
	
	//검색타입 ex)제목, 내용, 제목 + 내용
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	//검색어
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + "]";
	}
}
