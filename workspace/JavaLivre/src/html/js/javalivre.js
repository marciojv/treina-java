/**
 * 
 */

function ola2() {
	alert("Este e o Ola2");
}

function escreveMensagem() { 
	//document.open(); 
	//document.writeln("<title>Teste</title><body>OLA</body>");		 
	//document.close(); 
}

function mostraEstadoUsuario() {
   //var estado = document.getElementById("form1").estadologin.value;
   var estado = document.getElementById("estadologin").value;   
   var usuario = document.getElementsByName("login")[0].value;   
   var msg = "Seu estado é: " + estado  + ", obrigado " + usuario;    
  // alert(msg);
   
   var email = usuario + "@ambientelivre.com.br";
   document.getElementById("emailrecupera").value = email;
   document.getElementById("botaorecuperasenha").value = "Gere aqui sua senha " + usuario ;      
   document.getElementById("estadorecupera").style.color = "red"; 
   document.getElementById("estadocontrato").style = "display:none"; 
     
}


function validaSenha() {
	var usuario = document.getElementById("usuariologin").value;
	var senha   = document.getElementById("senha").value;
	
	if (( usuario == "admin") && ( senha == "sejalivre")) {
		alert("Login Ok!")		
	} 
	else {
		alert("senha errada!")
	} 		
}

function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i=0;i<vars.length;i++) {
      var pair = vars[i].split("=");
      if (pair[0] == variable) {
        return pair[1];
      }
    } 
    alert('Query Variable ' + variable + ' not found');
  }
  

 




