function getStartCard(clicked_id){
    if(document.getElementById("startCardToBePicked").innerHTML == "First startcard") {
        document.getElementById("selectedFirstStartCard").innerHTML="First startcard: " + clicked_id;
        document.getElementById("startCardToBePicked").innerHTML="Second startcard";
        document.getElementById(clicked_id).disabled = true;
        document.getElementById("reset").disabled = false;

        document.getElementById("valueOfCard0").value = getValueOfClickedId(clicked_id);
        document.getElementById("suitOfCard0").value = getSuitOfClickedId(clicked_id);
    }
    else if(document.getElementById("selectedSecondStartCard").innerHTML == "Second startcard:") {
        document.getElementById("selectedSecondStartCard").innerHTML="Second startcard: " + clicked_id;
        document.getElementById("startCardToBePicked").innerHTML="Startcards chosen";
        document.getElementById("ok").disabled = false;

        document.getElementById("valueOfCard1").value = getValueOfClickedId(clicked_id);
        document.getElementById("suitOfCard1").value = getSuitOfClickedId(clicked_id);

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

    document.getElementById("selectedFirstStartCard").innerHTML="First startcard:"
    document.getElementById("selectedSecondStartCard").innerHTML="Second startcard:"
    document.getElementById("startCardToBePicked").innerHTML = "First startcard"
}

function getValueOfClickedId(clicked_id) {
    var baseValue = clicked_id.substring(0, 1);

    switch(baseValue) {
        case 'A':
            return 14;
            break;
        case 'K':
            return 13;
            break;
        case 'Q':
            return 12;
            break;
        case 'J':
            return 11;
            break;
        case 'T':
            return 10;
            break;
        default:
            return baseValue;
    }
}

function getSuitOfClickedId(clicked_id) {
    return clicked_id.substring(1, 2);
}