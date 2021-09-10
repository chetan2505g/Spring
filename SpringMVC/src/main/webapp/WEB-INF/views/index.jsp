<%@page import="java.util.List"%>
<Html>
<body>
	<%
		String name = (String) request.getAttribute("name");
		List<String> f = (List<String>) request.getAttribute("f");
	%>
	My Name is:	<%=name%>
	My Frind is:	<%=f%>

</body>
</Html>
