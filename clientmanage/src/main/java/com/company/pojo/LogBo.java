package com.company.pojo;

import java.util.Date;

/**
 * @author rjw
 * @category 操作日志
 */
public class LogBo {
	    /**
	     * 操作日志ID
	     */
	    private Integer id;

	    /**
	     * 操作人
	     */
	    private String uname;

	    /**
	     * 操作模块
	     */
	    private String module;

	    /**
	     * 执行方法
	     */
	    private String methods;

	    /**
	     * 操作内容
	     */
	    private String content;

	    /**
	     * 请求路径
	     */
	    private String actionurl;

	    /**
	     * IP
	     */
	    private String ip;

	    /**
	     * 操作时间
	     */
	    private Date date;

	    /**
	     * 执行描述（1:执行成功、2:执行失败）
	     */
	    private Byte commite;

		public LogBo() {
			super();
		}

		public LogBo(Integer id, String uname, String module, String methods, String content, String actionurl,
				String ip, Date date, Byte commite) {
			super();
			this.id = id;
			this.uname = uname;
			this.module = module;
			this.methods = methods;
			this.content = content;
			this.actionurl = actionurl;
			this.ip = ip;
			this.date = date;
			this.commite = commite;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getModule() {
			return module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getMethods() {
			return methods;
		}

		public void setMethods(String methods) {
			this.methods = methods;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getActionurl() {
			return actionurl;
		}

		public void setActionurl(String actionurl) {
			this.actionurl = actionurl;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Byte getCommite() {
			return commite;
		}

		public void setCommite(Byte commite) {
			this.commite = commite;
		}
}
