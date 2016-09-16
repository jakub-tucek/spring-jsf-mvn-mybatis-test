package com.example.utils;

import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * Various utilities for jsf
 * Created by Jakub Tucek on 15.09.2016.
 */
public class FacesUtils {

    /**
     * Method for responding error
     * @param status error code
     * @param message message
     * @throws IOException ioEx
     */
    public static void responseSendError(int status, String message)
            throws IOException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().responseSendError(status, message);
        facesContext.responseComplete();
    }
}
