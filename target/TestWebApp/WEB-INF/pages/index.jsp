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
    <tr>
        <td style="vertical-align:top;">
            <form:form method="post" action="postStartHand" commandName="userForm">

                <c:set var="countertje2" value="0"/>
                <c:forEach varStatus="vs" var="eijerslist" items="${userForm.eijersList}" >

                    <form:input path="eijersList[${vs.index}].cardValue" id="mytext${countertje2}" value="7" hidden="true" />
                    <form:input path="eijersList[${vs.index}].cardSuit" id="mysuit${countertje2}" value="a" hidden="true" />

                    <c:set var="countertje2" value="${countertje2 + 1}" />

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