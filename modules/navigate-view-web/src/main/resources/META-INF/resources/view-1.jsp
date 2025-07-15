<%@ include file="/init.jsp" %>

<h3>Navigate View</h3>

<h4>View 1</h4>

<portlet:renderURL var="view2URL">
    <portlet:param name="mvcPath" value="/view-2.jsp"/>
</portlet:renderURL>

<a href="<%= view2URL %>">Go to view 2</a>