<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/utility.css"/>
    <link rel="stylesheet" href="/css/layout.css"/>
    <script type="text/javascript" src="/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="/js/jquery-ui.js"></script>
    <title>忘记密码</title>
    <script type="text/javascript">
    
    function sendCheckCode() {
    	var phone = $("#phone").val();
    	$.get("/user/sendCheckCode/"+phone+"?r=" + Math.random(), function(data){
			if(data.status){
				$('#getPhoneCode').attr('disabled',true);
				countdown();
			} else {
				alert("验证码发送失败,请联系客服人员或稍后再试");
			}
		});
    }
    function countdown() {
        var time = 60;
        var timer;
        $("#getPhoneCode").html(time + 's后重新获取').addClass(
            'btn-code-disable');
        timer = setInterval(function () {
            time--;
            $("#getPhoneCode").html(time + 's后重新获取');
            if (time == 0) {
            	 clearInterval(timer);
                $("#getPhoneCode").html('获取验证码').removeClass(
                    'btn-code-disable');
                $('#getPhoneCode').removeAttr('disabled');
            }
        }, 1000);
    }
    
    function submitForm() {
    	if ($("#vcode").val() == "") {
    		alert("请输入验证码");
    		return ;
    	}
    	if($("#password").val() =="") {
    		alert("请输入新密码");
    		return ;
    	}
    	if ($("#confirmPassword").val() == "") {
    		alert("确认密码不能为空");
    		return ;
    	}
    	
    	if ($("#password").val() != $("#confirmPassword").val()) {
    		alert("新密码与确认密码不一致");
    		return ;
    	}
    	$.ajax({//检查手机号是否存在
			url : "/user/validateCode/"+$("#phone").val()+"/"+$("#vcode").val()+"/?r=" + Math.random(),
        	success : function(data) {
        		if (data.status) {
        			$.post("/user/resetPassword", $("#resetPasswordForm").serialize(), function(data){
        				if(data.status){
        					alert('密码修改成功');
        					 location.href = "/page/resetPasswordSuccessed?redirect="+$("#redirect").val();
        				} else {
        					alert("密码修改失败");
        				}
        			});
        		} else {
        			alert("验证码校验失败");
        			$("#vcode").select();
        		}
        	}
		});
    }
    </script>
</head>
<body>
<div id="header">
    <div class="in-header">
        <h1 id="logo">
            <a href="#">
                <img src="/images/logo.png" alt="">
            </a>
        </h1>
    </div>
</div>
<div class="f-wrap">
    <div id="forgetPassword">
        <h2 class="tit step2">

        </h2>
	<form action="" method="post" onsubmit="return false;" id="resetPasswordForm">
        <div class="register-content" style="width:510px;">
            <div class="reg-ele no-border">
                <div class="inp-ele">
                    <div class="tit">已绑定手机：</div>
                    <div class="inp-wrap no-border">
                        ${phone}
                        <input type="hidden" name="userName" value="${phone}" id="phone"/>
                    </div>
                </div>
                <div class="inp-ele clearfix">
                    <div class="tit">手机验证码：</div>
                    <div class="inp-wrap half">
                        <input type="text" name="vcode" id="vcode"/>
                    </div>
                    <button type="button" class="btn getIdfCode" onclick="sendCheckCode()" id="getPhoneCode">获取手机验证码</button>
                </div>
                <div class="inp-ele">
                    <div class="tit">新密码：</div>
                    <div class="inp-wrap">
                        <input type="password" name="password" id="password"/>
                    </div>
                    <input type="hidden" name="redirect" value="${redirect}" id="redirect"/>
                </div>
                <div class="inp-ele pb_30">
                    <div class="tit">确认密码：</div>
                    <div class="inp-wrap">
                        <input type="password" name="confirmPassword" id="confirmPassword"/>
                    </div>
                </div>
            </div>
            <input type="submit" class="btn registerBtn" value="下一步" onclick="submitForm();"/>
        </div>
        </form>
    </div>
</div>

<div class="foot_link foot">
    <p>
        <a href="http://www.clgg.com/landingpage/about.html">关于车轮滚滚</a>
        <a href="http://www.clgg.com/landingpage/partner.html">合作伙伴</a>
        <a href="http://www.clgg.com/landingpage/business.html">商务合作/广告投放</a>
        <a href="http://www.clgg.com/landingpage/contact.html">联系我们</a>
        <span>全国服务热线：400-888-1122</span>
    </p>

    <p>
        <span><a href="http://pinggu.zx110.org/review_url_www.clgg.com" target="_blank">Copyright © 2013-2016 版权所有
            上海远行供应链管理（集团）有限公司（沪ICP备14003619号-2）</a></span>
    </p>

    <p>
        <span><img src="http://www.clgg.com/assets/themes/Nest/img/foot_link/picp_bg.png"
                   style="width: 92px;height: 31px;"></span>&nbsp;&nbsp;
        <span><img src="http://www.clgg.com/assets/themes/Nest/img/foot_link/foot_link_1.gif"></span>&nbsp;&nbsp;
        <span><img src="http://www.clgg.com/assets/themes/Nest/img/foot_link/foot_link_2.gif"></span>&nbsp;&nbsp;
        <span title="OLWeb001" alt="OLWeb001"><img
                src="http://www.clgg.com/assets/themes/Nest/img/foot_link/foot_link_3.gif"></span>&nbsp;&nbsp;
        <span><img src="http://www.clgg.com/assets/themes/Nest/img/foot_link/foot_link_4.gif"></span>&nbsp;&nbsp;
        <span><img src="http://www.clgg.com/assets/themes/Nest/img/foot_link/foot_link_5.gif"></span>
    </p>
</div>
</body>
</html>