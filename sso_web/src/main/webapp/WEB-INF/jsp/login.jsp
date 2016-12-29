<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>车轮滚滚登录页面</title>
    <link rel="stylesheet" href="/css/layout.css"/>
    <script type="text/javascript" src="/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="/js/jquery-ui.js"></script>
    <script type="text/javascript" src="/js/newIndex.js"></script>
    <script type="text/javascript">
        $.fn.myTab = function (index) {
            return this.each(function () {
                var tabTitEle = $(this).find("li.tit-item"),
                        tabContentEle = $(this).find(".con-item");
                tabTitEle.click(function () {
                    if ($(this).hasClass('cur')) {
                        $.noop();
                    } else {
                        var index = tabTitEle.index(this);
                        tabTitEle.removeClass("cur");
                        $(this).addClass("cur");
                        tabContentEle.hide().eq(index).show();
                    }
                });
                tabTitEle.eq(index).click();
            })
        };
        $(function () {
            $('.loginBox').myTab(0);
        })
    </script>
</head>
<body>
<div id="header">
    <div class="in-header">
        <h1 id="logo">
            <a href="http://www.clgg.com">
                <img src="/images/logo.png" alt=""/>
            </a>
        </h1>
    </div>
</div>

<div class="banner">
    <div class="img-box">
        <ul class="img-list clearFix">
            <li class="img-item" style='background-image: url("/images/baner1.jpg")'><a
                    href="http://cp.clgg.com" target="_blank"></a></li>
            <li class="img-item" style='background-image: url("/images/baner2.jpg")'><a
                    href="http://cz.clgg.com" target="_blank"></a></li>
            <li class="img-item" style='background-image: url("/images/baner3.jpg")'><a
                    href="http://kcg.clgg.com"></a></li>
        </ul>


    </div>
</div>
<div class="in-banner">
    <div class="loginBox">
       <ul class="tab-tit-items">
           <li class="tit-item ">账户登录</li>
           <li class="tit-item">下载APP</li>
       </ul>
        <ul class="tab-con-items">

            <li class="con-item pt_50" >
           <form id="formlogin" method="post" onsubmit="return false;">
	            <div class="formEle">
	                <span class="icon user"></span>
	                <input type="text" placeholder="用户名" name="userName" id="userName" maxlength="25"/>
	            </div>
	            <div class="formEle">
	                <span class="icon passWord"></span>	
	                <input type="password" placeholder="密码" name="password" id="nloginpwd"/>
	            </div>
	            <div class="autoLogin pt_5 pb_5">
	                <a class="forgetPassword" href="${pageContext.request.contextPath}/page/resetPasswordStepOfOne?redirect=${redirect}">忘记密码？</a>
	            </div>
	            <button class="btn mt_25" id="loginsubmit">登录</button>
	             <script type="text/javascript">
                    setTimeout(function () {
                        if (!$("#loginname").val()) {
                            $("#loginname").get(0).focus();
                        }
                    }, 0);
                </script>
            </form>
        </li>
            <li class="con-item pt_40 ">
               <div class="ewmItem mr_10">
                   <h4 class="tit">安卓版下载</h4>
                   <img src="/images/ewm.png" alt=""/>
               </div>
                <div class="ewmItem">
                    <h4 class="tit">IOS版下载</h4>
                    <img src="/images/ewm.png" alt=""/>
                </div>
            </li>
        </ul>
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

<script type="text/javascript">
	var redirectUrl = "${redirect}";
	var LOGIN = {
			checkInput:function() {
				if ($("#userName").val() == "") {
					alert("用户名不能为空");
					$("#userName").focus();
					return false;
				}
				if ($("#nloginpwd").val() == "") {
					alert("密码不能为空");
					$("#nloginpwd").focus();
					return false;
				}
				return true;
			},
			doLogin:function() {
				$.post("/user/login", $("#formlogin").serialize(),function(data){
					if (data.status) {
						if (redirectUrl == "") {
							location.href = "http://www.clgg.com/";
						} else {
							location.href = redirectUrl;
						}
					} else {
						alert("登录失败，原因是：" + data.msg);
						$("#loginname").select();
					}
				});
			},
			login:function() {
				if (this.checkInput()) {
					this.doLogin();
				}
			}
		
	};
	$(function(){
		$("#loginsubmit").click(function(){
			LOGIN.login();
		});
	});
</script>
</body>
</html>