<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <base href="${pageContext.request.contextPath}/">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Login</title>
    <!--bootstrap.min.css-->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!--style.css-->
    <link rel="stylesheet" href="css/style.css">
    <!--jquery.js-->
    <script src="js/jquery-3.4.1.js"></script>
    <!--bootstrap.min.js-->
    <script src="js/bootstrap.min.js"></script>
    <!--bootstrap-show-password.min.js-->
    <script src="js/bootstrap-show-password.min.js"></script>
</head>

<body>
<!-- 登录 -->
<div class="container-fluid">
    <div class="row">
        <!-- 左 -->
        <div class="col-sm-6">
            <!-- 左侧图片 -->
            <div class="sign-bgleft">

            </div>
        </div>
        <!-- 右 -->
        <div class="col-sm-6">
            <div class="sign-content">
                <h2>登录</h2>
                <!-- 登录表单 -->
                <div class="signin-form">
                    <form id="userLoginInfo">
                    <div class="form-group">
                        <label>用户名</label>
                        <input type="text" name="userName" id="username" onblur="test();" class="form-control" placeholder="请输入用户名">
                    </div>
                    <div id="username-test" style="height: 30px">
                        <span id="username-span">❕请输入6-18位字符，又英文数字下划线组成！</span>
                    </div>
                    <div class="form-group">
                        <label>密码</label>
                        <input type="password" name="password" id="password" class="form-control" placeholder="请输入密码">
                    </div>
                    </form>
                </div>

                <!-- 记住密码 -->
                <div class="signin-password">
                    <div class="checkbox-list">
                        <ul class="list">
                            <li>
                                <input class="password-checkbox" type="checkbox">
                                <label id="label-checkbox">记住密码!</label>
                            </li>
                            <li>
                                <a href="#">忘记密码?</a>
                            </li>

                        </ul>
                    </div>
                </div>

                <!-- 登录按钮 -->
                <div class="signin-footer">
                    <button type="button" class="btn signin_btn" onclick="login()">登录</button>
                    <p>
                        没有账号? 立即注册!
                        <a href="signup.html">注册</a>
                    </p>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
<script>
    $("#password").password({
    });
    $('#password').password('show');
    $('#password').password('hide');
</script>
<script type="text/javascript">
    //用户名验证
    var isYES ;
    function test() {
        var username = document.getElementById('username');
        var usernamespan = document.getElementById('username-span');

        var uservalue = username.value;
        if (uservalue.length < 6 || uservalue.length >18){
            usernamespan.innerHTML = '❌请输入6-18个字符！';
            isYES=false;
        }else{
            for (var i = 0; i < uservalue.length; i++){
                if (!isDEF(uservalue[i])){
                    isYES = false;
                    break;
                }
                isYES=true;
            }

            if (isYES){
                usernamespan.innerHTML = '✔你的账号可以使用！';
            }else {
                usernamespan.innerHTML = '❌必须使用英文字母数字下划线！';
            }
        }
    }
    // 判断是不是英文字母下划线
    function isDEF(charstr) {
        if (charstr >= 'a' && charstr <= 'z' || charstr >= 'A' && charstr <= 'Z'|| charstr >= 0 && charstr <= 9|| charstr == '_'){
            return true;
        }else {
            return false;
        }
    }


    function login() {
        if (isYES == true){
            $.ajax({
                url:'user/login',
                type:'post',
                async:false,     //设置同步才可保存、操作数据
                data:new FormData($("#userLoginInfo")[0]),
                cache:false,
                processData: false,   // jQuery不去处理发送的数据
                contentType : false,  //jQuery不去处理表头
                success: function (result) {
                    if(result !=null && result.success){
                        alert("Login success!");
                        window.location = "${pageContext.request.contextPath}/"+"main";
                    }
                else{
                        alert("tips:  "+result.message);
                        isYES=false;
                    }
                }
            })
        }
    }


</script>

</html>