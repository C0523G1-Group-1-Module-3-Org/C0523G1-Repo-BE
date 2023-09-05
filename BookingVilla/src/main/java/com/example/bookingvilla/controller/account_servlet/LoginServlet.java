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

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {
    private IAccountService iAccountService = new AccountService();
    private ICustomerService iCustomerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "showInformationUser":
                showInformationUser(request, response);
                break;
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "login":
                login(request, response);
                break;
            case "update":
                update(request, response);
                break;
            case "changePassword":
                changePassword(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int accountCode = Integer.parseInt(request.getParameter("accountCode"));
        iAccountService.deleteAccountAndCustomer(accountCode);
        try {
            response.sendRedirect("login.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void changePassword(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        Account account = iAccountService.getAccountByUserName(customer.getPhoneNumber());
        String oldPass = request.getParameter("oldPassword");
        String newPass = request.getParameter("password");
        if(oldPass.equals(account.getPassword())){
            iAccountService.updatePassword(newPass,customer.getPhoneNumber());
            showInformationUser(request,response);
        }else {
            request.setAttribute("oldPasswordError","Mật khẩu không đúng! Mời nhập lại");
            try {
                request.getRequestDispatcher("change-password.jsp").forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        String fullName = request.getParameter("fullName");
        String identityNumber = request.getParameter("identityNumber");
        String birthday = request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int customerCode = customer.getCustomerCode();
        Customer oldCustomer = iCustomerService.getCustomerByCustomerCode(customer.getCustomerCode());
        if (oldCustomer.getPhoneNumber().equals(phoneNumber) && oldCustomer.getIdentityNumber().equals(identityNumber)
                && oldCustomer.getEmail().equals(email)) {
            iCustomerService.updateCustomer(fullName, identityNumber, birthday, gender, phoneNumber, email, address, customerCode);
        }
        if(!(oldCustomer.getEmail().equals(email)) && oldCustomer.getIdentityNumber().equals(identityNumber)
        && oldCustomer.getPhoneNumber().equals(phoneNumber)){
            if(ValidateCustomer.validateEmail(email)){
                iCustomerService.updateCustomer(fullName, identityNumber, birthday, gender, phoneNumber, email, address, customerCode);
            }
            else {
                request.setAttribute("emailError","Email đã tồn tại");
                try {
                    request.getRequestDispatcher("form-update-user.jsp").forward(request,response);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if(oldCustomer.getEmail().equals(email) && !(oldCustomer.getIdentityNumber().equals(identityNumber))
                && oldCustomer.getPhoneNumber().equals(phoneNumber)){
            if (ValidateCustomer.validateIdentityNumber(identityNumber)){
                iCustomerService.updateCustomer(fullName, identityNumber, birthday, gender, phoneNumber, email, address, customerCode);
            }
            else {
                request.setAttribute("identityNumberError","Số CMND/CCCD đã tồn tại");
                try {
                    request.getRequestDispatcher("form-update-user.jsp").forward(request,response);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if(oldCustomer.getEmail().equals(email) && oldCustomer.getIdentityNumber().equals(identityNumber)
                && !(oldCustomer.getPhoneNumber().equals(phoneNumber))){
            if (ValidateAccount.validatePhoneNumberToSignUp(phoneNumber)){
                iCustomerService.updateCustomer(fullName, identityNumber, birthday, gender, phoneNumber, email, address, customerCode);
                iAccountService.updateUserName(phoneNumber,customer.getAccountCode());
            }
            else {
                request.setAttribute("phoneNumberError","Số điện thoại đã tồn tại");
                try {
                    request.getRequestDispatcher("form-update-user.jsp").forward(request,response);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
            Customer newCustomer = iCustomerService.getCustomerByPhoneNumber(phoneNumber);
            session.setAttribute("customer", newCustomer);
            showInformationUser(request, response);
    }

    private void showInformationUser(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        session.setAttribute("accountCode",customer.getAccountCode());
        session.setAttribute("userName", customer.getCustomerName());
        session.setAttribute("identityNumber", customer.getIdentityNumber());
        session.setAttribute("birthday", customer.getDateOfBirth());
        if (customer.isGender()) {
            session.setAttribute("gender", "Nữ");
        } else {
            session.setAttribute("gender", "Nam");
        }
        session.setAttribute("phoneNumber", customer.getPhoneNumber());
        session.setAttribute("email", customer.getEmail());
        session.setAttribute("address", customer.getAddress());
        try {
            request.getRequestDispatcher("user-information.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("phoneNumber");
        String password = request.getParameter("password");
        if (iAccountService.login(userName, password)) {
            try {
                response.sendRedirect("user-information.jsp");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            request.setAttribute("message", "Sai tên tài khoản hoặc mật khẩu!");
            try {
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        HttpSession session = request.getSession();
        Customer customer = iCustomerService.getCustomerByPhoneNumber(userName);
        session.setAttribute("customer", customer);
    }
}