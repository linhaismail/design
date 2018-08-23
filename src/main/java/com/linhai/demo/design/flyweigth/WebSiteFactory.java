package com.linhai.demo.design.flyweigth;

import java.util.HashMap;

/**
 * @description: 网站工厂
 * @author: LinHai
 * @create: 2018-08-23 10:24
 */
public class WebSiteFactory {

    HashMap<String, ConcreteWebSite> webSiteMap = new HashMap<>();

    public WebSite getFlyWeight(String key) {
        if (webSiteMap.get(key) == null) {
            webSiteMap.put(key, new ConcreteWebSite(key));
        }
        return webSiteMap.get(key);
    }

    // 获得网站分类总数
    public int getCount() {
        return webSiteMap.size();
    }
}
