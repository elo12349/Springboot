function Kashidashicheck(){
	var id = document.forms["myform"]["Id"].value;		
	var message1 ='管理者IDを入力してください。';
	var message2 ='管理者IDは半角英数字で入力してください。';
		if(id == ""){				
			alert(message1);
			return false;
		}
		if (/[^a-zA-Z0-9\-\/]/.test(id)) {
			alert(message2);
			return false;
		}
			return true;
}