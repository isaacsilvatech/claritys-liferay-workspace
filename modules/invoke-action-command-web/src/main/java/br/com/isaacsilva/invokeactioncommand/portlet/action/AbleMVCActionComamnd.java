package br.com.isaacsilva.invokeactioncommand.portlet.action;


import br.com.isaacsilva.invokeactioncommand.constants.InvokeActionCommandPortletKeys;
import br.com.isaacsilva.model.util.factory.ModelFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

@Component(
        property = {
                "javax.portlet.name=" + InvokeActionCommandPortletKeys.PORTLET_NAME,
                "mvc.command.name=" + InvokeActionCommandPortletKeys.MVC_COMMAND_NAME_ABLE
        },
        service = MVCActionCommand.class
)
public class AbleMVCActionComamnd extends BaseMVCActionCommand {

    private static final Log _log = LogFactoryUtil.getLog(AbleMVCActionComamnd.class);

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) {
        Object obj = ModelFactoryUtil.fromRequest(actionRequest, Object.class);

        if (_log.isInfoEnabled()) {
            _log.info("Invoking #doProcessAction(ActionRequest, ActionResponse)");
        }
    }
}
