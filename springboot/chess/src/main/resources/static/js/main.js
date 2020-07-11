/**
 * Mai Thành Duy An [tiachop0102@gmail.com]
 */

'use strict';

console.log('Listen on ChessBoard');
/*----------------------------------------------------------------------------*/
let moveHistories = [];
let boardPosition = ["a8","b8","c8","d8","e8","f8","g8","h8",//
                     "a7","b7","c7","d7","e7","f7","g7","h7",//
                     "a6","b6","c6","d6","e6","f6","g6","h6",//
                     "a5","b5","c5","d5","e5","f5","g5","h5",//
                     "a4","b4","c4","d4","e4","f4","g4","4",//
                     "a3","b3","c3","d3","e3","f3","g3","h3",//
                     "a2","b2","c2","d2","e2","f2","g2","h2",//
                     "a1","b1","c1","d1","e1","f1","g1","h1",//
    ];
let oldCellSelected = "";
/*----------------------------------------------------------------------------*/
initialBoard();

document.getElementById("board").addEventListener("click", selectCell, true);

document.getElementsByTagName("body")[0].setAttribute("onresize","screenResize()");
document.getElementById("board").setAttribute("onresize","screenResize()");

document.getElementById("resetBoardButton").addEventListener('click',function(){
    resetBoard();
});


document.getElementById("moveHistory").innerHTML = "...";

function initialBoard() {
    resetBoard();
    initEvent();
}

function displayHistory(){
    document.getElementById("moveHistory").innerHTML = "" + moveHistories;
}

function selectCell(event){
    document.getElementById(event.target.id).classList.add("selected");
    if(oldCellSelected !== ""){
        document.getElementById(oldCellSelected).classList.remove("selected");
    }
    //resetBoardBackground();
    oldCellSelected = event.target.id;
}

