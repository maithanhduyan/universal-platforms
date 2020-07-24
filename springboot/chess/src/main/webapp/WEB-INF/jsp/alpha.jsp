<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="layouts/header.jsp"%>
<!-- Custom styles for this template -->
<link href="/css/chessboard-0.3.0.css" rel="stylesheet">
<style type="text/css">
.highlight-white {
  box-shadow: inset 0 0 3px 3px yellow;
}
.highlight-black {
  box-shadow: inset 0 0 3px 3px blue;
}
</style>
</head>
<body style="height: auto; min-height: 100%;">
	<div class="container-fluid">
		<div class="row ">
			<div class="col-lg-12" align="center">
				<div class="text-center" align="center">
					<h1>Chess</h1>
					<p>Play Chess with Super GrandMasters</p>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12" align="center">
				<div id="board" class="board" style="width: 400px"></div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12" align="center">
				<div class="info">
					Search depth: <select id="search-depth">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3" selected>3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select> <br> <span>Positions evaluated: <span id="position-count"></span></span> <br> <span>Time: <span id="time"></span></span> <br> <span>Positions/s: <span id="positions-per-s"></span>
					</span> <br> <br>
					<div id="move-history" class="move-history"></div>
				</div>
			</div>
		</div>
		<%@include file="layouts/footer.jsp"%>
	</div>
	<script type="text/javascript" src="/js/chessboard.js"></script>
	<script type="text/javascript" src="/js/chess.js"></script>
	<script type="text/javascript" src="/js/ai.js">
      
    </script>
</body>
</html>