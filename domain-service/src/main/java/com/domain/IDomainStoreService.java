package com.domain;

/**
 * @author: xielongfei
 * @date: 2022/01/09
 * @description: 域名存储接口
 */
public interface IDomainStoreService {

    /**
     * 新增一个域名
     */
    String addDomain(String text);

    /**
     * 查询一个域名
     */
    String getDomain(String text);
}
