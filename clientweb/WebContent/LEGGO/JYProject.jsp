<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE HTML>
<!--
	Ethereal by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>LEGGO</title>
		<meta charset="euc-kr" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
		
		<style type="text/css">
/*-- ----------------------------------------------테스트 페이지 메뉴 입니다-------------------------- */		
		  
#cf {
  position:relative;
  height:100%;
  width:100%;
  margin:0 auto;
}

#cf img {
  position:absolute;
  left:0;
  -webkit-transition: opacity 1s ease-in-out;
  -moz-transition: opacity 1s ease-in-out;
  -o-transition: opacity 1s ease-in-out;
  transition: opacity 1s ease-in-out;
}

#cf img.top:hover {
  opacity:0;
}		
		
/*-- ----------------------------------------------테스트 페이지 메뉴 입니다-------------------------- */		
		
				#text {
						font-family: 배달의민족 을지로체 TTF; /* 배달의민족 도현; */
						text-transform: uppercase;
						background: linear-gradient(to right, #30CFD0 0%, #330867 100%);
						-webkit-background-clip: text;
						-webkit-text-fill-color: transparent;
						text-align: center;
						font-size: 60px;
						font-weight: bold;
				}
				#header {
					/* background-color: red;  */ 
					text-align: center;
					margin-bottom: 100px;
				}
				
				#firstLogo{
				text-align: center;
				/* background-color: red;  */
				margin: 0px;
				}
				#secondLogo{
				text-align: center;
				/* background-color: red;  */
				margin-bottom: 50px;
				}
				/* 메뉴 */
				#content1 {
					height: 450px;
					/* background-color: red; */
					/*opacity: 0.2; */
					margin: 0 auto;
					text-align: center;
					width: 100%;
					margin-top:-20px;
					padding: 3.5rem 3.5rem 2rem 3.5rem;
					
				}
				.menuImg {
					width: 170px;
					height: 170px;
				}
				.menuBtn{
					width: 200px;
					display: inline-block;
					margin: 20px;
				}
				.button {
				  background-color: #2f5597;
				  font-family: 배달의민족 한나는 열한살 ;
				  border: none;
				  color: white;
				  padding: 10px;
				  text-align: center;
				  text-decoration: none;
				  display: inline-block;
				  font-size: 30px;
				  margin: 4px 30px;
				  cursor: pointer;
				  padding: 5px 50px 15px 50px;
				}

body {
  font-family: 배달의민족 한나는 열한살;
}

#openBtn{
	margin-top: 80px;
	margin-left: 10px;
	width: 4%;
}

.overlay {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: rgb(0,0,0);
  background-color: rgba(0,0,0, 0.9);
  overflow-x: hidden;
  transition: 0.1s;
  
}

.overlay-content {
  position: relative;
  top: 10%;
  width: 100%;
  text-align: left;
  margin-top: 30px;
  margin-left: 30px;
}

.overlay a {
  padding: 8px;
  text-decoration: none;
  font-size: 40px;
  color: white;
  display: block;
  transition: 0.1s;
}

.overlay a:hover, .overlay a:focus {
  color: #2f5597;
}

.overlay .closebtn {
  position: absolute;
  left: 15px;
  top: 3%;
  font-size: 60px;
  background-image: url("../LEGGO/images/leggo/menu-btn-close.png");
  background-repeat: no-repeat;
  background-size: contain;
}

@media screen and (max-height: 450px) {
  .overlay a {font-size: 20px}
  .overlay .closebtn {
  font-size: 40px;
  top: 15px;
  right: 35px;
  }
}

		</style>
		</head>
		<body class="is-preload">
			<div id="page-wrapper">
					<div id="wrapper">
					
					<section class="panel banner right">
								<div class="content color111 span-6">
					
<!-- ----------------------------------------------테스트 페이지 메뉴 입니다-------------------------- -->	
								
								
								
								
									<!-- --------------첫 페이지 메뉴 입니다-------------- -->
									<div id="outer">
										<!-- --------------첫 페이지 입니다-------------- -->
										 <div id="header">
												<div id="cf">
											 	 <img class="bottom" src="../LEGGO/images/leggo/background_image_car5.jpg" />
		  											<img class="top" src="../LEGGO/images/leggo/background_image_car6.jpg" />
												</div>
											</div>
										</div>
									</div>
								
							</section>
					
<!-- ----------------------------------------------테스트 페이지 메뉴 입니다-------------------------- -->					
					
						<section class="panel banner right">
								<div class="content color0 span-6">
									<!-- --------------첫 페이지 메뉴 입니다-------------- -->
								
								
								
								
									<!-- --------------첫 페이지 메뉴 입니다-------------- -->
									<div id="outer">
										<!-- --------------첫 페이지 입니다-------------- -->
										 <div id="header">
											<!--  <a href="#second">
												<img src="../LEGGO/images/leggo/MainLogo.png" width=10% height=10%>
											</a> -->
											
											<div id="text">What makes you connected?</div>
									
											
											<button class="button" >가입하기</button> 
											<a href="#second">
											<button class="button" >연결하기</button> 
											</a>
											</div>
										</div>
									</div>
								
							</section>
								<!-- --------------두 번째 페이지 입니다-------------- -->
								<!-- --------------로고-------------- -->
							<section class="panel banner right"  id="second">
								<div class="content color1 span-6">
								
								
<div id="myNav" class="overlay">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <div class="overlay-content">
    <a href="#">홈</a>
    <a href="#">회사소개</a>
    <a href="#">뉴스</a>
    <a href="#">개인정보</a>
    <a href="#">쪽지함</a>
  </div>
</div>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">
		<img id="openBtn" src="../LEGGO/images/leggo/header-logo.png">
 </span>

<script>
function openNav() {
  document.getElementById("myNav").style.width = "100%";
}

function closeNav() {
  document.getElementById("myNav").style.width = "0%";
}
</script>
										<div id="outer">
											<div id="secondLogo">
												
												<a href="https://www.naver.com">
												<img src="../LEGGO/images/leggo/MainLogo.png" width=10% height=10%>
												</a>
													
											</div>
										</div>
											
										
										<!-- --------------메뉴4개 아이콘-------------- -->
										<div id="content1">
											
										<div class="menuBtn">
											<a href="https://www.naver.com">
											<img src="../LEGGO/images/leggo/Picture1.png"alt="location" class="menuImg">
											</a>
											
										</div>
										<div class="menuBtn">
											<a href="https://www.naver.com">
											<img src="../LEGGO/images/leggo/Picture2.png"alt="location" class="menuImg">
											</a>
										</div>
										<div class="menuBtn">
											<a href="https://www.naver.com">
											<img src="../LEGGO/images/leggo/Picture3.png"alt="location" class="menuImg">
											</a>
										</div>
											<div class="menuBtn">
												<a href="https://www.naver.com">
												<img src="../LEGGO/images/leggo/Picture4.png"alt="location" class="menuImg">
												</a>
											</div>
												<ul class="actions">
													<li><a href="#third" class="button primary color1 circle icon solid fa-angle-right">Next</a></li>
												</ul>
										</div>
									</div>
							</section>