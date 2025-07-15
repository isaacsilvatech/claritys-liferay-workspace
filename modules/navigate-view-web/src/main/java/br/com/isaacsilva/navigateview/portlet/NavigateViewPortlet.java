package br.com.isaacsilva.navigateview.portlet;

import br.com.isaacsilva.navigateview.constants.NavigateViewPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;

import javax.portlet.*;
import java.io.IOException;

/**
 * @author Isaac
 */
@Component(
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=Navigate View",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view-1.jsp",
                "javax.portlet.name=" + NavigateViewPortletKeys.NAVIGATEVIEW,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user",
                "javax.portlet.version=3.0"
        },
        service = Portlet.class
)
public class NavigateViewPortlet extends MVCPortlet {

    private static final Log _log = LogFactoryUtil.getLog(NavigateViewPortlet.class);

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        logParamMvcPath(renderRequest);
        super.render(renderRequest, renderResponse);
    }

    private static void logParamMvcPath(RenderRequest renderRequest) {
        if (_log.isInfoEnabled()) {
            RenderParameters parameters = renderRequest.getRenderParameters();
            String mvcPath = parameters.getValue("mvcPath");
            _log.info("MVC Path: " + mvcPath);
        }
    }
}