# JS Snippets
- Jquery Click Event and get element id
~~~~
$(document).ready(function() {
    $("board").click(function(event) {
        //alert(event.target.id);
        console.log(event.target.id);
    });
});
~~~~

- [Javascript addEventListener]('https://www.w3schools.com/jsref/met_document_addeventlistener.asp')
>document.getElementById("board").addEventListener("click", selectCell,true);