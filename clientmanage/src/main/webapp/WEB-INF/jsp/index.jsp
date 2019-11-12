 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>溢迈克斯客户管理平台</title>
<script src="./static/js/jquery.js"></script>
<link rel="stylesheet" href="./static/css/reset.css">
<link rel="stylesheet" href="./static/css/public.css">
<script type="text/javascript">
	function clock() {
		$.ajax({
			type : 'post',
			url : "clock.action",
			contentType : 'application/json;charset=utf-8',
			success : function(data) {
				$("#clock").html(data);
			},
			
		});
	}
</script>
</head>
<body>
	<div class="public-header-warrp">
		<div class="public-header">
			<div class="content">
				<div class="public-header-logo">
					<a href=""><i>LOGO</i>
						<h3>溢迈克斯</h3></a>
				</div>

				<div class="public-header-admin fr">
					<p class="admin-name">${current_staff.name}管理员您好！</p>
					<div class="public-header-fun fr">
						<a href="" class="public-header-man public-header-right">待办<span
							style="color: red; font-weight: 200;">0</span>
							<ul class="daiban">
								<li class="daibanli">今日需跟进客户<span
									style="color: red; font-weight: 200;">0</span></li>
								<li class="daibanli">合同到期提醒<span
									style="color: red; font-weight: 200;">0</span></li>
								<li class="daibanli">待审核的合同<span
									style="color: red; font-weight: 200;">0</span></li>
								<li class="daibanli">应收款提醒<span
									style="color: red; font-weight: 200;">0</span></li>
								<li class="daibanli">待审核的回款<span
									style="color: red; font-weight: 200;">0</span></li>
								<li class="daibanli">待审核的发票<span
									style="color: red; font-weight: 200;">0</span></li>
								<li class="daibanli">待处理的办公审批<span
									style="color: red; font-weight: 200;">0</span></li>
							</ul></a> <a  href="javascript:;" class="public-header-man public-header-right" onclick="clock()" id="clock">${clock.daka }</a>
						<a href="" class="public-header-man public-header-right">日程</a> <a
							href="" class="public-header-man public-header-right">管理</a> <a
							href="exit.action" class="public-header-loginout">安全退出</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>
	<!-- 内容展示 -->
	<div class="public-ifame mt20">
		<div class="content">
			<!--内容模块头 -->
			<!--<div class="public-ifame-header">
			<ul>
				<li class="ifame-item logo">
					<div class="item-warrp">
						<a href="#"><i>LOGO</i>
							<h3 class="logo-title">WorldVentures梦幻之旅</h3>
							<p class="logo-des">创建于 2016/4/22 22:22:47</p>
						</a>
					</div>
				</li>
				<li class="ifame-item"><div class="item-warrp"><span>注册时间：2015/11/21 21:14:01<br>VIP有效期：</span></div></li>
				<li class="ifame-item"><div class="item-warrp" style="border:none"><span>网站浏览量：15451</span></div></li>
				<div class="clearfix"></div>
			</ul>
		</div>-->
			<div class="clearfix"></div>
			<!-- 左侧导航栏 -->
			<div class="public-ifame-leftnav">
				<div class="public-title-warrp">
					<div class="public-ifame-title ">
						<a href="">首页</a>
					</div>
				</div>
				<ul class="left-nav-list">
					<li class="public-ifame-item"><a href="javascript:;">客户管理</a>
						<div class="ifame-item-sub">
							<ul>
								<li class="active"><a href="client/findall.action"
									target="content">客户</a></li>
								<li><a href="./static/images/main.html" target="content">客户池</a></li>
								<li><a href="./static/images/main.html" target="content">客户联系人</a></li>
								<li><a href="./static/images/main.html" target="content">附近客户</a></li>
								<li><a href="./static/images/main.html" target="content">沟通日志</a></li>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">合同管理</a>
						<div class="ifame-item-sub">
							<ul>
								<li><a href="toorder/list.action" target="content">合同</a>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">意见管理</a>
						<div class="ifame-item-sub">
							<ul>
								<c:if test="${current_staff.role =='1' }">
									<li><a
										href="record/selectBySid.action?sid=${current_staff.id }"
										target="content">个人意见</a></li>
									<li><a href="record/torecord.action" target="content">提意见</a></li>
								</c:if>
								<c:if test="${current_staff.role =='2' }">
									<li><a
										href="record/selectBySid.action?sid=${current_staff.id }"
										target="content">个人意见</a></li>
									<li><a href="record/torecord.action" target="content">提意见</a></li>
									<li><a
										href="record/selectByDid.action?did=${current_staff.department }"
										target="content">部门审批</a></li>
									<li><a
										href="record/selectByDid1.action?did=${current_staff.department }"
										target="content">查看审批</a></li>
								</c:if>
								<c:if test="${current_staff.role =='3' }">
									<li><a href="record/selectByPoint.action" target="content">老总审批</a></li>
									<li><a href="record/selectByPoint1.action"
										target="content">查看审批</a></li>
								</c:if>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">财务管理</a>
						<div class="ifame-item-sub">
							<ul>
								<li><a href="./static/images/main.html" target="content">应收款</a></li>
								<li><a href="./static/images/main.html" target="content">应付款</a></li>
								<li><a href="./static/images/main.html" target="content">回款单</a></li>
								<li><a href="./static/images/main.html" target="content">付款单</a></li>
								<li><a href="./static/images/main.html" target="content">发票</a></li>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">产品管理</a>
						<div class="ifame-item-sub">
							<ul>
								<li><a href="produce/findlist.action" target="content">产品</a></li>
								<li><a href="kind/kindlist.action" target="content">规格分类</a></li>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">数据分析</a>
						<div class="ifame-item-sub">
							<ul>
								<li><a href="./static/images/main.html" target="content">数据分析</a></li>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">工单任务</a>
						<div class="ifame-item-sub">
							<ul>
								<li><a href="./static/images/main.html" hhref="" target="content">工单</a></li>
								<li><a href="./static/images/main.html" hhref="" target="content">任务</a></li>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">办公</a>
						<div class="ifame-item-sub">
							<ul>
								<li><a href="log/tologlist.action" target="content">工作日志</a>|
									<a href="log/toadd.action" target="content">增加</a></li>
								<c:if test="${current_staff.department=='8' }">
									<li><a href="logbo/findall.action" target="content">操作日志</a></li>
								</c:if>
								<li><a href="./static/images/main.html" target="content">审批</a></li>
								<li><a href="./static/images/main.html" target="content">知识</a></li>
								<li><a href="./static/images/main.html" target="content">公告</a></li>
								<li><a href="./static/images/main.html" target="content">定位签到</a></li>
								<li><a href="./static/images/main.html" target="content">日程</a></li>
								<li><a href="./static/images/main.html" target="content">考勤日历</a></li>
								<li><a href="./static/images/main.html" target="content">通讯录</a></li>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">营销</a>
						<div class="ifame-item-sub">
							<ul>
								<li><a href="./static/images/main.html" target="content">市场活动</a></li>
								<li><a href="./static/images/main.html" target="content">发送邮件</a></li>
							</ul>
						</div></li>
					<li class="public-ifame-item"><a href="javascript:;">系统设置</a>
						<div class="ifame-item-sub">
							<ul>
								<li><a href="./static/images/main.html" target="content">系统设置</a></li>
							</ul>
						</div></li>
				</ul>
			</div>
			<!-- 右侧内容展示部分 -->
			<div class="public-ifame-content">
				<iframe name="content" src="./static/images/main.html" frameborder="0"
					id="mainframe" scrolling="yes" marginheight="0" marginwidth="0"
					width="100%" style="height: 1000px;"></iframe>
			</div>
		</div>
	</div>
	<script src="./static/js/jquery.min.js"></script>
	<script>
		$().ready(function() {
			var item = $(".public-ifame-item");

			for (var i = 0; i < item.length; i++) {
				$(item[i]).on('click', function() {
					$(".ifame-item-sub").hide();
					if ($(this.lastElementChild).css('display') == 'block') {
						$(this.lastElementChild).hide()
						$(".ifame-item-sub li").removeClass("active");
					} else {
						$(this.lastElementChild).show();
						$(".ifame-item-sub li").on('click', function() {
							$(".ifame-item-sub li").removeClass("active");
							$(this).addClass("active");
						});
					}
				});
			}
		});
	</script>
</body>
</html>