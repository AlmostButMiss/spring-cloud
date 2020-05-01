package org.shufeng.springcloud.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 柳忠国
 * @date 2020-05-01 13:54
 */
public class InitListener implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("--------------initialize----:读取配置文件操作......");
    }

}

