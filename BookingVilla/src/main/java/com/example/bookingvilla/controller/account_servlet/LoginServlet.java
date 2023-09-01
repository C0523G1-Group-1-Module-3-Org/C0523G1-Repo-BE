package com.example.bookingvilla.controller.account_servlet;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.service.account_service.AccountService;
import com.example.bookingvilla.service.account_service.IAccountService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {
    private IAccountService iAccountService = new AccountService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (iAccountService.login(userName,password)){
            // Không cần đẩy dữ liệu về trang index nên dùng respone
            response.sendRedirect("index.jsp");
        }else {
            request.setAttribute("message","Sai tên tài khoản hoặc mật khẩu!");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}