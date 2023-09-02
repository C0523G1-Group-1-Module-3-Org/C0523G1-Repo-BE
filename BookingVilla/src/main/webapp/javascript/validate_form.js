// Kiểm tra định dạng số cmnd,cccd, số điện thoại, email,...:
// khi chưa nhập xong(hoặc sai định dạng) mà blur ra ngoài thì báo lỗi,
// nhưng khi focus lại vào thẻ input thì xóa lỗi,
// sai định dạng thì không cho submit.


// 1. Số cmnd,cccd;
function validateIdentityNumber(){
    let identityNumber = document.getElementById("identityNumber").value;
    let identityNumberFormatError = document.getElementById("identityNumberFormatError");
    if (!/^\d{10,12}$/.test(identityNumber)){
        identityNumberFormatError.innerText = "Số CMND/CCCD không hợp lệ!";
        document.getElementById("submitButton").disabled = true;
    }
    else {
        identityNumberFormatError.innerText = "";
        document.getElementById("submitButton").disabled = false;
    }
}
function clearErrorIdentityNumber (){
    let identityNumberError = document.getElementById("identityNumberFormatError");
    identityNumberError.innerText = "";
}

// 2.Email
function validateEmail(){
    let email = document.getElementById("email").value;
    let emailFormatError = document.getElementById("emailFormatError");
    if (!/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/.test(email)){
        emailFormatError.innerText = "Email sai định dạng!";
        document.getElementById("submitButton").disabled = true;
    }
    else {
        emailFormatError.innerText = "";
        document.getElementById("submitButton").disabled = false;
    }
}
function clearErrorEmail (){
    let emailFormatError = document.getElementById("emailFormatError");
    emailFormatError.innerText = "";
}

//3. Số điện thoại
function validatePhoneNumber(){
    let phoneNumber = document.getElementById("phoneNumber").value;
    let phoneNumberFormatError = document.getElementById("phoneNumberFormatError");
    if (!/^(84|0[3|5|7|8|9])([0-9]{7,8})$/.test(phoneNumber)){
        phoneNumberFormatError.innerText = "Số điện thoại sai định dạng";
        document.getElementById("submitButton").disabled = true;
    }
    else {
        phoneNumberFormatError.innerText = "";
        document.getElementById("submitButton").disabled = false;
    }
}
function clearErrorPhoneNumber (){
    let phoneNumberError = document.getElementById("phoneNumberFormatError");
    phoneNumberError.innerText = "";
}

// 4. Mật khẩu
function validatePassword(){
    let password = document.getElementById("password").value;
    let passwordFormatError = document.getElementById("passwordFormatError");
    if (!/^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/.test(password)){
        passwordFormatError.innerText = "Mật khẩu ít nhất 8 kí tự. Bao gồm số, chữ và ít nhất một chữ cái in hoa";
        document.getElementById("submitButton").disabled = true;
    }
    else {
        passwordFormatError.innerText = "";
        document.getElementById("submitButton").disabled = false;
    }
}
function clearErrorPassword (){
    let passwordFormatError = document.getElementById("passwordFormatError");
    passwordFormatError.innerText = "";
}

//5. Confirm mật khẩu
function validatePasswordConfirm(){
    let password = document.getElementById("password").value;
    let passwordConfirm = document.getElementById("passwordConfirm").value;
    let passwordConfirmFormatError = document.getElementById("passwordConfirmFormatError");
    if (password != passwordConfirm){
        passwordConfirmFormatError.innerText = "Mật khẩu không trùng khớp!";
        document.getElementById("submitButton").disabled = true;
    }
    else {
        passwordConfirmFormatError.innerText = "";
        document.getElementById("submitButton").disabled = false;
    }
}
function clearErrorPasswordConfirm (){
    let passwordConfirmFormatError = document.getElementById("passwordConfirmFormatError");
    passwordConfirmFormatError.innerText = "";
}

