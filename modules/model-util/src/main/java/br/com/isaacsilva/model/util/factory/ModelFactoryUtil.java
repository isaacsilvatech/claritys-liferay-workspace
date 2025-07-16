package br.com.isaacsilva.model.util.factory;

import javax.portlet.ActionRequest;

/**
 * @author Isaac
 */
public interface ModelFactoryUtil {

    public static <T> T fromRequest(ActionRequest request, Class<T> clazz) {
        return null;
    }
}