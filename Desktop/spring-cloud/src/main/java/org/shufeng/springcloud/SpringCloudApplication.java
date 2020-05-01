package org.shufeng.springcloud;

import org.shufeng.springcloud.listener.InitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudApplication {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        SpringApplication springApplication = new SpringApplication(SpringCloudApplication.class);
        springApplication.addInitializers(new InitListener());
        ConfigurableApplicationContext applicationContext = springApplication.run(args);
        applicationContext.getEnvironment();
        System.out.println();
    }
}
