/**
 * Mai Thành Duy An [tiachop0102@gmail.com]
 */

'use strict';

console.log('Listen on ChessBoard');

document.getElementById("board").addEventListener("click", selectCell, true);

function selectCell(event) {
    console.log('cell:' + event.target.id);

    var cell = document.getElementById(event.target.id);

    console.log(cell.innerHTML.trim());

    resetBoardBackground();

    cell.style.backgroundColor = "rgb(236,119,22)";
}

function resetBoardBackground() {
    console.log('reset board background');
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
    
}