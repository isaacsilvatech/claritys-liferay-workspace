<%@ include file="/init.jsp" %>

<h4>Portlet</h4>

<h5>View 1</h5>

<portlet:renderURL var="view2URL">
    <portlet:param name="mvcPath" value="/view-2.jsp"/>
</portlet:renderURL>

<a href="<%= view2URL %>">Go to view 1</a>