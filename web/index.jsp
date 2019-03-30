<%--
  Created by IntelliJ IDEA.
  User: Andrea
  Date: 2019-03-29
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8"/>
    <meta name="author" content="Andrea Rochira"/>
    <meta name="description" content="Java Servlet - index.jsp"/>
    <title id="title">Planetarium</title>
    <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
  </head>
  <body>
    <header>
      <h1>The Solar System</h1>
    </header>
    <main>
      <section>Click on any planet for more details</section>
      <form action="Controller" method="post">
        <button type="submit" class="planet" name="planet" value="Mercury">Mercury</button>
        <button type="submit" class="planet" name="planet" value="Venus">Venus</button>
        <button type="submit" class="planet" name="planet" value="Mars">Mars</button>
        <button type="submit" class="planet" name="planet" value="Earth">Earth</button>
        <button type="submit" class="planet" name="planet" value="Jupiter">Jupiter</button>
        <button type="submit" class="planet" name="planet" value="Saturn">Saturn</button>
        <button type="submit" class="planet" name="planet" value="Uranus">Uranus</button>
        <button type="submit" class="planet" name="planet" value="Neptune">Neptune</button>
      </form>
    </main>
    <footer>
      <div class="footer">
        <p>Created by Andrea Rochira</p>
        <p>CIT360 - Final Project</p>
      </div>
    </footer>
  </body>
</html>
