package org.platkmframework.proxy;

import java.lang.reflect.Method;

public interface ProxyProcessor{

	Object run(Object proxy, Class<?> classInterface, Method method, Object[] args) throws ProxyProcesorException;

}
