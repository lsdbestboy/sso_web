<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>车轮滚滚注册页面</title>
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
        
        function sendCheckCode() {
        	
        	var phone = $("#phone").val();
        	if ($("#phone").val() == "") {
				alert("手机号不能为空");
				$("#phone").focus();
				return;
			}
        	
        	//手机号验证
			var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
			if(!myreg.test($("#phone").val())){
			   alert('请输入有效的手机号码'); 
			    return false; 
			} 
			
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
           <li class="tit-item">账户注册</li>
           <li class="tit-item">下载APP</li>
       </ul>
       
        <ul class="tab-con-items">

       <form id="personRegForm" method="post" onsubmit="return false;">
            <li class="con-item" >
                <div class="formEle">
                    <span class="icon user"></span>
                    <input type="text" placeholder="用户名" id="regName" name="userName" maxlength="20"/>
                </div>
                <div class="formEle">
                    <span class="icon passWord" ></span>
                    <input type="password" placeholder="密码" id="pwd" name="password"/>
                </div>
                <div class="formEle">
                    <span class="icon passWord" ></span>
                    <input type="password" placeholder="确认密码" id="pwdRepeat"/>
                </div>
                <div class="formEle">
                    <span class="icon phone" ></span>
                    <input type="text" placeholder="手机号" id="phone" name="personalPhone"/>
                </div>
                <!-- --> 
                <div class="formEle" style="width:160px; float: left">
                    <span class="icon vcode"></span>
                    <input type="text" style="width:100px; " placeholder="验证码" name="vcode" id="vcode"/>
                </div>
                <button class="getVcode" onclick="sendCheckCode()" id="getPhoneCode">发送短信验证码</button>
                 
                <button class="btn mt_10" id="registsubmit"   onclick="REGISTER.reg();">立即注册</button>
            </li>
       </form>
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
	var REGISTER= {
		param:{
			//单点登录系统的url
			surl:""
		},
		inputcheck:function(){
				//不能为空检查
				if ($("#regName").val() == "") {
					alert("用户名不能为空");
					$("#regName").focus();
					return false;
				}
				if ($("#pwd").val() == "") {
					alert("密码不能为空");
					$("#pwd").focus();
					return false;
				}
				if ($("#phone").val() == "") {
					alert("手机号不能为空");
					$("#phone").focus();
					return false;
				}
				//密码检查
				if ($("#pwd").val() != $("#pwdRepeat").val()) {
					alert("确认密码和密码不一致，请重新输入！");
					$("#pwdRepeat").select();
					$("#pwdRepeat").focus();
					return false;
				}
				//手机号验证
				var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
				if(!myreg.test($("#phone").val())){
				   alert('请输入有效的手机号码'); 
				    return false; 
				} 
				
				if($("#vcode").val() == "") {
					alert('请输入验证码'); 
					return false;
				}

				return true;
		},
		
		beforeSubmit:function() {
				//检查用户是否已经被占用
				$.ajax({
	            	url : REGISTER.param.surl + "/user/check/"+encodeURI(encodeURI($("#regName").val()))+"/1?r=" + Math.random(),
	            	success : function(data) { //校验用户名
	            		if (data.status) {
	            			$.ajax({//检查手机号是否存在
	            				url : REGISTER.param.surl + "/user/check/"+$("#phone").val()+"/2?r=" + Math.random(),
				            	success : function(data) {
				            		if (data.status) { // 手机号校验通过 校验验证码
				            			$.ajax({//检查手机号是否存在
				            				url : REGISTER.param.surl + "/user/validateCode/"+$("#phone").val()+"/"+$("#vcode").val()+"/?r=" + Math.random(),
							            	success : function(data) {
							            		if (data.status) {
							            			REGISTER.doSubmit();
							            		} else {
							            			alert("验证码校验失败");
							            			$("#vcode").select();
							            		}
							            	}
				            			});
				            		} else {
				            			alert("此手机号已经被注册！");
				            			$("#phone").select();
				            		}
				            	}
	            			});
	            		} else {
	            			alert("此用户名已经被占用，请选择其他用户名");
	            			$("#regName").select();
	            		}	
	            	},
					error:function(xmlRequest, status){
						alert("系统错误,请联系客服人员");
					}
					});
		},
		
		doSubmit:function() {
			$.post("/user/register",$("#personRegForm").serialize(), function(data){
				if(data.status){
					alert('用户注册成功，请登录！');
					REGISTER.login();
				} else {
					alert("注册失败！");
				}
			});
		},
		
		login:function() {
			 location.href = "/user/page/login";
			 return false;
		},
		
		reg:function() {
			if (this.inputcheck()) {
				this.beforeSubmit();
			}
		}
	};
</script>
</body>
</html>
