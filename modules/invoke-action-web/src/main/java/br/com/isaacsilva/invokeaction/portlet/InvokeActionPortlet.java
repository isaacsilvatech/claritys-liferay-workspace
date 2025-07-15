package br.com.isaacsilva.invokeaction.portlet;

import br.com.isaacsilva.invokeaction.constants.InvokeActionPortletKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

/**
 * @author Isaac
 */
@Component(
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=Invoke Action",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + InvokeActionPortletKeys.INVOKEACTION,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class InvokeActionPortlet extends MVCPortlet {

    private static final Log _log = LogFactoryUtil.getLog(InvokeActionPortlet.class);

    public void doSomething(ActionRequest actionRequest, ActionResponse actionResponse) {
        logInfoEnabled("Invoking #doSomething(ActionRequest, ActionResponse)");
    }

    public void doSomethingElse(ActionRequest actionRequest, ActionResponse actionResponse) {
        logInfoEnabled("Invoking #doSomethingElse(ActionRequest, ActionResponse)");
    }

    @ProcessAction(name = "nameForTheDoSomethingMoreMethod")
    public void doSomethingMore(ActionRequest actionRequest, ActionResponse actionResponse) {
        logInfoEnabled("Invoking #doSomethingMore(ActionRequest, ActionResponse)");
    }

    private void logInfoEnabled(String message) {
        if (_log.isInfoEnabled()) {
            _log.info(message);
        }
    }
}