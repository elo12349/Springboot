function searchcheck(){
	var id = document.forms["myform"]["memberId"].value;			
	var message1 ='会員IDを入力してください。';
	var message2 ='会員IDは半角英数字で入力してください。';	
	
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
function validate() {
	var message3 ='返却する本が選択されていません。';
    if (document.getElementById('check').checked) {
        alert("checked");
    } else {
        alert(message3);
    }
}    
function disablecheck(txt){
	var bt = document.getElementById('btn_henkyaku');
        if (txt.value != '') {
            bt.disabled = false;
        }
        else {
            bt.disabled = true;
        }
}

