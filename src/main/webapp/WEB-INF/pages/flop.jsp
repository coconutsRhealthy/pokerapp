<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<link rel="stylesheet" type="text/css" href="/TestWebApp/style.css" />
<script src="/TestWebApp/scriptFlop.js">
</script>

</head>
<body>
<p id="startCardToBePicked">First flopcard</p>

<table>
<c:set var="counter" value="0"/>
<c:forEach begin="0" end="12" varStatus="loop">
    <tr>
    <c:forEach begin="0" end="3" varStatus="loop">
        <td>
        <button class="cardButton" type="button" id="${allStartCards[counter]}" onclick="getStartCard(this.id)">${allStartCards[counter]}</button>
        <c:set var="counter" value="${counter + 1}" />
        </td>
    </c:forEach>
    </tr>
</c:forEach>
</table>

<table>
    <tr>
        <td>
            Holecards:
        </td>
    </tr>
    <c:forEach var="listOfCards" items="${cardWrapper.listOfCards}" varStatus="vs">
        <tr>
            <td>
                <div id="holeCardValueHidden[${vs.index}]" hidden="true">${listOfCards.cardValue}</div>
                <div id="holeCardSuitHidden[${vs.index}]" hidden="true">${listOfCards.cardSuit}</div>
                <div id="holeCard[${vs.index}]"></div>
            </td>
        </tr>
    </c:forEach>
</table>

<script>
    changeCardValueToCharacterWhenValueAboveNine()
</script>
