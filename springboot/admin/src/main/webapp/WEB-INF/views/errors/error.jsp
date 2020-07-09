<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>${status}</title>

<link href="https://fonts.googleapis.com/css?family=Poppins:400,700" rel="stylesheet">

<style>
* {
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

body {
	padding: 0;
	margin: 0;
}

#notfound {
	position: relative;
	height: 100vh;
}

#notfound .notfound {
	position: absolute;
	left: 50%;
	top: 50%;
	-webkit-transform: translate(-50%, -50%);
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}

.notfound {
	max-width: 520px;
	width: 100%;
	line-height: 1.4;
}

.notfound .notfound-404 {
	position: absolute;
	left: 0;
	top: 0;
	height: 150px;
	width: 200px;
	z-index: -1;
}

.notfound .notfound-404 h1 {
	font-family: 'Poppins', sans-serif;
	font-size: 238px;
	font-weight: 700;
	margin: 0px;
	color: #e3e3e3;
	text-transform: uppercase;
	letter-spacing: 7px;
	position: absolute;
	left: 50%;
	top: 50%;
	-webkit-transform: translate(-50%, -50%);
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}

.notfound h2 {
	font-family: 'Poppins', sans-serif;
	font-size: 28px;
	font-weight: 400;
	text-transform: uppercase;
	color: #222;
	margin-top: 12px;
	margin-bottom: 15px;
}

.notfound .notfound-search {
	position: relative;
	padding-right: 123px;
	width: 100%;
	margin: 30px 0px 20px;
}

.notfound .notfound-search input {
	font-family: 'Poppins', sans-serif;
	width: 100%;
	height: 40px;
	padding: 3px 15px;
	color: #222;
	font-size: 18px;
	font-weight: 400;
	background: #fff;
	border: 2px solid rgba(21, 23, 35, 0.2);
	-webkit-transition: 0.2s all;
	transition: 0.2s all;
}

.notfound .notfound-search input:focus {
	border-color: #57a3f8;
}

.notfound .notfound-search button {
	font-family: 'Poppins', sans-serif;
	position: absolute;
	right: 0px;
	top: 0px;
	width: 120px;
	height: 40px;
	text-align: center;
	border: none;
	background: #57a3f8;
	cursor: pointer;
	padding: 0;
	color: #fff;
	font-weight: 700;
	font-size: 18px;
}

.notfound a {
	font-family: 'Poppins', sans-serif;
	display: inline-block;
	font-weight: 700;
	border-radius: 15px;
	text-decoration: none;
	color: #57a3f8;
}

.notfound a:hover {
	color: #57a3f8;
}

.notfound a>.arrow {
	position: relative;
	top: -2px;
	border: solid #57a3f8;
	border-width: 0 3px 3px 0;
	display: inline-block;
	padding: 3px;
	-webkit-transform: rotate(135deg);
	-ms-transform: rotate(135deg);
	transform: rotate(135deg);
}

@media only screen and (max-width: 767px) {
	.notfound .notfound-404 {
		height: 110px;
		line-height: 110px;
	}
	.notfound .notfound-404 h1 {
		font-size: 170px;
	}
	.notfound h2 {
		font-size: 24px;
	}
	.notfound .notfound-search {
		margin: 10px 0px 20px;
	}
}

@media only screen and (max-width: 480px) {
	.notfound .notfound-404 {
		left: 40px;
	}
	.notfound .notfound-404 h1 {
		font-size: 120px;
	}
	.notfound h2 {
		font-size: 18px;
	}
}
</style>


<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
</head>
<body>
	<div id="notfound">
		<div class="notfound">
			<div class="notfound-404">
				<h1>${status}</h1>
			</div>
			<h2>Oops, The Page you are looking for can't be found!</h2>
			<h6>Error: ${message}</h6>
			<a href="#" onclick="goBack()"><span class="arrow" ></span>Go Back</a>
		</div>
	</div>
	<script>
        function goBack() {
            window.history.back();
        }
    </script>
</body>
</html>