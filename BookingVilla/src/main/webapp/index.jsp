<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>main-page</title>
    <link rel="stylesheet" href="css_index/main_page_css.css">
</head>
<body class="backgroundcolor-2">
<div id="header" class="boxshadow-outset">
    <img src="https://drive.google.com/uc?id=1cH2mCtzpEW1JtCt0qkxoD6PtEGbuT35c" width="100%"/>
    <div></div>
    <button class="backgroundcolor-2 hover" onclick="redirectToLogin()">Đăng nhập</button>
    <button class="backgroundcolor-2 hover" onclick="redirectToSignUp()">Đăng ký</button>
</div>
<div id="context" class="boxshadow-outset">
    <div id="clock">00:00:00</div>
    <div id="button-list">
        <button class="backgroundcolor-2 hover">Đặt mới</button>
        <button class="backgroundcolor-2 hover">Đã đặt</button>
        <button class="backgroundcolor-2 hover">Sửa đổi</button>
        <button class="backgroundcolor-2 hover">Liên hệ</button>
        <button class="backgroundcolor-2 hover">Phản hồi</button>
    </div>
    <div id="slide" class="backgroundcolor-2"></div>
    <div id="picture-main">
        <img src="https://drive.google.com/uc?id=1Ye2HDuK6y2fMEOPw0fdaed150tBaQFpB" width="100%"/>
        <div id="calendar">
            <div class="month backgroundcolor-3">
                <p>Tháng</p>
                <p id="month-detail"></p>
                <p id="year-detail"></p>
            </div>
            <div class="weekdays backgroundcolor-2">
                <table id="calendar-table"></table>
            </div>
        </div>
    </div>
</div>
<div id="booking">
    <div>
        <div id="contact" class="boxshadow-outset">
            <p id="contact-title">Thông tin liên hệ</p>
            <table id="contact-table">
                <tr>
                    <td class="contact-avata" style="background-image: url('https://drive.google.com/uc?id=1uRPquTfLUv3jx0sTTEy2_LAAUXViv6Mh')"></td>
                    <td><p class="contact-name hover backgroundcolor-2">Lê Quốc Thắng</p></td>
                </tr>
                <tr>
                    <td class="contact-avata" style="background-image: url('https://drive.google.com/uc?id=1j8qxI9ESCOoQKMbALedypSkmq9aSAWfB')"></td>
                    <td><p class="contact-name hover backgroundcolor-2">Nguyễn Thị Mỹ Hạnh</p></td>
                </tr>
                <tr>
                    <td class="contact-avata" style="background-image: url('https://drive.google.com/uc?id=1j8qxI9ESCOoQKMbALedypSkmq9aSAWfB')"></td>
                    <td><p class="contact-name hover backgroundcolor-2">Nguyễn Khánh Nhật</p></td>
                </tr>
                <tr>
                    <td class="contact-avata" style="background-image: url('https://drive.google.com/uc?id=1JOiSRDjJKZ71FM8i070eyQPMJcN8Dw8Y')"></td>
                    <td><p class="contact-name hover backgroundcolor-2">Nguyễn Chính Đạt</p></td>
                </tr>
            </table>
            <div id="back-to-top">
                <p class="backgroundcolor-4 hover" onclick="backToTop()">Đầu trang</p>
            </div>
        </div>
    </div>
    <div id="villa-list"></div>
</div>
<div id="footer" class="boxshadow-outset">
    <div>
        <img src="https://drive.google.com/uc?id=1kc2ZP6vHnB9rmLls1w9JMboFfZ7Tk9yK"/>
        <p>Cùng nhau... chúng ta qua Module !!!</p>
        <img src="https://drive.google.com/uc?id=1cH2mCtzpEW1JtCt0qkxoD6PtEGbuT35c"/>
    </div>
</div>
<div id="detail-board">
    <div id="detail-board-picture-array" class="align-board">
        <div id="detail-board-picture-array-branch" class="boxshadow-inset"></div>
        <div id="detail-board-picture-array-main" class="boxshadow-outset"></div>
    </div>
    <div id="detail-board-sd" class="align-board">
        <div id="map" class="boxshadow-outset"></div>
    </div>
    <div id="detail-board-description" class="align-board">
        <table id="table-description"></table>
    </div>
    <div id="detail-board-booking" class="align-board">
        <p class="backgroundcolor-3 hover boxshadow-outset" id="detail-board-booking-price"></p>
    </div>
    <div id="close-detail-board" class="backgroundcolor-3 hover boxshadow-outset" onclick="close_detail_board()"></div>
</div>
</body>
<script src="css_index/clock.js"></script>
<script src="css_index/calendar.js"></script>
<script src="css_index/datalist.js"></script>
<script src="css_index/backtop.js"></script>
<script src="css_index/setup.js"></script>
<script src="javascript/redirect_to_new_page.js"></script>
</html>