// Drag event
/*----------------------------------------------------------------------------*/
function initEvent(){
    document.getElementById("a8").draggable="true";
    document.getElementById("a8").addEventListener("dragstart", dragStart, true);
    document.getElementById("a8").addEventListener("drop", drop, true);
    document.getElementById("a8").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("b8").draggable="true";
    document.getElementById("b8").addEventListener("dragstart", dragStart, true);
    document.getElementById("b8").addEventListener("drop", drop, true);
    document.getElementById("b8").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("c8").draggable="true";
    document.getElementById("c8").addEventListener("dragstart", dragStart, true);
    document.getElementById("c8").addEventListener("drop", drop, true);
    document.getElementById("c8").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("d8").draggable="true";
    document.getElementById("d8").addEventListener("dragstart", dragStart, true);
    document.getElementById("d8").addEventListener("drop", drop, true);
    document.getElementById("d8").addEventListener("dragover", allowDrop, true);
   
    document.getElementById("e8").draggable="true";
    document.getElementById("e8").addEventListener("dragstart", dragStart, true);
    document.getElementById("e8").addEventListener("drop", drop, true);
    document.getElementById("e8").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("f8").draggable="true";
    document.getElementById("f8").addEventListener("dragstart", dragStart, true);
    document.getElementById("f8").addEventListener("drop", drop, true);
    document.getElementById("f8").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("g8").draggable="true";
    document.getElementById("g8").addEventListener("dragstart", dragStart, true);
    document.getElementById("g8").addEventListener("drop", drop, true);
    document.getElementById("g8").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("h8").draggable="true";
    document.getElementById("h8").addEventListener("dragstart", dragStart, true);
    document.getElementById("h8").addEventListener("drop", drop, true);
    document.getElementById("h8").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("a7").draggable="true";
    document.getElementById("a7").addEventListener("dragstart", dragStart, true);
    document.getElementById("a7").addEventListener("drop", drop, true);
    document.getElementById("a7").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("b7").draggable="true";
    document.getElementById("b7").addEventListener("dragstart", dragStart, true);
    document.getElementById("b7").addEventListener("drop", drop, true);
    document.getElementById("b7").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("c7").draggable="true";
    document.getElementById("c7").addEventListener("dragstart", dragStart, true);
    document.getElementById("c7").addEventListener("drop", drop, true);
    document.getElementById("c7").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("d7").draggable="true";
    document.getElementById("d7").addEventListener("dragstart", dragStart, true);
    document.getElementById("d7").addEventListener("drop", drop, true);
    document.getElementById("d7").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("e7").draggable="true";
    document.getElementById("e7").addEventListener("dragstart", dragStart, true);
    document.getElementById("e7").addEventListener("drop", drop, true);
    document.getElementById("e7").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("f7").draggable="true";
    document.getElementById("f7").addEventListener("dragstart", dragStart, true);
    document.getElementById("f7").addEventListener("drop", drop, true);
    document.getElementById("f7").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("g7").draggable="true";
    document.getElementById("g7").addEventListener("dragstart", dragStart, true);
    document.getElementById("g7").addEventListener("drop", drop, true);
    document.getElementById("g7").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("h7").draggable="true";
    document.getElementById("h7").addEventListener("dragstart", dragStart, true);
    document.getElementById("h7").addEventListener("drop", drop, true);
    document.getElementById("h7").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("a6").draggable="true";
    document.getElementById("a6").addEventListener("dragstart", dragStart, true);
    document.getElementById("a6").addEventListener("drop", drop, true);
    document.getElementById("a6").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("b6").draggable="true";
    document.getElementById("b6").addEventListener("dragstart", dragStart, true);
    document.getElementById("b6").addEventListener("drop", drop, true);
    document.getElementById("b6").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("c6").draggable="true";
    document.getElementById("c6").addEventListener("dragstart", dragStart, true);
    document.getElementById("c6").addEventListener("drop", drop, true);
    document.getElementById("c6").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("d6").draggable="true";
    document.getElementById("d6").addEventListener("dragstart", dragStart, true);
    document.getElementById("d6").addEventListener("drop", drop, true);
    document.getElementById("d6").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("e6").draggable="true";
    document.getElementById("e6").addEventListener("dragstart", dragStart, true);
    document.getElementById("e6").addEventListener("drop", drop, true);
    document.getElementById("e6").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("f6").draggable="true";
    document.getElementById("f6").addEventListener("dragstart", dragStart, true);
    document.getElementById("f6").addEventListener("drop", drop, true);
    document.getElementById("f6").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("g6").draggable="true";
    document.getElementById("g6").addEventListener("dragstart", dragStart, true);
    document.getElementById("g6").addEventListener("drop", drop, true);
    document.getElementById("g6").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("h6").draggable="true";
    document.getElementById("h6").addEventListener("dragstart", dragStart, true);
    document.getElementById("h6").addEventListener("drop", drop, true);
    document.getElementById("h6").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("a5").draggable="true";
    document.getElementById("a5").addEventListener("dragstart", dragStart, true);
    document.getElementById("a5").addEventListener("drop", drop, true);
    document.getElementById("a5").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("b5").draggable="true";
    document.getElementById("b5").addEventListener("dragstart", dragStart, true);
    document.getElementById("b5").addEventListener("drop", drop, true);
    document.getElementById("b5").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("c5").draggable="true";
    document.getElementById("c5").addEventListener("dragstart", dragStart, true);
    document.getElementById("c5").addEventListener("drop", drop, true);
    document.getElementById("c5").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("d5").draggable="true";
    document.getElementById("d5").addEventListener("dragstart", dragStart, true);
    document.getElementById("d5").addEventListener("drop", drop, true);
    document.getElementById("d5").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("e5").draggable="true";
    document.getElementById("e5").addEventListener("dragstart", dragStart, true);
    document.getElementById("e5").addEventListener("drop", drop, true);
    document.getElementById("e5").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("f5").draggable="true";
    document.getElementById("f5").addEventListener("dragstart", dragStart, true);
    document.getElementById("f5").addEventListener("drop", drop, true);
    document.getElementById("f5").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("g5").draggable="true";
    document.getElementById("g5").addEventListener("dragstart", dragStart, true);
    document.getElementById("g5").addEventListener("drop", drop, true);
    document.getElementById("g5").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("h5").draggable="true";
    document.getElementById("h5").addEventListener("dragstart", dragStart, true);
    document.getElementById("h5").addEventListener("drop", drop, true);
    document.getElementById("h5").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("a4").draggable="true";
    document.getElementById("a4").addEventListener("dragstart", dragStart, true);
    document.getElementById("a4").addEventListener("drop", drop, true);
    document.getElementById("a4").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("b4").draggable="true";
    document.getElementById("b4").addEventListener("dragstart", dragStart, true);
    document.getElementById("b4").addEventListener("drop", drop, true);
    document.getElementById("b4").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("c4").draggable="true";
    document.getElementById("c4").addEventListener("dragstart", dragStart, true);
    document.getElementById("c4").addEventListener("drop", drop, true);
    document.getElementById("c4").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("d4").draggable="true";
    document.getElementById("d4").addEventListener("dragstart", dragStart, true);
    document.getElementById("d4").addEventListener("drop", drop, true);
    document.getElementById("d4").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("e4").draggable="true";
    document.getElementById("e4").addEventListener("dragstart", dragStart, true);
    document.getElementById("e4").addEventListener("drop", drop, true);
    document.getElementById("e4").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("f4").draggable="true";
    document.getElementById("f4").addEventListener("dragstart", dragStart, true);
    document.getElementById("f4").addEventListener("drop", drop, true);
    document.getElementById("f4").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("g4").draggable="true";
    document.getElementById("g4").addEventListener("dragstart", dragStart, true);
    document.getElementById("g4").addEventListener("drop", drop, true);
    document.getElementById("g4").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("h4").draggable="true";
    document.getElementById("h4").addEventListener("dragstart", dragStart, true);
    document.getElementById("h4").addEventListener("drop", drop, true);
    document.getElementById("h4").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("a3").draggable="true";
    document.getElementById("a3").addEventListener("dragstart", dragStart, true);
    document.getElementById("a3").addEventListener("drop", drop, true);
    document.getElementById("a3").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("b3").draggable="true";
    document.getElementById("b3").addEventListener("dragstart", dragStart, true);
    document.getElementById("b3").addEventListener("drop", drop, true);
    document.getElementById("b3").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("c3").draggable="true";
    document.getElementById("c3").addEventListener("dragstart", dragStart, true);
    document.getElementById("c3").addEventListener("drop", drop, true);
    document.getElementById("c3").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("d3").draggable="true";
    document.getElementById("d3").addEventListener("dragstart", dragStart, true);
    document.getElementById("d3").addEventListener("drop", drop, true);
    document.getElementById("d3").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("e3").draggable="true";
    document.getElementById("e3").addEventListener("dragstart", dragStart, true);
    document.getElementById("e3").addEventListener("drop", drop, true);
    document.getElementById("e3").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("f3").draggable="true";
    document.getElementById("f3").addEventListener("dragstart", dragStart, true);
    document.getElementById("f3").addEventListener("drop", drop, true);
    document.getElementById("f3").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("g3").draggable="true";
    document.getElementById("g3").addEventListener("dragstart", dragStart, true);
    document.getElementById("g3").addEventListener("drop", drop, true);
    document.getElementById("g3").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("h3").draggable="true";
    document.getElementById("h3").addEventListener("dragstart", dragStart, true);
    document.getElementById("h3").addEventListener("drop", drop, true);
    document.getElementById("h3").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("a2").draggable="true";
    document.getElementById("a2").addEventListener("dragstart", dragStart, true);
    document.getElementById("a2").addEventListener("drop", drop, true);
    document.getElementById("a2").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("b2").draggable="true";
    document.getElementById("b2").addEventListener("dragstart", dragStart, true);
    document.getElementById("b2").addEventListener("drop", drop, true);
    document.getElementById("b2").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("c2").draggable="true";
    document.getElementById("c2").addEventListener("dragstart", dragStart, true);
    document.getElementById("c2").addEventListener("drop", drop, true);
    document.getElementById("c2").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("d2").draggable="true";
    document.getElementById("d2").addEventListener("dragstart", dragStart, true);
    document.getElementById("d2").addEventListener("drop", drop, true);
    document.getElementById("d2").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("e2").draggable="true";
    document.getElementById("e2").addEventListener("dragstart", dragStart, true);
    document.getElementById("e2").addEventListener("drop", drop, true);
    document.getElementById("e2").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("f2").draggable="true";
    document.getElementById("f2").addEventListener("dragstart", dragStart, true);
    document.getElementById("f2").addEventListener("drop", drop, true);
    document.getElementById("f2").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("g2").draggable="true";
    document.getElementById("g2").addEventListener("dragstart", dragStart, true);
    document.getElementById("g2").addEventListener("drop", drop, true);
    document.getElementById("g2").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("h2").draggable="true";
    document.getElementById("h2").addEventListener("dragstart", dragStart, true);
    document.getElementById("h2").addEventListener("drop", drop, true);
    document.getElementById("h2").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("a1").draggable="true";
    document.getElementById("a1").addEventListener("dragstart", dragStart, true);
    document.getElementById("a1").addEventListener("drop", drop, true);
    document.getElementById("a1").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("b1").draggable="true";
    document.getElementById("b1").addEventListener("dragstart", dragStart, true);
    document.getElementById("b1").addEventListener("drop", drop, true);
    document.getElementById("b1").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("c1").draggable="true";
    document.getElementById("c1").addEventListener("dragstart", dragStart, true);
    document.getElementById("c1").addEventListener("drop", drop, true);
    document.getElementById("c1").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("d1").draggable="true";
    document.getElementById("d1").addEventListener("dragstart", dragStart, true);
    document.getElementById("d1").addEventListener("drop", drop, true);
    document.getElementById("d1").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("e1").draggable="true";
    document.getElementById("e1").addEventListener("dragstart", dragStart, true);
    document.getElementById("e1").addEventListener("drop", drop, true);
    document.getElementById("e1").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("f1").draggable="true";
    document.getElementById("f1").addEventListener("dragstart", dragStart, true);
    document.getElementById("f1").addEventListener("drop", drop, true);
    document.getElementById("f1").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("g1").draggable="true";
    document.getElementById("g1").addEventListener("dragstart", dragStart, true);
    document.getElementById("g1").addEventListener("drop", drop, true);
    document.getElementById("g1").addEventListener("dragover", allowDrop, true);
    
    document.getElementById("h1").draggable="true";
    document.getElementById("h1").addEventListener("dragstart", dragStart, true);
    document.getElementById("h1").addEventListener("drop", drop, true);
    document.getElementById("h1").addEventListener("dragover", allowDrop, true);
    
}

