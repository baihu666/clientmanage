	$(function() {
		$.ajax({
			type : 'post',
			url : "log/findAll.action",
			success:function(result){
				console.log(result);
				console.log("进入post");
				var html="";
				$.each(result.list,function(i,data){
					html += "<tr><td style='width:20%'>"+data.xh+"</td><td style='width:20%' ><a href='log/findById.action?id="+data.id+"' target='content'>"+data.uname+"</a></td>"+
							"<td style='width:20%'>"+data.dname+"</td><td style='width:20%'>"+data.rname+"</td><td style='width:20%'><a href='log/test.action?datetime=${log.datetime }'>"+data.dateStr+"</a></td></tr>";
				})
				$("#lists").html(html);
			},
			dataType : "json"
		});
		//人名列表
		$.ajax({
			type : 'post',
			url : "log/finduname.action",
			success : function(result) {
				console.log(result);
				console.log("进入uname");
				var html = "<option value='0'>-姓名-</option>";
				$.each(result.list,function(i,data){
					html += "<option value='" + data.name + "'>"+ data.name + "</option>";

					console.log("进入循环");
				})
				$("#uname").html(html);
			},
			dataType : "json"
		});
		//部门列表
		$.ajax({
			type : 'post',
			url : "log/finddname.action",
			success : function(result) {
				console.log(result);
				console.log("进入dname");
				var html = "<option value='0'>-部门-</option>";
				$.each(result.list,function(i,data){
					html += "<option value='" + data.name + "'>"+ data.name + "</option>";

					console.log("进入循环");
				})
				$("#dname").html(html);
			},
			dataType : "json"
		});
		//职位列表
		$.ajax({
			type : 'post',
			url : "log/findrname.action",
			success : function(result) {
				console.log(result);
				console.log("进入rname");
				var html = "<option value='0'>-职位-</option>";
				$.each(result.list,function(i,data){
					html += "<option value='" + data.name + "'>"+ data.name + "</option>";

					console.log("进入循环");
				})
				$("#rname").html(html);
			},
			dataType : "json"
		});
	});
	
	
	function find(){
		var uname = $("#uname").val();
		var dname = $("#dname").val();
		var rname = $("#rname").val();
		var datetime = 0;
		console.log(uname);
		$.ajax({
			type:"POST",
			url:"log/setlist.action",
			data:{uname:uname,dname:dname,rname:rname,date:datetime},
			success:function(result){
				var html="";
				/* <tr><th style='width:20%'>序号<button onclick='find()' type='button'>按钮</button></th>"+
				"<th style='width:20%'>员工姓名</th><th style='width:20%'>部门</th><th style='width:20%'>职位</th>"+
				"<th style='width:20%'>时间</th></tr> */
				$.each(result.list,function(i,data){
					html += "<tr><td style='width:20%'>"+data.xh+"</td><td style='width:20%' ><a href='log/findById.action?id="+data.id+"' target='content'>"+data.uname+"</a></td>"+
							"<td style='width:20%'>"+data.dname+"</td><td style='width:20%'>"+data.rname+"</td><td style='width:20%'><a href='log/test.action?datetime=${log.datetime }'>"+data.dateStr+"</a></td></tr>";
				})
				$("#lists").html(html);
			},
			dataType : "json"
		});
		/* $.post("/log/setlist",{uname:'白虎',dname:dname,rname:rname,datetime:datetime},function(result){
		
			console.log("进入post");
			console.log(result);
			var html="<tr><th style='width:20%'>序号<button onclick='find()' type='button'>按钮</button></th>"+
			"<th style='width:20%'>员工姓名</th><th style='width:20%'>部门</th><th style='width:20%'>职位</th>"+
			"<th style='width:20%'>时间</th></tr>";
			$.each(result.list,function(i,data){
				html += "<tr><td>"+data.xh+"</td><td><a href='log/findById.action?id="+data.id+"' target='content'>"+data.uname+"</a></td>"+
						"<td>"+data.dname+"</td><td>${log.rname }</td><td><a href='log/test.action?datetime=${log.datetime }'>"+
								"<fmt:formatDate pattern='yyyy-MM-dd HH:mm:ss' value='${log.datetime }'/></a></td></tr>";
			})
			$("#lists").html(html);
		},"json") */
	}
		
