<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "classes.Aluno" %>
<jsp:useBean id="aluno" class="classes.Aluno" scope="session"/>
<jsp:setProperty name="aluno" property="nome"  />
    
<jsp:include page="header.jsp" />
<body>

<form action="index.jsp" >
   Login:<input type="text" name="login" />
   Senha:<input type="text" name="password" />
   <input type="submit" name="enviar" />
</form> 

<% if ( request.getParameter("login") != null ) {
	
   if( aluno.validaSenha(request.getParameter("login"),request.getParameter("password"))) { 
 %>
       <jsp:forward page="misturando.jsp" />
 <% }  %>
 <% } %>

</body>
<jsp:include page="footer.jsp" />