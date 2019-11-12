package com.company.pojo.vo;

import java.util.Date;

/**
 * @author 张游
 *
 */
public class RecordVO {
	/**
	 * 意见Id
	 */
	private int recordId;
	/**
	 * 客户名称
	 */
	private String clientName;
	/**
	 * 客户id
	 */
	private int clientId;
	/**
	 * 客户意见
	 */
	private String opinion;
	/**
	 *申请员工 
	 */
	private String staff;
	/**
	 *申请员工 id
	 */
	private int staffId;
	/**
	 * 申请内容
	 */
	private String content;
	/**
	 * 部门id
	 */
	private String department;
	/**
	 * 跟踪时间
	 */
	private Date recordtime;
	/**
	 * 商品名称
	 */
	private String produceName;
	/**
	 * 商品id
	 */
	private String produceId;
	/**
	 * 是否同意
	 */
	private String agree1;
	/**
	 * 是否同意2
	 */
	private String agree2;
	/**
	 * 审批状态
	 */
	private String status;
	private int point;
	public RecordVO(int recordId, String clientName, int clientId, String opinion, String staff, int staffId,
			String content, String department, Date recordtime, String produceName, String produceId, String agree1,
			String agree2, String status, int point) {
		super();
		this.recordId = recordId;
		this.clientName = clientName;
		this.clientId = clientId;
		this.opinion = opinion;
		this.staff = staff;
		this.staffId = staffId;
		this.content = content;
		this.department = department;
		this.recordtime = recordtime;
		this.produceName = produceName;
		this.produceId = produceId;
		this.agree1 = agree1;
		this.agree2 = agree2;
		this.status = status;
		this.point = point;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	public String getProduceName() {
		return produceName;
	}
	public void setProduceName(String produceName) {
		this.produceName = produceName;
	}
	public String getProduceId() {
		return produceId;
	}
	public void setProduceId(String produceId) {
		this.produceId = produceId;
	}
	public String getAgree1() {
		return agree1;
	}
	public void setAgree1(String agree1) {
		this.agree1 = agree1;
	}
	public String getAgree2() {
		return agree2;
	}
	public void setAgree2(String agree2) {
		this.agree2 = agree2;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public RecordVO() {
		super();
	}
	
	


}
