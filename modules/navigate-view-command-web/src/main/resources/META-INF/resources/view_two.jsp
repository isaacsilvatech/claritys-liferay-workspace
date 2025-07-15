<%@ include file="/init.jsp" %>
<%@ page import="br.com.isaacsilva.navigateviewcommand.constants.MVCPortletKeys" %>

<h3>Navigate View Command</h3>

<h4>View 2</h4>

<portlet:renderURL var="viewOneURL">
	<portlet:param name="mvcRenderCommandName" value="<%= MVCPortletKeys.MVC_RENDER_COMMAND_NAME_VIEW_ONE %>" />
</portlet:renderURL>

<a href="<%= viewOneURL %>">Go to View 1</a>