package br.com.isaacsilva.preferences.portlet;

import br.com.isaacsilva.preferences.constants.MVCPortletKeys;

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
                "javax.portlet.display-name=Preferences",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.config-template=/configuration.jsp",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + MVCPortletKeys.PORTLET_NAME,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class PreferencesPortlet extends MVCPortlet {
}