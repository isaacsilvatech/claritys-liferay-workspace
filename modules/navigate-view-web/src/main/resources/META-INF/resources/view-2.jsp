<%@ include file="/init.jsp" %>

<h4>Portlet</h4>

<h5>View 2</h5>

<portlet:renderURL var="view1URL">
    <portlet:param name="mvcPath" value="/view-1.jsp"/>
</portlet:renderURL>

<a href="<%= view1URL %>">Go to view 1</a>