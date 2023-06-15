/*

package de.iav.jaxrs;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet
public class CarServlet extends HttpServlet {

    private CarService carService;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String pathInfo=request.getPathInfo();
        if(pathInfo==null){
            response.getWriter().println(carService.getAllCars().toString());
        }else
    }
}

*/
