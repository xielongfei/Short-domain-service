package com.domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: xielongfei
 * @date: 2022/01/09
 * @description:
 */
public class DomainMapTest {

    @Test
    public void testAddDomain() {
        DomainMap map = new DomainMap();
        String text = map.addDomain("https://www.baidu.com");
        map.addDomain("https://www.baidu.com");
        Assert.assertEquals("1HD7e0", text);
    }

    @Test
    public void testGetDomain() {
        DomainMap map = new DomainMap();
        map.addDomain("https://www.google.com");
        Assert.assertNotNull(map.getDomain("1MtA3I"));
    }
}