function dragStart(event) {
    //console.log("Started to drag the p element " + event.target.id);
    event.dataTransfer.setData("Text", event.target.id);
    //document.getElementById(event.target.id).style.borderWidth="0pt 0pt 0pt 0pt";
}

function dragging(event) {
    //console.log("The p element is being dragging..");
}

function allowDrop(event) {
    //console.log("allowDrop");
    event.preventDefault();
}

function drop(event) {
    event.preventDefault();
    var data = event.dataTransfer.getData("Text");
    document.getElementById(event.target.id).innerHTML = document.getElementById(data).innerHTML;
    document.getElementById(data).innerHTML = "";
    var move = document.getElementById(event.target.id).innerHTML+data +"→"+ event.target.id;
    moveHistories.push(move);
    console.log("move: "+ move);
    displayHistory();
}

function dragEnter(event) {
    //console.log("dragEnter");
}

function dragLeave(event) {
  //console.log("dragLeave");
}

function screenResize(){
    var w = window.outerWidth;
    var h = window.outerHeight;
    if(w < 992){
        document.getElementById("board").style.width= (h-100) + "px";
        document.getElementById("board").style.height= (w-100) + "px";
    }
    console.clear();
    console.log("Screen width: "+ w +"   Screen height: " + h);
    
}
/*----------------------------------------------------------------------------*/
function resetBoard(){
    resetBoardBackground();
    resetBoardChess();
    moveHistories = [];
    document.getElementById("moveHistory").innerHTML = "";
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
/*----------------------------------------------------------------------------*/

