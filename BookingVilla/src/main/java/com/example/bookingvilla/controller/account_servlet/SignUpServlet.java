package com.example.bookingvilla.controller.account_servlet;

import com.example.bookingvilla.common.validate.ValidateAccount;
import com.example.bookingvilla.common.validate.ValidateCustomer;
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
        String identityNumber = request.getParameter("identityNumber");
        if (ValidateAccount.validatePhoneNumberToSignUp(userName) && password.equals(passwordConfirm) && ValidateAccount.validatePassword(password)&& ValidateCustomer.validateIdentityNumber(identityNumber)) {
            iAccountService.save(new Account(userName, password));
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else if (!ValidateAccount.validatePhoneNumberToSignUp(userName)) {
            request.setAttribute("message1","Số điện thoại sai định dạng hoặc đã tồn tại!");
            request.getRequestDispatcher("/signup.jsp").forward(request,response);
        }else if (!password.equals(passwordConfirm)){
            request.setAttribute("message3", "Mật khẩu không trùng khớp");
            request.getRequestDispatcher("/signup.jsp").forward(request,response);
        }else  if (!ValidateAccount.validatePassword(password)){
            request.setAttribute("message2", "Mật khẩu phải chứa ít nhất 8 kí tự, ít nhất 1 số và cả chữ thường và chữ hoa");
            request.getRequestDispatcher("/signup.jsp").forward(request,response);
        }else if(!ValidateCustomer.validateIdentityNumber(identityNumber)){
            request.setAttribute("message4","Số CMND/CCCD sai định dạng hoặc đã tồn tại");
            request.getRequestDispatcher("/signup.jsp").forward(request,response);
        }

    }
}