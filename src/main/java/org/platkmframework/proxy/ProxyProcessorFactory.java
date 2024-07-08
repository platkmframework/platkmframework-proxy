package org.platkmframework.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyProcessorFactory {
	
	
	private static ProxyProcessorFactory proxyProcessorFactory;
	
	private Map<String, ProxyProcessor> map;
	

	private ProxyProcessorFactory() {
		super();
		map = new HashMap<String, ProxyProcessor>();
	}
	
	public static ProxyProcessorFactory instance() {
		if(proxyProcessorFactory == null) proxyProcessorFactory = new ProxyProcessorFactory();
		return proxyProcessorFactory;
	}
	
	public void register(String key,ProxyProcessor proxyProcessor) {
		map.put(key, proxyProcessor);
	}
	
	public ProxyProcessor seek(String key) {
		return map.get(key);
	}

}
