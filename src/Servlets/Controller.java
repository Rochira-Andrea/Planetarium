package Servlets;

import Entities.Planet;
import Hibernate.Sphere;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    public static String p;
    public static Sphere hiberSphere;

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

        ArrayList<Object> myList = planetMap.get(button).entryPoint(button);

        hiberSphere = (Sphere)myList.get(0);
        p = (String) myList.get(1);

        // set the parameters to pass to the output.jsp
        request.setAttribute("name", hiberSphere.getName());
        request.setAttribute("volume",hiberSphere.getVolume());
        request.setAttribute("orbitalPeriod",hiberSphere.getOrbitalPeriod());
        request.setAttribute("knownSatellites",hiberSphere.getSatellite());
        request.setAttribute("habitable",hiberSphere.getHabitable());
        request.setAttribute("description", p);
        request.getRequestDispatcher("output.jsp").include(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Response from doGet method");
    }
}
