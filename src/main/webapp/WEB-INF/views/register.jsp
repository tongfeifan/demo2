<%--
  Created by IntelliJ IDEA.
  User: tongfeifan
  Date: 16/4/6
  Time: 下午2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<jsp:include page="header.jsp" />
<head>
    <title>注册</title>
<script type="text/javascript">

    (function($,W,D)
    {
        var JQUERY4U = {};

        JQUERY4U.UTIL =
        {
            setupFormValidation: function()
            {
                //form validation rules
                $("#register-form").validate({
                    rules: {
                        username: "required",
                        password1: {
                            required: true,
                            minlength: 5
                        },
                        password2: {
                            equalTo: "#password1"
                        },
                        phoneNumber: {
                            required: true,

                        }
                    },
                    messages: {
                        username: "请输入不小于5用户名",
                        password1: {
                            required: "请输入密码",
                            minlength: "密码不能小于5位"
                        },
                        password2: {
                            equalTo: "密码不一致"
                        },
                    },
                    submitHandler: function() {
                        $("#send-sms").click();
                    }
                });
            }
        }

        //when the dom has loaded setup form validation rules
        $(D).ready(function($) {
            JQUERY4U.UTIL.setupFormValidation();
        });

    }


    )(jQuery, window, document);

    function sendSMS() {
        var url = "api/send-sms";
        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            url: url,
            type: 'post',
            data: $("#user-form").serialize(),
            success: function(data){
                if (data.success == true){
                    $("#verify-code").show();
                    $("#verifyCode").attr("required", "required");
                }
                else {
                    alert(data.message);
                }
            }
        });
    }
</script>
</head>
<body>
<div class="container">
    <div style="margin-bottom: 50px"></div>

    <div class="col-md-4">

    </div>
    <div class="col-md-4 alert alert-info" style="padding: 10px;">
        <div style="padding: 5px;"><h3>注册</h3></div>
        <form action="/register/verify" method="post" id="user-form" >
            <div class="form-group">
                <input required="required" type="text" name="username" id="usernmae" placeholder="Username" class="form-control"/>
            </div>
            <div class="form-group">
                <input required="required" type="password" name="password1" id="password1" placeholder="Password" class="form-control" />
            </div>
            <div class="form-group">
                <input required="required" type="password" name="password2" id="password2" placeholder="Confirm Password" class="form-control" />
            </div>
            <div class="form-group">
                <input required="required" type="text" name="phoneNumber" id="phoneNumber" placeholder="Phone Number" class="form-control" />
            </div>
                <input id="send-sms" name="sendSMS" type="button" class="btn btn-default" value="发送验证码" />
            <div id="verify-code" style="display: none;">
                <div class="form-group">
                    <input type="text" name="verifyCode" id="verifyCode" placeholder="Code" class="form-control" />
                </div>
                <input name="register" type="submit" value="注册" class="btn btn-primary">
            </div>
        </form>
    </div>
</div>


<script type="text/javascript">
    $("#send-sms").click(function (){
        var url = "/api/send-sms";
        $.ajax({
            url: url,
            type: 'post',
            data: $("#user-form").serialize(),
            success: function(data){
                if (data.success == true){
                    $("#verify-code").show();
                    $("#verifyCode").attr("required", "required");
                }
                else {
                    alert(data.message);
                }
            }
        });
    });


</script>
</body>
</html>
