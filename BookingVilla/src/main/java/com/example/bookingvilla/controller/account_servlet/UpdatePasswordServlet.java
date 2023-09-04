package com.example.bookingvilla.controller.account_servlet;

import com.example.bookingvilla.service.account_service.AccountService;
import com.example.bookingvilla.service.account_service.IAccountService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UpdatePasswordServlet", value = "/update-password")
public class UpdatePasswordServlet extends HttpServlet {
    private IAccountService iAccountService = new AccountService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String oldPass = request.getParameter("oldPass");
        String newPass = request.getParameter("newPass");
        if(iAccountService.login(userName,oldPass)){
            iAccountService.updatePassword(newPass,userName);
            response.sendRedirect("login.jsp");
        }
        else {
        }
    }
}