package br.com.isaacsilva.navigateviewcommand.portlet;

import br.com.isaacsilva.navigateviewcommand.constants.MVCPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Isaac
 */
@Component(
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=NavigateViewCommand",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view_one.jsp",
                "javax.portlet.name=" + MVCPortletKeys.PORTLET_NAME,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class NavigateViewCommandPortlet extends MVCPortlet {
}