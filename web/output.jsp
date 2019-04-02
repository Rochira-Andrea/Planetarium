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
    <div class="list">
        <p>Volume: ${volume}</p>
        <p>Orbital Period: ${orbitalPeriod}</p>
        <p>Known Satellites: ${knownSatellites}</p>
        <p>Habitable: ${habitable}</p>
    </div>
    <div class="description">
        <p>${description}</p>
        <button type="button"><a style="text-decoration:none" href="index.jsp">Back to main page</a></button>
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
