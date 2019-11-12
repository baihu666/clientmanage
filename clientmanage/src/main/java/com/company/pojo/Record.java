package com.company.pojo;

import java.util.Date;

/**
 * @author 张游
 * @category 客户跟踪记录表
 */
public class Record {
	/**
	 * 记录id
	 */
	private int id;
	/**
	 * 客户cid
	 */
	private int cid;
	/**
	 * 员工id
	 */
	private int sid;
	/**
	 * 部门id
	 */
	private int did;
	/**
	 * 跟踪时间
	 */
	private Date recordtime;
	/**
	 * 跟踪地址
	 */
	private String address;
	/**
	 * 跟踪结果
	 */
	private String result;
	/**
	 * 客户意见id
	 */
	private int oid;
	/**
	 * 提交意见处理建议
	 */
	private String doopinion;
	/**
	 * 是否批注
	 */
	private String remark;
	/**
	 * 上传文件
	 */
	private String document;
	/**
	 * 关注商品id
	 */
	private int pid;
	/**
	 * 合同节点
	 */
	private int point;
	public Record(int id, int cid, int sid, int did, Date recordtime, String address, String result, int oid,
			String doopinion, String remark, String document, int pid, int point) {
		super();
		this.id = id;
		this.cid = cid;
		this.sid = sid;
		this.did = did;
		this.recordtime = recordtime;
		this.address = address;
		this.result = result;
		this.oid = oid;
		this.doopinion = doopinion;
		this.remark = remark;
		this.document = document;
		this.pid = pid;
		this.point = point;
	}
	@Override
	public String toString() {
		return "Record [id=" + id + ", cid=" + cid + ", sid=" + sid + ", did=" + did + ", recordtime=" + recordtime
				+ ", address=" + address + ", result=" + result + ", oid=" + oid + ", doopinion=" + doopinion
				+ ", remark=" + remark + ", document=" + document + ", pid=" + pid + ", point=" + point + "]";
	}
	public Record() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getDoopinion() {
		return doopinion;
	}
	public void setDoopinion(String doopinion) {
		this.doopinion = doopinion;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	

}
