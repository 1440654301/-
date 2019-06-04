<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Amaze UI Admin index Examples</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="assets/css/admin.css">
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/app.js"></script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->
</head>

<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="assets/i/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

   <li class="am-dropdown tognzhi" data-am-dropdown>
 
  <ul class="am-dropdown-content"> 	
    <li class="am-dropdown-header">所有消息都在这里</li>   
  </ul>
</li>

 <li class="kuanjie">
 	
 	<a href="#">会员管理</a>          
 	<a href="#">订单管理</a>   
 	<a href="#">书籍管理</a> 
 </li>

 <li class="soso">
 	


<form action="UserServlet?flag=findByName" method="post">
<p class="ycfg"><input type="text" name="name"class="am-form-field am-input-sm" placeholder="搜索会员编号" /></p>
<p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>
</form>
 </li>




      <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：${user.username}</div>
        <div class="sideMenu">
      <h3 class="am-icon-flag"><em></em> <a href="#">商品管理</a></h3>
      <ul>
        <li><a href="BookServlet?flag=findAll">商品列表</a></li>
        <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href="sjtj.jsp">添加新商品</a></li>
        
      </ul>
      <h3 class="am-icon-cart-plus"><em></em> <a href="#"> 订单管理</a></h3>
      <ul>
 <li><a href="ddServlet?flag=findAll">订单列表</a></li>
         <li><a href="ddtj.jsp">添加订单</a></li>
      </ul>
      <h3 class="am-icon-users"><em></em> <a href="#">会员管理</a></h3>
      <ul>
        <li><a href="UserServlet?flag=findAll">会员列表 </a></li>
        <li><a href="hytj.jsp">激活会员</a></li>
      </ul>

    </div>
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

    
    
    
    
    
    
    
</div>

<div class=" admin-content">
	
		<div class="daohang">
			<ul>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs"> 首页 </li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">帮助中心<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">奖金管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">产品管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				
				
			</ul>

       

	
</div>
	
	


<div class="admin">
	

	
	
   
   <div class="admin-index">
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 100}">
        <dt class="qs"><i class="am-icon-users"></i></dt>
        <dd>455</dd>
        <dd class="f12">会员数量</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 300}">
        <dt class="cs"><i class="am-icon-area-chart"></i></dt>
        <dd>455</dd>
        <dd class="f12">今日收入</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 600}">
        <dt class="hs"><i class="am-icon-shopping-cart"></i></dt>
        <dd>455</dd>
        <dd class="f12">书籍数量</dd>
      </dl>
      <dl data-am-scrollspy="{animation: 'slide-right', delay: 900}">
        <dt class="ls"><i class="am-icon-cny"></i></dt>
        <dd>455</dd>
        <dd class="f12">全部收入</dd>
      </dl>
    </div>
    <div class="admin-biaoge">
      <div class="xinxitj">信息概况</div>
      <table  width="100%" class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
            <thead>
              <tr class="am-success">
                <th class="table-check"><input type="checkbox" /></th>

                <th class="table-id">会员编号</th>
                <th class="table-title">会员姓名</th>
                <th class="table-type">消费金额</th>
                <th class="table-author am-hide-sm-only">卡内余额</th>
                <th class="table-author am-hide-sm-only">会员种类</th>
                <th width="130px" class="table-set">操作</th>
              </tr>
            </thead>
            
            <tbody >
            <c:forEach items="${ch }" var="a" varStatus="s">
              <tr>
                <td><input type="checkbox" /></td>
                
                <td>${a.username}</td>
	            <td>${a.password }</td>
	            <td>${a.je }</td>
	            <td>${a.kye }</td>
	           <td>${a.kind }</td>
                <td>
                	<div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                     <a href="UserServlet?flag=yupdate&id=${a.id}" class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o">
                       </span></a>
                     <a href="UserServlet?flag=delete&id=${a.id}" class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除订单" >
                     <span class="am-icon-trash-o" > </span></a>
                    </div>
                  </div>             	
                </td>
              </tr>
              </c:forEach>
            </tbody>
           
          </table>  
          ${pager } 
    </div>
    <div class="shuju">
      <div class="shujuone">
        <dl>
          <dt>全部收入：4656546.62 </dt>
          <dt>会员数量：   5646</dt>
          <dt> <br></dt>
          
        </dl>
        <ul>
          <h2>98.45%</h2>
          <li>会员好评率</li>
        </ul>
      </div>
      <div class="shujutow">
        <dl>
          <dt>书籍库存：  1356666</dt>
          <dt>售出数量：   5646465.98</dt>
          <dt><br></dt>
        </dl>
        <ul>
          <h2>90.56%</h2>
          <li>售出比例</li>
        </ul>
      </div>
      
      <script type="text/javascript">jQuery(".slideTxtBox").slide();</script> 
   
   
   
   
   
   
   
   
</div>

    <div class="foods">
    	<ul>版权所有@2015 .模板收集自 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> -  More Templates<a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></ul>
    	<dl><a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a></dl>


    	
    </div>







</div>

</div>




</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]--> 

<!--[if (gte IE 9)|!(IE)]><!--> 
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->



</body>
</html>