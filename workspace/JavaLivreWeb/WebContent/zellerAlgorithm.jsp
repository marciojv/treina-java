<%@ page import = "zeller.WeekDay" %>
<jsp:useBean id="user" class="zeller.WeekDay" scope="session"/>
<jsp:setProperty name="user" property="*"/>
<html>
<head>
<title>Em que dia voc&ecirc; nasceu?</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<style type="text/css">
<!--
.style1 {font-size: 18px}
-->
</style></head>

<body>
<p class="style1">Digite o dia, m&ecirc;s e ano de seu nascimento e descubra em<br>
dia da semana esse fato ocorreu.  Use apenas dois dígitos.</p>
<form name="form1" method="get" action="">
  Dia&nbsp;&nbsp;&nbsp;&nbsp;  
  <input name="dia" type="text" >
  <p>M&ecirc;s &nbsp;&nbsp;
    <input name="mes" type="text" >
  </p>
  <p>Ano&nbsp;&nbsp;&nbsp;
    <input name="ano" type="text" >
  </p>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        <input type="submit" name="Submit" value="Calcular">
    </p>
</form>
<p class="style1">&nbsp;</p>
<p class="style1">O dia &nbsp;<font color="#0000FF">
<%= user.getDia() %> / 
<%= user.getMes() %> / 
<%= user.getAno() %></font>
&nbsp;foi&nbsp;&nbsp;<font color="#FF0000">
<%= user.getDay() %></font>
</p>
</body>
</html>
