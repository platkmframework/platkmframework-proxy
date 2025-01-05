package org.platkmframework.proxy;

import org.platkmframework.annotation.TruslyException;

/**
 *   Author:
 *     Eduardo Iglesias
 *   Contributors:
 *   	Eduardo Iglesias - initial API and implementation
 */
@TruslyException
public class ProxyProcesorException extends RuntimeException {

    /**
     */
    private static final long serialVersionUID = 4773925953900658939L;

    /**
     * Atributo status
     */
    private int status = -1;

    /**
     * Constructor ProxyProcesorException
     */
    public ProxyProcesorException() {
        super();
    }

    /**
     * Constructor ProxyProcesorException
     * @param message message
     */
    public ProxyProcesorException(String message) {
        super(message);
    }

    /**
     * Constructor ProxyProcesorException
     * @param status status
     * @param message message
     */
    public ProxyProcesorException(int status, String message) {
        super(message);
        this.status = status;
    }

    /**
     * Constructor ProxyProcesorException
     * @param cause cause
     */
    public ProxyProcesorException(Throwable cause) {
        super(cause);
    }

    /**
     * getStatus
     * @return int
     */
    public int getStatus() {
        return status;
    }

    /**
     * setStatus
     * @param status status
     */
    public void setStatus(int status) {
        this.status = status;
    }
}
