function searchcheck() {
			var id = document.forms["myform"]["bookId"].value;	
			var MSG0001 ='本IDが未入力';
			var MSG0002 ='本IDは半角英数字で入力してください。';
			if(id == ""){				
				alert(MSG0001);
				return false;
			}
				if (id.match(/[^a-zA-Z0-9\-\/]/)) {
					alert(MSG0002);
					return false;
			}
			return true;
		}
function insertcheck(){
			var id = document.getElementById("bookId").value;	
			var MSG0001='本IDが未入力'; 
			var MSG0002='本IDは半角英数字で入力してください。';
			var title = document.getElementById("bookTitle").value;
			var MSG0006='本タイトルを入力してください。';
			var authorname = document.getElementById("authorName").value;
			var MSG0007='著者名を入力してください。';
			var publisher = document.getElementById("publisher").value; 
			var MSG0008='出版社を入力してください。';
			var publicationyear = document.getElementById("publishcationYear").value; 
			var publicationmonth = document.getElementById("publishcationMonth").value;
			var publicationdate = document.getElementById("publishcationDate").value; 
			var MSG0009_Y='出版年月日(年)が未入力';
			var MSG0009_M='出版年月日(月)が未入力';
			var MSG0009_D='出版年月日(日)が未入力';
			var MSG0010_Y='出版年月日(年)が半角数字以外';
			var MSG0010_M='出版年月日(月)が半角数字以外';
			var MSG0010_D='出版年月日(日)が半角数字以外';
			if(id == ""){				
				alert(MSG0001);
				if(title == ""){
					alert(MSG0006);
					return false;	
				}
				if(authorname == ""){
					alert(MSG0007);
					return false;
				}
				if(publisher == ""){
					alert(MSG0008);
					return false;
				}
				if(publicationyear == ""){
					alert(MSG0009_Y);
					return false;
				}
				if(publicationmonth == ""){
					alert(MSG0009_M);
					return false;
				}				
				if(publicationdate == ""){
					alert(MSG0009_D);
					return false;
				}			
			}else{
				if (id.match(/[^a-zA-Z0-9\-\/]/)) {
					alert(MSG0002);  	 
					return false;     		
				}
				if(title == ""){
					alert(MSG0006);	
					return false;
				}
				if(authorname == ""){
					alert(MSG0007);
					return false;
				}
				if(publisher == ""){
					alert(MSG0008);
					return false;
				}
				if(publicationyear == ""){
					alert(MSG0009_Y);
					return false;
				}
				if(publicationmonth == ""){
					alert(MSG0009_M);
					return false;
				}
				if(publicationdate == ""){
					alert(MSG0009_D);
					return false;
				}				
				}if (/[^a-zA-Z0-9\-\/]/.test(publicationyear)) {
					alert(MSG0010_Y);  
					return false;	      		
				}if (/[^a-zA-Z0-9\-\/]/.test(publicationmonth)) {
					alert(MSG0010_M); 
					return false;	      		
				}if (/[^a-zA-Z0-9\-\/]/.test(publicationdate)) {
					alert(MSG0010_D); 
					return false; 	      		
				}
				return true;
		}
