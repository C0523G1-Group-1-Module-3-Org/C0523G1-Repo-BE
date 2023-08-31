<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 8/31/2023
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="css_index/login.css">
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
                            <h2 class="text-uppercase text-center mb-5">Đăng ký</h2>
                            <form>
                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example1cg">Họ và tên</label>
                                    <input type="text" id="form3Example1cg" class="form-control form-control-lg" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example3cg">CMND/CCCD</label>
                                    <input type="email" id="form3Example3cg" class="form-control form-control-lg" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example4cg">Ngày sinh</label>
                                    <input type="password" id="form3Example4cg" class="form-control form-control-lg" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label">Giới tính</label>
                                    <select name="gender" id="gender">
                                        <option value="male">Nam</option>
                                        <option value="female">Nữ</option>
                                        <option value="other">Khác</option>
                                    </select>
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example4cg1">Email</label>
                                    <input type="email" id="form3Example4cg1" class="form-control form-control-lg" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example4cg12">Địa chỉ</label>
                                    <input type="text" id="form3Example4cg12" class="form-control form-control-lg"/>
                                </div>
                                <hr>
                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example4cg13">Số điện thoại</label>
                                    <input type="text" id="form3Example4cg13" class="form-control form-control-lg" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example4cg14">Mật khẩu</label>
                                    <input type="text" id="form3Example4cg14" class="form-control form-control-lg" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example4cg15">Nhập lại mật khẩu</label>
                                    <input type="text" id="form3Example4cg15" class="form-control form-control-lg" />
                                </div>

                                <div class="d-flex justify-content-center">
                                    <button type="button" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Đăng ký</button>
                                </div>
                                <p class="text-center text-muted mt-5 mb-0">Đã có tài khoản? <a href="login.jsp" class="fw-bold text-body"><u>Nhấn vào để đăng nhập</u></a></p>
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
</body>
</html>
