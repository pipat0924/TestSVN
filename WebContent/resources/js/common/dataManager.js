/**
 * 
 */


function asyncAjax(){
		var data  ;
		this.ajaxElement = function(){
			var jqxhr = $.ajax({ 
				contentType : "application/json",
				url: "/SpringJDBC"+"/got/gotinclude.html",
				type: "GET",
				data:"",
				dataType: "json",
				ache: false,
				async:false,
				success : function(da) {
					console.log("SUCCESS: ", da.text);
					data = da.text;
				},
				error : function(e) {
					console.log("ERROR: ", e);
				},
				done : function(e) {
					console.log("DONE");
					enableSearchButton(true);
				}
				});
			return data;
		}
}