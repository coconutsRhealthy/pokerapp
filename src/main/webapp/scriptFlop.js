function changeCardValueToCharacterWhenValueAboveNine() {
    var valueFirstHoleCard = setValueHoleCard(document.getElementById("holeCardValueHidden[0]").innerHTML);
    var suitFirstHoleCard = document.getElementById("holeCardSuitHidden[0]").innerHTML;
    var holeCard0 = valueFirstHoleCard + suitFirstHoleCard;

    var valueSecondHoleCard = setValueHoleCard(document.getElementById("holeCardValueHidden[1]").innerHTML);
    var suitSecondHoleCard = document.getElementById("holeCardSuitHidden[1]").innerHTML;
    var holeCard1 = valueSecondHoleCard + suitSecondHoleCard;

    document.getElementById("holeCard[0]").innerHTML = holeCard0;
    document.getElementById("holeCard[1]").innerHTML = holeCard1;

    function setValueHoleCard(initialHoleCardValue) {
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
}
