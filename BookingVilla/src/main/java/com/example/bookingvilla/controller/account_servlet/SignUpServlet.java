package com.example.bookingvilla.controller.account_servlet;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.service.account_service.AccountService;
import com.example.bookingvilla.service.account_service.IAccountService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignUp", value = "/signup")
public class SignUpServlet extends HttpServlet {
    private IAccountService iAccountService = new AccountService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("phoneNumber");
        String password = request.getParameter("password");
        String passwordConfirm = request.getParameter("passwordConfirm");
        if (password.equals(passwordConfirm)) {
            iAccountService.save(new Account(userName, password));
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else {
            response.sendRedirect("/signup.jsp");
        }
    }
}