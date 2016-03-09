/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch3.gunjan;

import com.ch3.gunjan.model.BeerExpert;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author grsky
 */
public class BeerSelect extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("Beer Selection Advice <br>");
        String c = request.getParameter("color");

        BeerExpert b = new BeerExpert();

        List results = b.getBrands(c);

        request.setAttribute("styles", results);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }

}
