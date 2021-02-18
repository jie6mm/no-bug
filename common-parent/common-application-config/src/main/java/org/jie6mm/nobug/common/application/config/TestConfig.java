package org.jie6mm.nobug.common.application.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengshi(礞石)
 * @date 2021/2/18 16:31
 */
@Configurable
public class TestConfig {

    @Bean
    public List<String> testBean() {
        List<String> list = new ArrayList();
        list.add("firstBean");
        return list;
    }

    @Bean
    public String beanTest() {
        return "test";
    }

    @Bean
    public Integer beanTwo(@Qualifier("testBean") List<String> testBean) {
        return testBean.size();
    }

}
