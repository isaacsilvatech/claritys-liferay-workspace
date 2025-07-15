<%@ include file="/init.jsp" %>
<%@ page import="br.com.isaacsilva.resourcedownload.constants.MVCPortletKeys" %>

<h3>Download</h3>

<portlet:resourceURL var="resourceURL" id="<%= MVCPortletKeys.MVC_RESOURCE_COMMAND_DOWNLOAD %>"/>
<a href="<%= resourceURL %>">Download</a>