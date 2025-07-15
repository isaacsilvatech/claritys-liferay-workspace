<%@ include file="/init.jsp" %>


<h4>
    <liferay-ui:message key="invokeaction.caption" />
</h4>

<p>
	<portlet:actionURL name="doSomething" var="actionDoSomethingURL" />
    <a href="<%= actionDoSomethingURL %>">Do Something</a>
</p>

<p>
	<portlet:actionURL name="doSomethingElse" var="actionDoSomethingElseURL" />
    <a href="<%= actionDoSomethingElseURL %>">Do Something Else</a>
</p>

<p>
	<portlet:actionURL name="doSomethingMore" var="actionDoSomethingMoreURL" >
		<portlet:param name="javax.portlet.action" value="nameForTheDoSomethingMoreMethod" />
	</portlet:actionURL>
    <a href="<%= actionDoSomethingMoreURL %>">
        Do Something More
    </a>
</p>

