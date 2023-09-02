package com.example.bookingvilla.controller.account_servlet;

import com.example.bookingvilla.common.validate.ValidateAccount;
import com.example.bookingvilla.common.validate.ValidateCustomer;
import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.model.Customer;
import com.example.bookingvilla.service.account_service.AccountService;
import com.example.bookingvilla.service.account_service.IAccountService;
import com.example.bookingvilla.service.customer_service.CustomerService;
import com.example.bookingvilla.service.customer_service.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignUp", value = "/signup")
public class SignUpServlet extends HttpServlet {
    private IAccountService iAccountService = new AccountService();
    private ICustomerService iCustomerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("fullName");
        String dateOfBirth = request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String address = request.getParameter("address");
        String userName = request.getParameter("phoneNumber");
        String password = request.getParameter("password");
        String identityNumber = request.getParameter("identityNumber");
        String email = request.getParameter("email");
        if (ValidateAccount.validatePhoneNumberToSignUp(userName)
                && ValidateCustomer.validateIdentityNumber(identityNumber)
                && ValidateCustomer.validateEmail(email)) {
            iAccountService.save(new Account(userName, password));
            Account account = iAccountService.getAccountByUserName(userName);
            Customer customer = new Customer(name, identityNumber, dateOfBirth, gender, userName, email,
                    address, account.getAccountCode());
            iCustomerService.saveCustomer(customer);
            response.sendRedirect("login.jsp");
        } else if (!ValidateAccount.validatePhoneNumberToSignUp(userName)) {
            request.setAttribute("phoneNumberError", "Số điện thoại này đã đăng ký!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (!ValidateCustomer.validateIdentityNumber(identityNumber)) {
            request.setAttribute("identityNumberError", "Số CMND/CCCD đã đăng ký!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (!ValidateCustomer.validateEmail(email)) {
            request.setAttribute("emailError", "Email đã đăng ký");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }

    }
}