package Servlets;

import Entities.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(name = "Controller")
public class Controller extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // create HashMap to contain planet names and corresponding class methods
        HashMap<String, Planet> planetMap = new HashMap<>();

        // store the planet name selected in the index.jsp file
        String button = request.getParameter("planet");


        switch (button) {
            case "mercury":
                planetMap.put(button, new Planet());
                break;
            case "venus":
                planetMap.put(button, new Planet());
                break;
            case "mars":
                planetMap.put(button, new Planet());
                break;
            case "earth":
                planetMap.put(button, new Planet());
                break;
            case "jupiter":
                planetMap.put(button, new Planet());
                break;
            case "saturn":
                planetMap.put(button, new Planet());
                break;
            case "uranus":
                planetMap.put(button, new Planet());
                break;
            case "neptune":
                planetMap.put(button, new Planet());
                break;
        }

        // retrieve the HashMap entry and call for the method that starts the two threads
        planetMap.get(button).entryPoint(button);

        String description = WikiThread.p;


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Response from doGet method");
    }
}
