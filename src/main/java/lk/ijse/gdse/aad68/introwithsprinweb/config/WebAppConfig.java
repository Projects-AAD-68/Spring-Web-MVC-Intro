package lk.ijse.gdse.aad68.introwithsprinweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad68.introwithsprinweb")
@EnableWebMvc
public class WebAppConfig {
}
