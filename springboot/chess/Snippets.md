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
> document.getElementById("board").addEventListener("click", selectCell,true);

- Javascript dragable
~~~~
<!DOCTYPE HTML>
<html>
<head>
<style>
.droptarget {
  float: left; 
  width: 100px; 
  height: 35px;
  margin: 15px;
  padding: 10px;
  border: 1px solid #aaaaaa;
}
</style>
</head>
<body>

<p>Drag the p element back and forth between the two rectangles:</p>

<div class="droptarget" ondrop="drop(event)" ondragover="allowDrop(event)">
  <p ondragstart="dragStart(event)" ondragend="dragEnd(event)" draggable="true" id="dragtarget">Drag me!</p>
</div>

<div class="droptarget" ondrop="drop(event)" ondragover="allowDrop(event)"></div>

<p style="clear:both;"><strong>Note:</strong> drag events are not supported in Internet Explorer 8 and earlier versions or Safari 5.1 and earlier versions.</p>

<p id="demo"></p>

<script>
function dragStart(event) {
  event.dataTransfer.setData("Text", event.target.id);
  document.getElementById("demo").innerHTML = "Started to drag the p element";
}

function dragEnd(event) {
  document.getElementById("demo").innerHTML = "Finished dragging the p element.";
}

function allowDrop(event) {
  event.preventDefault();
}

function drop(event) {
  event.preventDefault();
  var data = event.dataTransfer.getData("Text");
  event.target.appendChild(document.getElementById(data));
}
</script>

</body>
</html>
~~~~

# Neuroph
1. Neuron
The Neuron class has four primary attributes:

inputConnection: weighted connections between Neurons
inputFunction: specifies weights and vector sums applied to incoming connection data
transferFunction: specifies weights and vector sums applied to outgoing data
output: the output value resulting from the application of transferFunctions and inputFunctions to an inputConnection
Together those four primary attributes establish the behavior:
>output = transferFunction(inputFunction(inputConnections));

2. Layer
~~~
Layer layer = new Layer(); 
layer.addNeuron(n);
~~~

- Create Neural Network
~~~~
NeuralNetwork ann = new Perceptron(2, 4, 1);

~~~~
- Create Neural Network with Layer
~~~~
NeuralNetwork ann = new NeuralNetwork();   
Layer layer = new Layer();
ann.addLayer(0, layer);
ann.setInputNeurons(layer.getNeurons());
~~~~

- Add a Neural and Connect
~~~~
ann.addLayer(0, inputLayer);    
ann.addLayer(1, hiddenLayerOne); 
ConnectionFactory.fullConnect(ann.getLayerAt(0), ann.getLayerAt(1));

~~~~

- The first and last Layer should also be connected:
~~~~
ConnectionFactory.fullConnect(ann.getLayerAt(0), 
  ann.getLayerAt(ann.getLayersCount() - 1), false);
ann.setOutputNeurons(ann.getLayerAt(
  ann.getLayersCount() - 1).getNeurons());
~~~~
