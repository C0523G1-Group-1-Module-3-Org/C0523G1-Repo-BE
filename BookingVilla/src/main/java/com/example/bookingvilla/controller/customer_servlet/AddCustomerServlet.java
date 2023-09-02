package com.example.bookingvilla.controller.customer_servlet;

import com.example.bookingvilla.model.Customer;
import com.example.bookingvilla.service.customer_service.CustomerService;
import com.example.bookingvilla.service.customer_service.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddCustomerServlet", value = "/add_customer")
public class AddCustomerServlet extends HttpServlet {
    ICustomerService iCustomerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        String name = request.getParameter("fullName");
//        String identityNumber = request.getParameter("identityNumber");
//        String dateOfBirth = request.getParameter("dateOfBirth");
//        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
//        String phoneNumber = request.getParameter("phoneNumber");
//        String address = request.getParameter("address");
//        String email = request.getParameter("email");
//        iCustomerService.saveCustomer(new Customer(name,identityNumber,dateOfBirth,gender,phoneNumber,address,email));
//        response.sendRedirect("/user.jsp");
    }
}