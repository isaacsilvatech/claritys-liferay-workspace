package br.com.isaacsilva.resourcedownload.portlet.command.resource;

import br.com.isaacsilva.resourcedownload.constants.MVCPortletKeys;
import br.com.isaacsilva.resourcedownload.exception.ResourceException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.io.IOException;

@Component(
        property = {
                "javax.portlet.name=" + MVCPortletKeys.PORTLET_NAME,
                "mvc.command.name=" + MVCPortletKeys.MVC_RESOURCE_COMMAND_DOWNLOAD
        },
        service = MVCResourceCommand.class
)
public class DownloadMVCResourceCommand implements MVCResourceCommand {

    private static final Log _log = LogFactoryUtil.getLog(DownloadMVCResourceCommand.class);

    @Override
    public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
        try {
            sendFile(resourceRequest, resourceResponse);
            return true;
        } catch (IOException ex) {
            _log.error(ex, ex);
            throw new ResourceException(ex);
        }
    }

    private static void sendFile(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
        String fileName = "text.txt";
        byte[] bytes = "Hello!".getBytes();
        String contentType = "text";
        PortletResponseUtil.sendFile(resourceRequest, resourceResponse, fileName, bytes, contentType);
    }
}
