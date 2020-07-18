function logincheck(){
	var id = document.forms["myForm"]["adminId"].value;		
	var pass = document.forms["myForm"]["password"].value;
	var message1 ='管理者IDを入力してください。';
	var message2 ='管理者IDは半角英数字で入力してください。';
	var message3 ='パスワードを入力してください。';
		if(id == ""){				
			alert(message1);
			return false;
		}
		if (/[^a-zA-Z0-9\-\/]/.test(id)) {
			alert(message2);
			return false;
		}else{
			if(pass == ""){
				alert(message3);
				return false;
			}
		}
			return true;
}