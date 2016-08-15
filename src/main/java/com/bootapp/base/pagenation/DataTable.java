package com.bootapp.base.pagenation;

import java.util.List;

/**
 * @ClassName: DataTable
 * @Description: TODO
 * @author tiandesgin@live.cn
 * @date 2014-9-10 上午8:47:32
 */
public class DataTable<T> {

	private Integer draw;
	private Integer recordsTotal = 0;
	private Integer recordsFiltered = 0;
	private List<T> data;
	
	public DataTable(){}
	
	public DataTable(Integer recordsTotal,Integer recordsFiltered,List<T> data){
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
		this.data = data;
	}
	
	public Integer getDraw() {
		return draw;
	}
	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	public Integer getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(Integer recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	public Integer getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(Integer recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
}
