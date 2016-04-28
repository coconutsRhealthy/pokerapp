<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<link rel="stylesheet" type="text/css" href="/TestWebApp/style.css" />
<script src="/TestWebApp/script.js">
</script>

</head>
<body>
<p id="startCardToBePicked">First startcard</p>

<table>
<c:set var="firstCardChosen" value="false"/>
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

<p id="selectedFirstStartCard">First startcard:</p>
<p id="selectedSecondStartCard">Second startcard:</p>
<table>
    <tr>
        <td style="vertical-align:top;">
            <form:form method="post" action="postStartHand" commandName="cardWrapper">
                <c:set var="counter" value="0"/>
                <c:forEach varStatus="vs" var="listOfCards" items="${cardWrapper.listOfCards}" >
                    <form:input type="hidden" path="listOfCards[${vs.index}].cardValue" id="valueOfCard${counter}" value="7"/>
                    <form:input type="hidden" path="listOfCards[${vs.index}].cardSuit" id="suitOfCard${counter}" value="a"/>
                    <c:set var="counter" value="${counter + 1}" />
                </c:forEach>
                <button class="proceedOrStayButton" type="submit" id="ok" disabled>OK</button>
            </form:form>
        </td>
        <td style="vertical-align:top;">
            <button class="proceedOrStayButton" type="button" id="reset" onclick="reset()" disabled>Reset</button>
        </td>
    </tr>
</table>
</body>
</html>