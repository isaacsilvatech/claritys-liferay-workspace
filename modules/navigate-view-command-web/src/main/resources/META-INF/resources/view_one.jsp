<%@ include file="/init.jsp" %>
<%@ page import="br.com.isaacsilva.navigateviewcommand.constants.MVCPortletKeys" %>

<h3>Navigate View Command</h3>

<h4>View 1</h4>

<portlet:renderURL var="viewTwoURL">
	<portlet:param name="mvcRenderCommandName" value="<%= MVCPortletKeys.MVC_RENDER_COMMAND_NAME_VIEW_TWO %>" />
</portlet:renderURL>

<a href="<%= viewTwoURL %>">Go to View 2</a>