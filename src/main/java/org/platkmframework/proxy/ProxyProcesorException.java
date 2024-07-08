package org.platkmframework.proxy;

import org.platkmframework.annotation.TruslyException;

@TruslyException
public class ProxyProcesorException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4773925953900658939L;
	
	private int status = -1;

	public ProxyProcesorException() {
		super();
	}

	public ProxyProcesorException(String message) {
		super(message);
	}
	
	public ProxyProcesorException(int status, String message) {
		super(message);
		this.status = status;
	}

	public ProxyProcesorException(Throwable cause) {
		super(cause);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
