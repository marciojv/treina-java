<jsp:useBean id="aluno" class="classes.Aluno" scope="session"/> 
<!-- muuuita calma na hora de colocar o nome da classe acima...
     s� isso me deu uma canseira de dois dias :(  esteja certo
	 de fazer concordar pacote.classe em cada arquivo que os
	 utilizar, sen�o... adeus final de semana ;) -->

<HTML><title>Show the data you just entered!</title>
<BODY>
You has been entered<BR>
Nome: <%=  aluno.getNome() %><BR>
Matricula: <%= aluno.getMatricula() %><BR>
Idade: <%= aluno.getIdade() %><BR>
</BODY>
</HTML>
