function changeCardValueToCharacterWhenValueAboveNine() {
    var holeCard0 = getHoleCard("holeCardValueHidden[0]", "holeCardSuitHidden[0]");
    var holeCard1 = getHoleCard("holeCardValueHidden[1]", "holeCardSuitHidden[1]");
    document.getElementById("holeCard[0]").innerHTML = holeCard0;
    document.getElementById("holeCard[1]").innerHTML = holeCard1;
}

function getCharacterConnectedToHolecardValue(initialHoleCardValue) {
    switch(initialHoleCardValue) {
        case '14':
            return 'A'
            break;
        case '13':
            return 'K'
            break;
        case '12':
            return 'Q'
            break;
        case '11':
            return 'J'
            break;
        case '10':
            return 'T'
            break;
        default:
            return initialHoleCardValue.substring(0, 1);
            break;
    }
}

function getFlopCard(clicked_id){
    var flopCardToBePicked = document.getElementById("flopCardToBePicked").innerHTML
    switch(flopCardToBePicked) {
        case "First flopcard":
            document.getElementById("flopCard0").innerHTML=clicked_id;
            document.getElementById("flopCardToBePicked").innerHTML = "Second flopcard"
            document.getElementById(clicked_id).disabled = true;
            document.getElementById("reset").disabled = false;
            break;
        case "Second flopcard":
            document.getElementById("flopCard1").innerHTML=clicked_id;
            document.getElementById("flopCardToBePicked").innerHTML = "Third flopcard"
            document.getElementById(clicked_id).disabled = true;
            break;
        case "Third flopcard":
            document.getElementById("flopCard2").innerHTML=clicked_id;
            document.getElementById("flopCardToBePicked").innerHTML = "Flopcards chosen"
            document.getElementById("ok").disabled = false;

            var cardButtons = document.getElementsByClassName("cardButton");
            for(var i = 0; i < cardButtons.length; i++) {
              cardButtons[i].disabled = true;
            }
            break;
    }
}

function disableHolecardButtons() {
    var holeCard0 = getHoleCard("holeCardValueHidden[0]", "holeCardSuitHidden[0]");
    var holeCard1 = getHoleCard("holeCardValueHidden[1]", "holeCardSuitHidden[1]");
    document.getElementById(holeCard0).disabled = true;
    document.getElementById(holeCard1).disabled = true;
}

function getHoleCard(firstOrSecondHolecardValue, firstOrSecondHolecardSuit) {
    var valueHoleCard = getCharacterConnectedToHolecardValue(document.getElementById(firstOrSecondHolecardValue).innerHTML);
    var suitHoleCard = document.getElementById(firstOrSecondHolecardSuit).innerHTML;
    var holeCard = valueHoleCard + suitHoleCard;
    return holeCard;
}

function reset(){
    var cardButtons = document.getElementsByClassName("cardButton");
    for(var i = 0; i < cardButtons.length; i++) {
      cardButtons[i].disabled = false;
    }
    disableHolecardButtons();
    document.getElementById("flopCardToBePicked").innerHTML = "First flopcard";
    document.getElementById("reset").disabled = true;
    document.getElementById("ok").disabled = true;

    document.getElementById("flopCard0").innerHTML = "...";
    document.getElementById("flopCard1").innerHTML = "...";
    document.getElementById("flopCard2").innerHTML = "...";
}

$(document).ready(function () {
    $("#handEvaluation").height($("#cardButtons").height());
    $("#cardButtonsAndHandEvaluation").height($("#cardButtons").height());
});



