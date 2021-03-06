<%--
  Created by IntelliJ IDEA.
  User: Andrea
  Date: 2019-04-01
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="author" content="Andrea Rochira"/>
    <meta name="description" content="Java Servlet - index.jsp"/>
    <title id="title">${name}</title>
    <link href="CSS/output.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<header>
    <h1>${name}</h1>
</header>
<main>
    <div class="flex">
        <div class="list">
            <p>Volume: ${volume}</p>
            <p>Orbital Period: ${orbitalPeriod}</p>
            <p>Known Satellites: ${knownSatellites}</p>
            <p>Habitable: ${habitable}</p>
        </div>
        <%-- the following is a way to dinamically set the path fot the src attribute--%>
        <a href="<%=request.getAttribute("address")%>"><img src="<%=request.getAttribute("picPath")%>"></a>
    </div>
    <div class="description">
        <p>${description} <a href="https://www.space.com/16080-solar-system-planets.html">(Source)</a></p>
        <button type="button"><a href="index.jsp">Back to main page</a></button>
    </div>
    <br>
</main>
<footer>
    <div class="footer">
        <p>Created by Andrea Rochira</p>
        <p>CIT360 - Final Project</p>
    </div>
</footer>
</body>
</html>
