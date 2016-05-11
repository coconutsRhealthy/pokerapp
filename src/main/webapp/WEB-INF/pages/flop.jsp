<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<link rel="stylesheet" type="text/css" href="/TestWebApp/style.css" />
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="/TestWebApp/scriptFlop.js"></script>

</head>
<body>
<p id="flopCardToBePicked">First flopcard</p>

<div id="cardButtonsAndHandEvaluation">
    <div id="cardButtons">
        <table>
        <c:set var="counter" value="0"/>
        <c:forEach begin="0" end="12" varStatus="loop">
            <tr>
            <c:forEach begin="0" end="3" varStatus="loop">
                <td>
                <button class="cardButton" type="button" id="${allStartCards[counter]}" onclick="getFlopCard(this.id)">${allStartCards[counter]}</button>
                <c:set var="counter" value="${counter + 1}" />
                </td>
            </c:forEach>
            </tr>
        </c:forEach>
        </table>
    </div>

    <div id="handEvaluation">
        <table>
            <tr>
                <td>
                    *...
                </td>
            </tr>
            <tr>
                <td>
                    *...
                </td>
            </tr>
            <tr>
                <td>
                    *...
                </td>
            </tr>
        </table>
    </div>
</div>

<div>
    <table>
        <c:forEach begin="0" end="2" varStatus="vs">
            <tr>
                <td>
                    Flop card ${vs.index + 1}:
                </td>
                <td id="flopCard${vs.index}">
                    ...
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td>
                Holecards:
            </td>
            <c:forEach var="listOfCards" items="${cardWrapper.listOfCards}" varStatus="vs">
                <td>
                    <div id="holeCardValueHidden[${vs.index}]" hidden="true">${listOfCards.cardValue}</div>
                    <div id="holeCardSuitHidden[${vs.index}]" hidden="true">${listOfCards.cardSuit}</div>
                    <div id="holeCard[${vs.index}]"></div>
                </td>
            </c:forEach>
        </tr>
    </table>

    <table>
        <tr>
            <td style="vertical-align:top;">
                <form:form method="post" action="flop" commandName="cardWrapper">
                    <button class="proceedOrStayButton" type="submit" id="ok" disabled>OK</button>
                </form:form>
            </td>
            <td style="vertical-align:top;">
                <button class="proceedOrStayButton" type="button" id="reset" onclick="reset()" disabled>Reset</button>
            </td>
        </tr>
    </table>
</div>


<script>
    changeCardValueToCharacterWhenValueAboveNine()
    disableHolecardButtons()
</script>


