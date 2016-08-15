package com.bootapp.base.pagenation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PagerResult<T> implements Serializable{

	private static final long serialVersionUID = -5077411816566680422L;
	
	private List<T> list;
	private static final int DEFAULT_PAGE_SIZE = 10;
	private static final int FIRST_PAGE_NUMBER = 1;
	
	/**
	 * 当前第几页
	 */
	private int pageNumber;
	/**
	 * 每页显示几条
	 */
	private int pageSize;
	/**
	 * 总页数
	 */
	private int pageCount;
	/**
	 * 总记录
	 */
	private int recordCount;

	public PagerResult() {
		pageNumber = FIRST_PAGE_NUMBER;
		pageSize = DEFAULT_PAGE_SIZE;
		list = new ArrayList<T>();
	}

	public void resetPageCount() {
		pageCount = -1;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		if (pageCount < 0)
			pageCount = (int) Math.ceil((double) recordCount / pageSize);
		return pageCount;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public PagerResult<T> setPageNumber(int pn) {
		pageNumber = pn > FIRST_PAGE_NUMBER ? pn : FIRST_PAGE_NUMBER;
		return this;
	}

	public PagerResult<T> setPageSize(int pageSize) {
		this.pageSize = (pageSize > 0 ? pageSize : DEFAULT_PAGE_SIZE);
		return this;
	}

	public PagerResult<T> setRecordCount(int recordCount) {
		this.recordCount = recordCount > 0 ? recordCount : 0;
		this.pageCount = (int) Math.ceil((double) recordCount / pageSize);
		return this;
	}

	public int getOffset() {
		return pageSize * (pageNumber - 1);
	}

	@Override
	public String toString() {
		return String.format("size: %d, total: %d, page: %d/%d", pageSize,
				recordCount, pageNumber, this.getPageCount());
	}

	public boolean isFirst() {
		return pageNumber == FIRST_PAGE_NUMBER;
	}

	public boolean isLast() {
		if (pageCount == 0)
			return true;
		return pageNumber == pageCount;
	}

	public List<T> getList() {
		return list;
	}

	public PagerResult<T> setList(List<T> list) {
		this.list = list;
		return this;
	}
}
