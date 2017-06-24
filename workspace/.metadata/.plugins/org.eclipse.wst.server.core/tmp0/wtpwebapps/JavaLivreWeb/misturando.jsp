<html>
<head>
<title>Tabela Din&acirc;mica</title>
</head>

<body>
<TABLE BORDER=2>
<% for ( int i = 0; i < 20; i++ ) { 

      if ( i % 2 == 0 ) { %>
       <TR bgcolor="#CCFFFF">
	   <% } 
	   else { %>
	      <TR bgcolor="#FFFFCC">
	   <% } %>
	   
       <TD>Number</TD>
		
		<% for (int j = 1; j < 11; j++) { %>
              <TD><%= i*10 + j %></TD>              
		
		<% }  %>
		
		</TR>
    <% } %>
</TABLE>
</body>
</html>
