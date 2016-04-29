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

${cardWrapper.listOfCards[0].cardValue}
${cardWrapper.listOfCards[0].cardSuit}


<c:forEach varStatus="vs" var="listOfCards" items="${cardWrapper.listOfCards}">
        <c:out value="${listOfCards[${vs.index}].cardValue}"/>
        <c:out value="${listOfCards[${vs.index}].cardSuit}"/>
</c:forEach>
