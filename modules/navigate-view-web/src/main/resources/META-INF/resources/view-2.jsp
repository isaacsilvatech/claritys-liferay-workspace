<%@ include file="/init.jsp" %>

<h3>Navigate View</h3>

<h4>View 2</h4>

<portlet:renderURL var="view1URL">
    <portlet:param name="mvcPath" value="/view-1.jsp"/>
</portlet:renderURL>

<a href="<%= view1URL %>">Go to view 1</a>