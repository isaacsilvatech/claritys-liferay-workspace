package br.com.isaacsilva.preferences.portlet.configuration.action;

import br.com.isaacsilva.preferences.constants.MVCPortletKeys;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import java.io.IOException;

@Component(
        property = {
                "javax.portlet.name=" + MVCPortletKeys.PORTLET_NAME,
        },
        service = ConfigurationAction.class
)
public class PreferecesConfigurationActionPortlet extends DefaultConfigurationAction {

    @Override
    public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
        setColor(actionRequest);
        super.processAction(actionRequest, actionResponse);
        redirect(actionRequest, actionResponse);
    }

    private void redirect(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
        String redirect = ParamUtil.getString(actionRequest, "redirect");
        if (redirect != null && !redirect.isEmpty()) {
            actionResponse.sendRedirect(redirect);
        }
    }

    private void setColor(ActionRequest actionRequest) {
        String name = "color";
        String param = "color";
        setPreference(actionRequest, name, ParamUtil.getString(actionRequest, param));
    }
}
