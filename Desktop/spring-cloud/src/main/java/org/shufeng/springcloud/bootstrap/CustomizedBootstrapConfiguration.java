package org.shufeng.springcloud.bootstrap;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 柳忠国
 * @date 2020-05-01 21:12
 */
@Configuration
public class CustomizedBootstrapConfiguration implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        MutablePropertySources propertySources = environment.getPropertySources();
        // 定义一个新的PropertySource
        propertySources.addFirst(createPropertySource());
    }

    private PropertySource<?> createPropertySource() {

        Map<String, Object> source = new HashMap<>();

        source.put("name", "lzy");

        PropertySource propertySource = new MapPropertySource("my-property-source", source);

        return propertySource;
    }
}
