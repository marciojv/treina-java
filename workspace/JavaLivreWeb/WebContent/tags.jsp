<html>
<head>
<title>Tags</title>
</head>

<body>

<%! 
   boolean sorteiaBooleano() {
      int i;
      boolean b = false;
      i = (int) (Math.random()*10);	  		  
      if( i % 2 == 0)  
         b = true;		 
      return b;
    }
//Note que a variável predefinida "out"  não está disponível em declarações !	
%>

Quando é sorteado o valor: <font color="#0000FF">
<% boolean saida = sorteiaBooleano();
   out.println(String.valueOf(saida));
%>
</font>
o conteúdo de <br> "misturando.jsp" é concatenado ao final do documento atual.
<br>

 <% if(saida) { %>
       <jsp:include page="misturando.jsp" />
 <% }
    else { %>
       <jsp:forward page="misturando.jsp" />
      
 <% } %>

</body>
</html>
