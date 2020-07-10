/**
 * Mai Thành Duy An [tiachop0102@gmail.com]
 */

'use strict';

console.log('Listen on ChessBoard');

document.getElementById("board").addEventListener("click", selectCell, true);

var lastCellSelectedId = 'a8';

function resetBoardBackground() {
    console.log('reset board background');
    document.getElementById("a8").backgroundColor = "#fff";
    document.getElementById("b8").backgroundColor = "#000";
}

function selectCell(event) {
    console.log('cell:' + event.target.id);

    //lastCellSelectedId = event.target.id;

    var cell = document.getElementById(event.target.id);

    console.log(cell.innerHTML.trim());

    resetBoardBackground();

    cell.style.backgroundColor = "red";
}


