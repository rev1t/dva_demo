$(document).ready( function () {
	 var table = $('#customersTable').DataTable({
			"sAjaxSource": "/customers",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id" },
		          { "mData": "firstname" },
				  { "mData": "lastname" },
				  { "mData": "address" },
				  { "mData": "postal" },
				  { "mData": "phone" },
				  { "mData": "email"},
				  { "mData": "claims",
				   "render": function(mData, type, row, meta){
                		data = '<a href="#" onclick="return check(' + mData[0].id + ",'" + mData[0].category + "','" + mData[0].description + "'" + ')">' + 'Claim Details' + '</a>';
           			return data;
         			}
				  }
				  		
				  
				 
				  
			]
	 });
	 
});