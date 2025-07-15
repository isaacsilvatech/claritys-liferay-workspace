package br.com.isaacsilva.navigateviewcommand.portlet.command.render;

import br.com.isaacsilva.navigateviewcommand.constants.MVCPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        property = {
                "javax.portlet.name=" + MVCPortletKeys.PORTLET_NAME,
                "mvc.command.name=" + MVCPortletKeys.MVC_RENDER_COMMAND_NAME_VIEW_TWO
        },
        service = MVCRenderCommand.class
)
public class ViewTwoMVCRenderComamnd implements MVCRenderCommand {

    private static final Log _log = LogFactoryUtil.getLog(ViewTwoMVCRenderComamnd.class);

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        if (_log.isInfoEnabled()) {
            _log.info("Invoking #render(RenderRequest, RenderResponse)");
        }
        return "/view_two.jsp";
    }
}
