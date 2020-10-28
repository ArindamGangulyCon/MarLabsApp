<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<a href="${pageContext.request.contextPath}/welcome">Home</a> | &nbsp; </br>

	<u><h2 style="color: red;">	
		<a href="${pageContext.request.contextPath}/getQuestion">Are you willing to check your mathematics skill ? Click here !!!   </br>
	</h3></u>
	
    <!--  a href="${pageContext.request.contextPath}/getEmployees">Show Employees</a> </br -->
        |   <u><h2 style="color: red;">
            <a onclick="document.forms['logoutForm'].submit()">Logout</a>
            </h3></u>

    <form id="logoutForm" method="POST" action="${contextPath}/logout">
    </form>

</div>