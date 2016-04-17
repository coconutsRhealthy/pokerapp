<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<link rel="stylesheet" type="text/css" href="/TestWebApp/style.css" />
<script src="/TestWebApp/script.js">
</script>

</head>
<body>
<p id="startcard">First startcard</p>

<table>
<c:set var="firstCardChosen" value="false"/>
<c:set var="counter" value="0"/>
<c:forEach begin="0" end="12" varStatus="loop">
    <tr>
    <c:forEach begin="0" end="3" varStatus="loop">
        <td>
        <button class="cardButton" type="button" id="${startCard[counter]}" onclick="getStartCard(this.id)">${startCard[counter]}</button>
        <c:set var="counter" value="${counter + 1}" />
        </td>
    </c:forEach>
    </tr>
</c:forEach>
</table>

<p id="first startcard">First startcard:</p>
<p id="second startcard">Second startcard:</p>
<table>
    <td>
        <form method="post" action="postStartHand" commandName="eijers">
            <button class="proceedOrStayButton" type="submit" id="ok" disabled>OK</button>
            <input name="age" type="text"/>
        </form>
    </td>
    <td>
        <button class="proceedOrStayButton" type="button" id="reset" onclick="reset()" disabled>Reset</button>
    </td>
</table>
</body>
</html>