$(document).ready( function () {
	 var table = $('#hotelsTable').DataTable({
			"sAjaxSource": "/hotels",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "name" },
				  { "mData": "adddress" },
				  { "mData": "zip" }
			]
	 })
});