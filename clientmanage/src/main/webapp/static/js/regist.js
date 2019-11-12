/**
 * 省 市 区js
 */

$(function() {
	$.ajax({
		type : 'post',
		url : "pca.action",
		data : {
			type : 1
		},
		success : function(result) {
			var html = "<option value='0'>-prov-</option>";
			$.each(result, function(i, data) {

				html += "<option value='" + data.provinceId + "'>"
						+ data.province + "</option>";
			});
			$("#provinceId").html(html);
		},
		dataType : "json"
	});
});
function showCity(pid) {
	$.ajax({
		type : 'post',
		url : "pca.action",
		data : {
			type : 2,
			provinceId : pid
		},
		success : function(result) {
			var html = "<option value='0'>-city-</option>";
			$.each(result, function(i, data) {
				html += "<option value='" + data.cityId + "'>" + data.city
						+ "</option>";
			});
			$("#cityId").html(html);
		},
		dataType : "json"
	});
	showArea(0);
};
function showArea(cid) {

	$.ajax({
		type : 'post',
		url : "pca.action",
		data : {
			type : 3,
			cityId : cid
		},
		success : function(result) {
			var html = "option value='0'>-area-</option>";
			$.each(result, function(i, data) {
				html += "<option value='" + data.areaId + "'>" + data.areas
						+ "</option>";
			});
			$("#areaId").html(html);
		},
		dataType : "json"
	});
}
