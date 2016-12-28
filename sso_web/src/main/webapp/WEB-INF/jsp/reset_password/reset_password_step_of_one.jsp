<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/utility.css"/>
    <link rel="stylesheet" href="/css/layout.css"/>
    <script type="text/javascript" src="/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="/js/jquery-ui.js"></script>
    <title>忘记密码</title>
    <script type="text/javascript">
    
    	function resetPasswordStepOfTwo(){
    		if($("#user").val() == "") {
    			alert("用户名不能为空");
    			return;
    		}
    		
    		$.ajax({
            	url : "/user/checkUser/"+encodeURI(encodeURI($("#user").val()))+"?r=" + Math.random(),
            	success : function(data) { // 校验用户名
    				if (data.status) { // 存在
    					window.location.href="resetPasswordStepOfTwo?user="+$("#user").val();
    				} else { // 不存在
            			alert("用户名不存在");
    				}
            	},
				error:function(xmlRequest, status){
					alert("系统错误,请联系客服人员");
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
        <h2 class="tit step1">

        </h2>

        <div class="register-content">
            <div class="reg-ele no-border">
                <div class="inp-ele pb_30">
                    <div class="tit">用户名：</div>
                    <div class="inp-wrap">
                        <input type="text" name="user" id="user" onblur="checkUser()"/>
                    </div>
                    <div class="forget-tip">
                        <span class="require">*</span>若未绑定手机，请致电：400-888-1122
                    </div>
                </div>
                <div class="reg-tip"><span class="tipIcon"></span>请输入您的平台用户名、或已绑定的手机号码</div>
            </div>
            <input type="submit" class="btn registerBtn" value="下一步" onclick="resetPasswordStepOfTwo()"/>
        </div>
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