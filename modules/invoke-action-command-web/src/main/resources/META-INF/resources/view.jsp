<%@ include file="/init.jsp" %>
<%@ page import="br.com.isaacsilva.invokeactioncommand.constants.InvokeActionCommandPortletKeys" %>

<h3>Invoke Action Command</h3>

<p>
    <liferay-portlet:actionURL var="ableURL" name="<%= InvokeActionCommandPortletKeys.MVC_COMMAND_NAME_ABLE %>"></liferay-portlet:actionURL>
    <a href="<%= ableURL %>">Inovke Able</a>
</p>

<p>
    <liferay-portlet:actionURL var="bakerURL" name="<%= InvokeActionCommandPortletKeys.MVC_COMMAND_NAME_BAKER %>"></liferay-portlet:actionURL>
    <a href="<%= bakerURL %>">Inovke Baker</a>
</p>

