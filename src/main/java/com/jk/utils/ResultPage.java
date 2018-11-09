package com.jk.utils;


import java.io.Serializable;

public class ResultPage implements Serializable {

	private static final long serialVersionUID = -8958649138436511794L;
	private java.lang.Integer total;
	
	private Object rows;

	public java.lang.Integer getTotal() {
		return total;
	}

	public void setTotal(java.lang.Integer total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}
	
}
