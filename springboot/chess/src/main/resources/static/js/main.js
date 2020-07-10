/**
 * Mai Thành Duy An [tiachop0102@gmail.com]
 */

'use strict';

console.log('Listen on ChessBoard');

initialBoard();

document.getElementById("board").addEventListener("click", selectCell, true);

document.getElementById("resetBoardButton").addEventListener('click',function(){
    resetBoard();
});

function initialBoard() {
    resetBoard();
}

function selectCell(event){
    console.log('cell:' + event.target.id);
    var cell = document.getElementById(event.target.id);
    console.log(cell.innerHTML.trim());
    resetBoardBackground();
    cell.style.backgroundColor = "rgb(236,119,22)"; 
}

function initialBoard(){
    resetBoard();
}

function resetBoard(){
    resetBoardBackground();
    resetBoardChess();
}

function resetBoardBackground() {
    //console.log('reset board background');
    document.getElementById("a8").style.backgroundColor = "#fff";
    document.getElementById("b8").style.backgroundColor = "#C0C0C0";
    document.getElementById("c8").style.backgroundColor = "#fff";
    document.getElementById("d8").style.backgroundColor = "#C0C0C0";
    document.getElementById("e8").style.backgroundColor = "#fff";
    document.getElementById("f8").style.backgroundColor = "#C0C0C0";
    document.getElementById("g8").style.backgroundColor = "#fff";
    document.getElementById("h8").style.backgroundColor = "#C0C0C0";

    document.getElementById("a7").style.backgroundColor = "#C0C0C0";
    document.getElementById("b7").style.backgroundColor = "#fff";
    document.getElementById("c7").style.backgroundColor = "#C0C0C0";
    document.getElementById("d7").style.backgroundColor = "#fff";
    document.getElementById("e7").style.backgroundColor = "#C0C0C0";
    document.getElementById("f7").style.backgroundColor = "#fff";
    document.getElementById("g7").style.backgroundColor = "#C0C0C0";
    document.getElementById("h7").style.backgroundColor = "#fff";

    document.getElementById("a6").style.backgroundColor = "#fff";
    document.getElementById("b6").style.backgroundColor = "#C0C0C0";
    document.getElementById("c6").style.backgroundColor = "#fff";
    document.getElementById("d6").style.backgroundColor = "#C0C0C0";
    document.getElementById("e6").style.backgroundColor = "#fff";
    document.getElementById("f6").style.backgroundColor = "#C0C0C0";
    document.getElementById("g6").style.backgroundColor = "#fff";
    document.getElementById("h6").style.backgroundColor = "#C0C0C0";

    document.getElementById("a5").style.backgroundColor = "#C0C0C0";
    document.getElementById("b5").style.backgroundColor = "#fff";
    document.getElementById("c5").style.backgroundColor = "#C0C0C0";
    document.getElementById("d5").style.backgroundColor = "#fff";
    document.getElementById("e5").style.backgroundColor = "#C0C0C0";
    document.getElementById("f5").style.backgroundColor = "#fff";
    document.getElementById("g5").style.backgroundColor = "#C0C0C0";
    document.getElementById("h5").style.backgroundColor = "#fff";

    document.getElementById("a4").style.backgroundColor = "#fff";
    document.getElementById("b4").style.backgroundColor = "#C0C0C0";
    document.getElementById("c4").style.backgroundColor = "#fff";
    document.getElementById("d4").style.backgroundColor = "#C0C0C0";
    document.getElementById("e4").style.backgroundColor = "#fff";
    document.getElementById("f4").style.backgroundColor = "#C0C0C0";
    document.getElementById("g4").style.backgroundColor = "#fff";
    document.getElementById("h4").style.backgroundColor = "#C0C0C0";

    document.getElementById("a3").style.backgroundColor = "#C0C0C0";
    document.getElementById("b3").style.backgroundColor = "#fff";
    document.getElementById("c3").style.backgroundColor = "#C0C0C0";
    document.getElementById("d3").style.backgroundColor = "#fff";
    document.getElementById("e3").style.backgroundColor = "#C0C0C0";
    document.getElementById("f3").style.backgroundColor = "#fff";
    document.getElementById("g3").style.backgroundColor = "#C0C0C0";
    document.getElementById("h3").style.backgroundColor = "#fff";

    document.getElementById("a2").style.backgroundColor = "#fff";
    document.getElementById("b2").style.backgroundColor = "#C0C0C0";
    document.getElementById("c2").style.backgroundColor = "#fff";
    document.getElementById("d2").style.backgroundColor = "#C0C0C0";
    document.getElementById("e2").style.backgroundColor = "#fff";
    document.getElementById("f2").style.backgroundColor = "#C0C0C0";
    document.getElementById("g2").style.backgroundColor = "#fff";
    document.getElementById("h2").style.backgroundColor = "#C0C0C0";

    document.getElementById("a1").style.backgroundColor = "#C0C0C0";
    document.getElementById("b1").style.backgroundColor = "#fff";
    document.getElementById("c1").style.backgroundColor = "#C0C0C0";
    document.getElementById("d1").style.backgroundColor = "#fff";
    document.getElementById("e1").style.backgroundColor = "#C0C0C0";
    document.getElementById("f1").style.backgroundColor = "#fff";
    document.getElementById("g1").style.backgroundColor = "#C0C0C0";
    document.getElementById("h1").style.backgroundColor = "#fff";
}

