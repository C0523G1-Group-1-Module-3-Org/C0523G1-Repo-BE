<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Log In</title>
    <link rel="stylesheet" href="css_index/login_sign_up.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="css_index/main_page_css.css">
</head>
<body>
<section class="vh-100 bg-image" style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
    <div class="mask d-flex align-items-center h-100 gradient-custom-3">
        <div class="container h-100">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                    <div class="card" style="border-radius: 15px;">
                        <div class="card-body p-5">
                            <div class="form-outline mb-4"><img style="width: 100%; height: auto; margin-bottom:6%; align-items: center" src="css_index/logo/logo.png" alt=""></div>
                            <form action="/login" method="post">

                                <p class="text-danger" role="alert">${message}</p>
                                <span id="phoneNumberFormatError" class="text-danger" role="alert"></span>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="phoneNumber">Số điện thoại</label>
                                    <input onblur="validatePhoneNumber()" onfocus="clearErrorPhoneNumber()" type="tel" id="phoneNumber" name="phoneNumber" class="form-control form-control-lg" required/>
                                </div>

                                <span id="passwordFormatError" class="text-danger" role="alert"> </span>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="password">Mật khẩu</label>
                                    <input onblur="validatePassword()" onfocus="clearErrorPassword()" type="password" id="password" name="password" class="form-control form-control-lg" required />
                                </div>
                                <div class="form-outline mb-4">
                                    <a style="float: left" href="signup.jsp" class="fw-bold text-body"><u>Đăng ký</u></a>
                                    <a style="float: right" href="/forgot_password.jsp" class="fw-bold text-body"><u>Quên mật khẩu?</u></a>
                                </div>
                                <div>
                                    <button  onclick="validatePhoneNumber()" id="submitButton"  type="submit" class="backgroundcolor-2 hover btn-login">Đăng nhập</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
<script src="javascript/validate_form.js"></script>
</body>
</html>
<%--<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h1 class="modal-title fs-5" id="exampleModalLabel">Đổi mật khẩu</h1>--%>
<%--            </div>--%>
<%--            <form action="/update-password" method="post">--%>
<%--                <div class="modal-body">--%>


<%--                    <span id="userNameForMatError" class="text-danger" role="alert"> </span>--%>

<%--                    <div class="form-outline mb-3">--%>
<%--                        <label class="form-label" for="oldPass">Số điện thoại</label>--%>
<%--                        <input onblur="validatePhoneNumberUpdate()" onfocus="clearErrorPhoneNumberUpdate()" type="text" class="form-control form-control-lg" name="userName" id="userName" required />--%>
<%--                    </div>--%>

<%--                    <span id="oldPasswordUpdateFormatError" class="text-danger" role="alert"> </span>--%>

<%--                    <div class="form-outline mb-3">--%>
<%--                        <label class="form-label" for="oldPass">Số CMND/CCCD</label>--%>
<%--                        <input onblur="validatePasswordUpdate()" onfocus="clearErrorPasswordUpdate()" type="password" class="form-control form-control-lg" name="oldPass" id="oldPass" required />--%>
<%--                    </div>--%>

<%--                    <span id="newPasswordFormatError" class="text-danger" role="alert"></span>--%>

<%--                    <div class="form-outline mb-3">--%>
<%--                        <label class="form-label" for="newPass">Mật khẩu mới</label>--%>
<%--                        <input onblur="validateNewPasswordUpdate()" onfocus="clearErrorNewPasswordUpdate()" type="password" class="form-control form-control-lg" name="newPass" id="newPass" required />--%>
<%--                    </div>--%>

<%--                    <span id="passwordConfirmError" class="text-danger" role="alert"> </span>--%>

<%--                    <div class="form-outline mb-3">--%>
<%--                        <label class="form-label" for="passConfirm">Nhập lại mật khẩu</label>--%>
<%--                        <input onblur="validatePasswordUpdateConfirm()" onfocus="clearErrorPasswordUpdateConfirm()" type="password"  class="form-control form-control-lg" name="passConfirm" id="passConfirm" required />--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button  type="button" class="modal-btn backgroundcolor-2 hover" data-bs-dismiss="modal">Đóng</button>--%>
<%--                    <button id="btn-update-pass" type="submit" class="modal-btn backgroundcolor-2 hover">Lưu lại</button>--%>
<%--                </div>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>