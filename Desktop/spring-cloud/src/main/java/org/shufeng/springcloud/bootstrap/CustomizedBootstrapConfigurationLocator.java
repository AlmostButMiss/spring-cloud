package org.shufeng.springcloud.bootstrap;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.env.*;

import java.util.Collections;

/**
 * @author 柳忠国
 * @date 2020-05-01 21:36
 */
public class CustomizedBootstrapConfigurationLocator implements PropertySourceLocator {

    @Override
    public PropertySource<?> locate(Environment environment) {

        if (environment instanceof ConfigurableEnvironment) {
            ConfigurableEnvironment configurableEnvironment = ConfigurableEnvironment.class.cast(environment);
            MutablePropertySources propertySources = configurableEnvironment.getPropertySources();
            propertySources.addFirst(createPropertySource());
        }
        return null;
    }


    private PropertySource createPropertySource() {
        return new MapPropertySource("my-property-source-2",
                Collections.singletonMap("name2", "lzy-spring-cloud"));
    }
}
