/** 
 * <pre>项目名称:ssm1 
 * 文件名称:Logs.java 
 * 包名:com.jk.domian.user 
 * 创建日期:2018年8月9日下午8:29:58 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.model.aop;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/** 
 * <pre>项目名称：ssm1    
 * 类名称：Logs    
 * 类描述：    
 * 创建人：吴洋洋
 * 创建时间：2018年8月9日 下午8:29:58    
 * 修改人：   
 * 修改时间：2018年8月9日 下午8:29:58    
 * 修改备注：       
 * @version </pre>    
 */

/**
 * @Document 代表文档
 * collection="t_1803a_log" 代表表名
 */
@Document(collection="t_1804a_project")
public class Logs implements Serializable {

	private static final long serialVersionUID = 895162021829345178L;
	/**
	 * Id唯一
	 */
	private String id;
	
	/**
	 *类名
	 */
	private String className;
	
	/**
	 * 方法名
	 */
	private String methodName;
	
	/**
	 * 用户Id 用来筛选谁的日志
	 */
	private String userId;
	
	/**
	 * 时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private Date createTime; 
	
	/**
	 * 操作人的ip地址
	 */
	private String ip;

	/**
	 * 入参地址
	 */
	private String param;
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
