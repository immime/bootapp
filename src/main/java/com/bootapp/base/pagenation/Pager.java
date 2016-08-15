package com.bootapp.base.pagenation;


public class Pager{

	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int DEFAULT_START = 0;

	
	private int start;//当前第几页
	private int pageSize;//每页显示多少条
	private Integer orderColumn;//排序列
	private String orderDir;//排序方式:ASC | DESC
	private String searchValue;//搜索内容
	
	private int draw;//客户端请求次数

	public Pager(){
		start = DEFAULT_START;
		pageSize = DEFAULT_PAGE_SIZE;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(Integer orderColumn) {
		this.orderColumn = orderColumn;
	}

	public String getOrderDir() {
		return orderDir;
	}

	public void setOrderDir(String orderDir) {
		this.orderDir = orderDir;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}
}
