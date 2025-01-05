/**
 * ****************************************************************************
 *  Copyright(c) 2024 the original author Eduardo Iglesias Taylor.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  	 https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  Contributors:
 *  	Eduardo Iglesias Taylor - initial API and implementation
 * *****************************************************************************
 */
package org.platkmframework.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 *   Author:
 *     Eduardo Iglesias
 *   Contributors:
 *   	Eduardo Iglesias - initial API and implementation
 */
public class ProxyProcessorFactory {

    /**
     * Attribute proxyProcessorFactory
     */
    private static ProxyProcessorFactory proxyProcessorFactory;

    /**
     * Attribute map
     */
    private Map<String, ProxyProcessor> map;

    /**
     * Constructor ProxyProcessorFactory
     */
    private ProxyProcessorFactory() {
        super();
        map = new HashMap<>();
    }

    /**
     * instance
     * @return ProxyProcessorFactory
     */
    public static ProxyProcessorFactory instance() {
        if (proxyProcessorFactory == null)
            proxyProcessorFactory = new ProxyProcessorFactory();
        return proxyProcessorFactory;
    }

    /**
     * register
     * @param key key
     * @param proxyProcessor proxyProcessor
     */
    public void register(String key, ProxyProcessor proxyProcessor) {
        map.put(key, proxyProcessor);
    }

    /**
     * seek
     * @param key key
     * @return ProxyProcessor
     */
    public ProxyProcessor seek(String key) {
        return map.get(key);
    }
}
