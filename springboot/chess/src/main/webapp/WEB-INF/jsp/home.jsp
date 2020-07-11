<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="layouts/header.jsp"%>
</head>
<body style="height: auto; min-height: 100%;" >
	<div class="container-fluid">
		<div class="row ">
			<div class="col-lg-12" align="center">
				<div class="text-center"  align="center">
					<h1>Chess</h1>
					<p>Play Chess with Super GrandMasters </p>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-10" align="center">
				<table id="board" class="board">
					<tbody>
						<tr>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<td class="board-sidebar">8</td>
							<td id="a8" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 1pt 0pt 0pt 1pt">♜</td>
							<td id="b8" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 1pt 0pt 0pt 0pt">♞</td>
							<td id="c8" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 1pt 0pt 0pt 0pt">♝</td>
							<td id="d8" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 1pt 0pt 0pt 0pt">♛</td>
							<td id="e8" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 1pt 0pt 0pt 0pt">♚</td>
							<td id="f8" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 1pt 0pt 0pt 0pt">♝</td>
							<td id="g8" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 1pt 0pt 0pt 0pt">♞</td>
							<td id="h8" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 1pt 1pt 0pt 0pt">♜</td>
							<td class="board-sidebar">&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<td class="board-sidebar">7</td>
							<td id="a7" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 0pt 1pt">♟</td>
							<td id="b7" class="white-cell">♟</td>
							<td id="c7" class="black-cell">♟</td>
							<td id="d7" class="white-cell">♟</td>
							<td id="e7" class="black-cell">♟</td>
							<td id="f7" class="white-cell">♟</td>
							<td id="g7" class="black-cell">♟</td>
							<td id="h7" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 1pt 0pt 0pt">♟</td>
							<td class="board-sidebar">&nbsp;</td>						
						</tr>
						<tr>
							<td class="board-sidebar">6</td>
							<td id="a6" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 0pt 1pt"></td>
							<td id="b6" class="black-cell"></td>
							<td id="c6" class="white-cell"></td>
							<td id="d6" class="black-cell"></td>
							<td id="e6" class="white-cell"></td>
							<td id="f6" class="black-cell"></td>
							<td id="g6" class="white-cell"></td>
							<td id="h6" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 1pt 0pt 0pt"></td>
							<td class="board-sidebar">&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<td class="board-sidebar">5</td>
							<td id="a5" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 0pt 1pt"></td>
							<td id="b5" class="white-cell"></td>
							<td id="c5" class="black-cell"></td>
							<td id="d5" class="white-cell"></td>
							<td id="e5" class="black-cell"></td>
							<td id="f5" class="white-cell"></td>
							<td id="g5" class="black-cell"></td>
							<td id="h5" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 1pt 0pt 0pt"></td>
							<td class="board-sidebar">&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<td class="board-sidebar">4</td>
							<td id="a4" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 0pt 1pt"></td>
							<td id="b4" class="black-cell"></td>
							<td id="c4" class="white-cell"></td>
							<td id="d4" class="black-cell"></td>
							<td id="e4" class="white-cell"></td>
							<td id="f4" class="black-cell"></td>
							<td id="g4" class="white-cell"></td>
							<td id="h4" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 1pt 0pt 0pt"></td>
							<td class="board-sidebar">&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<td class="board-sidebar">3</td>
							<td id="a3" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 0pt 1pt"></td>
							<td id="b3" class="white-cell"></td>
							<td id="c3" class="black-cell"></td>
							<td id="d3" class="white-cell"></td>
							<td id="e3" class="black-cell"></td>
							<td id="f3" class="white-cell"></td>
							<td id="g3" class="black-cell"></td>
							<td id="h3" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 1pt 0pt 0pt"></td>
							<td class="board-sidebar">&nbsp;&nbsp;</td>						
						</tr>
						<tr>
							<td class="board-sidebar">2</td>
							<td id="a2" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 0pt 1pt">♙</td>
							<td id="b2" class="black-cell">♙</td>
							<td id="c2" class="white-cell">♙</td>
							<td id="d2" class="black-cell">♙</td>
							<td id="e2" class="white-cell">♙</td>
							<td id="f2" class="black-cell">♙</td>
							<td id="g2" class="white-cell">♙</td>
							<td id="h2" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 1pt 0pt 0pt">♙</td>
							<td class="board-sidebar">&nbsp;&nbsp;</td>						
						</tr>
						<tr>
							<td class="board-sidebar">1</td>
							<td id="a1" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 1pt 1pt">♖</td>
							<td id="b1" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 1pt 0pt">♘</td>
							<td id="c1" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 1pt 0pt">♗</td>
							<td id="d1" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 1pt 0pt">♕</td>
							<td id="e1" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 1pt 0pt">♔</td>
							<td id="f1" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 1pt 0pt">♗</td>
							<td id="g1" class="black-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 0pt 1pt 0pt">♘</td>
							<td id="h1" class="white-cell" style="border-collapse: collapse; border-color: black; border-style: solid; border-width: 0pt 1pt 1pt 0pt">♖</td>
							<td class="board-sidebar">&nbsp;&nbsp;</td>						
						</tr>
						<tr>
							<td class="board-footer">&nbsp;&nbsp;</td>
							<td class="board-footer">a</td>
							<td class="board-footer">b</td>
							<td class="board-footer">c</td>
							<td class="board-footer">d</td>
							<td class="board-footer">e</td>
							<td class="board-footer">f</td>
							<td class="board-footer">g</td>
							<td class="board-footer">h</td>
							<td class="board-footer">&nbsp;&nbsp;</td>
						</tr>
					</tbody>
				</table>
			</div>
			History:
			<div class="col-lg-2 text-center" align="center" id="moveHistory">
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12 text-center" align="center">
				<button id="resetBoardButton">Reset</button>
				<button id="resetBoardButton">Back</button>
				<button id="resetBoardButton">Next</button>
			</div>
			
		</div>
		<%@include file="layouts/footer.jsp"%>
	</div>
	<script type="text/javascript">
        'use strict';
    </script>
</body>
</html>