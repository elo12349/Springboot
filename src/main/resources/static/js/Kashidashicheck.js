function searchcheck(){
	var id = document.forms["myform"]["Id"].value;			
	var message1 ='本IDを入力してください。';
	var message2 ='本IDは半角英数字で入力してください。';
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
function Kashidashicheck(){
	var memberid =document.forms["memberId"]["MemberId"].value;
	var message3 ='会員IDを入力してください。';
	var message4 ='会員IDは半角英数字で入力してください。';
		if(memberid == ""){
			alert(message3);
			return false;
		}
		if(/[^a-zA-Z0-9\-\/]/.test(memberid)){
			alert(message4);
			return false;
		}
		return true;

}