function resetBoardChess(){
    document.getElementById("a8").innerHTML="♜";
    document.getElementById("b8").innerHTML="♞";
    document.getElementById("c8").innerHTML="♝";
    document.getElementById("d8").innerHTML="♛";
    document.getElementById("e8").innerHTML="♚";
    document.getElementById("f8").innerHTML="♝";
    document.getElementById("g8").innerHTML="♞";
    document.getElementById("h8").innerHTML="♜";
    
    document.getElementById("a7").innerHTML="♟";
    document.getElementById("b7").innerHTML="♟";
    document.getElementById("c7").innerHTML="♟";
    document.getElementById("d7").innerHTML="♟";
    document.getElementById("e7").innerHTML="♟";
    document.getElementById("f7").innerHTML="♟";
    document.getElementById("g7").innerHTML="♟";
    document.getElementById("h7").innerHTML="♟";
    
    document.getElementById("a6").innerHTML="";
    document.getElementById("b6").innerHTML="";
    document.getElementById("c6").innerHTML="";
    document.getElementById("d6").innerHTML="";
    document.getElementById("e6").innerHTML="";
    document.getElementById("f6").innerHTML="";
    document.getElementById("g6").innerHTML="";
    document.getElementById("h6").innerHTML="";
    
    document.getElementById("a5").innerHTML="";
    document.getElementById("b5").innerHTML="";
    document.getElementById("c5").innerHTML="";
    document.getElementById("d5").innerHTML="";
    document.getElementById("e5").innerHTML="";
    document.getElementById("f5").innerHTML="";
    document.getElementById("g5").innerHTML="";
    document.getElementById("h5").innerHTML="";
    
    document.getElementById("a4").innerHTML="";
    document.getElementById("b4").innerHTML="";
    document.getElementById("c4").innerHTML="";
    document.getElementById("d4").innerHTML="";
    document.getElementById("e4").innerHTML="";
    document.getElementById("f4").innerHTML="";
    document.getElementById("g4").innerHTML="";
    document.getElementById("h4").innerHTML="";
    
    document.getElementById("a3").innerHTML="";
    document.getElementById("b3").innerHTML="";
    document.getElementById("c3").innerHTML="";
    document.getElementById("d3").innerHTML="";
    document.getElementById("e3").innerHTML="";
    document.getElementById("f3").innerHTML="";
    document.getElementById("g3").innerHTML="";
    document.getElementById("h3").innerHTML="";
    
    document.getElementById("a2").innerHTML="♙";
    document.getElementById("b2").innerHTML="♙";
    document.getElementById("c2").innerHTML="♙";
    document.getElementById("d2").innerHTML="♙";
    document.getElementById("e2").innerHTML="♙";
    document.getElementById("f2").innerHTML="♙";
    document.getElementById("g2").innerHTML="♙";
    document.getElementById("h2").innerHTML="♙";
    
    document.getElementById("a1").innerHTML="♖";
    document.getElementById("b1").innerHTML="♘";
    document.getElementById("c1").innerHTML="♗";
    document.getElementById("d1").innerHTML="♕";
    document.getElementById("e1").innerHTML="♔";
    document.getElementById("f1").innerHTML="♗";
    document.getElementById("g1").innerHTML="♘";
    document.getElementById("h1").innerHTML="♖";
    
}