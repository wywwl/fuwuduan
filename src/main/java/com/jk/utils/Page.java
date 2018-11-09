package com.jk.utils;


import java.io.Serializable;

public class Page implements Serializable {

	private static final long serialVersionUID = 2523060382043289169L;
	/**
	 * 第几页
	 */
	private int page = 1;
	/**
	 * 每页几条
	 */
	private int rows = 3;

	private int startIndex = 0;  //1

	private int endIndex = 0;    //3

	/**
	 * 方法: calculate <br>
	 * 描述: 计算分页开始结束位置 <br>
	 * 作者: Teacher song<br>
	 * 时间: 2017-4-14 上午10:34:17
	 */
	public void calculate(){
		this.startIndex = (page * rows) - rows;
		this.endIndex = page * rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
}
