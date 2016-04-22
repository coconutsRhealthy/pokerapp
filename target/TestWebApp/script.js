function getStartCard(clicked_id){
    if(document.getElementById("startcard").innerHTML == "First startcard") {
        document.getElementById("first startcard").innerHTML="First startcard: " + clicked_id
        document.getElementById("startcard").innerHTML="Second startcard"
        document.getElementById("reset").disabled = false;

        document.getElementById("mytext0").value = clicked_id;

    }
    else if(document.getElementById("second startcard").innerHTML == "Second startcard:") {
        document.getElementById("second startcard").innerHTML="Second startcard: " + clicked_id
        document.getElementById("startcard").innerHTML="Startcards chosen"
        document.getElementById("ok").disabled = false;

        document.getElementById("mytext1").value = clicked_id;

        var cardButtons = document.getElementsByClassName("cardButton");
        for(var i = 0; i < cardButtons.length; i++) {
          cardButtons[i].disabled = true;
        }
    }
}

function reset(){
    var cardButtons = document.getElementsByClassName("cardButton");
    for(var i = 0; i < cardButtons.length; i++) {
      cardButtons[i].disabled = false;
    }
    document.getElementById("reset").disabled = true
    document.getElementById("ok").disabled = true

    document.getElementById("first startcard").innerHTML="First startcard:"
    document.getElementById("second startcard").innerHTML="Second startcard:"
    document.getElementById("startcard").innerHTML = "First startcard"
}

function test() {


}

