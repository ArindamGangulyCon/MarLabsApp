<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Numbers</title>
</head>
<%-- <jsp:include page="menu.jsp" /> --%>
<body>
	<h3 style="color: red;">Add all numbers</h3>

	<div id="receiveAnswer">
			<p>
				<label>${question.ques}</label>
			<%-- <form:input path="question" /> --%>
			</p>
		<form:form action="/submitAnswer" method="post"
			modelAttribute="question">
			<p>
				<label>Enter sum number</label>
				<form:input path="sumNumber" />
			</p>
  	<input type="hidden" value="${question.ques}" name="ques"/>
   <input type="hidden" value="${question.totalSum}" name="totalSum"/>
  
			<input type="SUBMIT" value="Submit" />
		</form:form>
		<p>
			<label>Sum : ${question.sumNumber}</label>
			<label> ${question.msg}</label>					
		</p>
		
	</div>
</body>
</html>