function updatecheck(){
			var id = document.getElementById("bookId").value;	
			var MSG0001='本IDが未入力'; 
			var MSG0002='本IDは半角英数字で入力してください。';
			var title = document.getElementById("bookTitle").value;
			var MSG0006='本タイトルを入力してください。';
			var authorname = document.getElementById("authorName").value;
			var MSG0007='著者名を入力してください。';
			var publisher = document.getElementById("publisher").value; 
			var MSG0008='出版社を入力してください。';
			var publicationyear = document.getElementById("publishcationYear").value; 
			var publicationmonth = document.getElementById("publishcationMonth").value;
			var publicationdate = document.getElementById("publishcationDate").value; 
			var MSG0009_Y='出版年月日(年)が未入力';
			var MSG0009_M='出版年月日(月)が未入力';
			var MSG0009_D='出版年月日(日)が未入力';
			var MSG0010_Y='出版年月日(年)が半角数字以外';
			var MSG0010_M='出版年月日(月)が半角数字以外';
			var MSG0010_D='出版年月日(日)が半角数字以外';
			if(id == ""){				
				alert(MSG0001);
				if(title == ""){
					alert(MSG0006);
					return false;	
				}
				if(authorname == ""){
					alert(MSG0007);
					return false;
				}
				if(publisher == ""){
					alert(MSG0008);
					return false;
				}
				if(publicationyear == ""){
					alert(MSG0009_Y);
					return false;
				}
				if(publicationmonth == ""){
					alert(MSG0009_M);
					return false;
				}				
				if(publicationdate == ""){
					alert(MSG0009_D);
					return false;
				}			
			}else{
				if (id.match(/[^a-zA-Z0-9\-\/]/)) {
					alert(MSG0002);  	 
					return false;     		
				}
				if(title == ""){
					alert(MSG0006);	
					return false;
				}
				if(authorname == ""){
					alert(MSG0007);
					return false;
				}
				if(publisher == ""){
					alert(MSG0008);
					return false;
				}
				if(publicationyear == ""){
					alert(MSG0009_Y);
					return false;
				}
				if(publicationmonth == ""){
					alert(MSG0009_M);
					return false;
				}
				if(publicationdate == ""){
					alert(MSG0009_D);
					return false;
				}				
				}if (/[^a-zA-Z0-9\-\/]/.test(publicationyear)) {
					alert(MSG0010_Y);  
					return false;	      		
				}if (/[^a-zA-Z0-9\-\/]/.test(publicationmonth)) {
					alert(MSG0010_M); 
					return false; 	      		
				}if (/[^a-zA-Z0-9\-\/]/.test(publicationdate)) {
					alert(MSG0010_D); 
					return false;      		
				}
			return true;
		}
function deletecheck(){	
			var id = document.getElementById("bookId").value;	
			var MSG0001 ='本IDが未入力、本IDを入力してください。';
			var MSG0002 ='本IDは半角英数字で入力してください。';
				if(id == ""){					
					alert(MSG0001);
					return false;
				}
					if (id.match(/[^a-zA-Z0-9\-\/]/)) {
						alert(MSG0002);
						return false;
				}
			return true;
}		
function success() { 
	if(document.getElementById("bookId").value===""){
		document.getElementById('btn_insert').disabled = true;
	}else if(document.getElementById("bookTitle").value===""){ 
            document.getElementById('btn_insert').disabled = true; 
    }else if(document.getElementById("authorName").value===""){
			document.getElementById('btn_insert').disabled = true; 
	}else if(document.getElementById("publisher").value===""){
			document.getElementById('btn_insert').disabled = true;
	}else if(document.getElementById("publishcationYear").value===""){
			document.getElementById('btn_insert').disabled = true;
	}else if(document.getElementById("publishcationMonth").value===""){
			document.getElementById('btn_insert').disabled = true;
	}else if(document.getElementById("publishcationDate").value===""){
			document.getElementById('btn_insert').disabled = true;
	}else{
		document.getElementById('btn_insert').disabled = false;
	}	
	////insert
	if(document.getElementById("bookId").value===""){
		document.getElementById('btn_delete').disabled = true;
	}else{
		document.getElementById('btn_delete').disabled = false;
	}
	////delete
	if(document.getElementById("bookTitle").value===""){ 
            document.getElementById('btn_update').disabled = true; 
    }else if(document.getElementById("authorName").value===""){
			document.getElementById('btn_update').disabled = true; 
	}else if(document.getElementById("publisher").value===""){
			document.getElementById('btn_update').disabled = true;
	}else if(document.getElementById("publishcationYear").value===""){
			document.getElementById('btn_update').disabled = true;
	}else if(document.getElementById("publishcationMonth").value===""){
			document.getElementById('btn_update').disabled = true;
	}else if(document.getElementById("publishcationDate").value===""){
			document.getElementById('btn_update').disabled = true;
	}else{
		document.getElementById('btn_update').disabled = false;
	}	
	///update
}
