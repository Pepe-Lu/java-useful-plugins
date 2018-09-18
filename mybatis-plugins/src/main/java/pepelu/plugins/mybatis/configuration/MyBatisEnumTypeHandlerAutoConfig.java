package pepelu.plugins.mybatis.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pepelu.plugins.mybatis.MyBatisEnumConfigurationBean;
import pepelu.plugins.mybatis.TypeHandlerConfigurationCustomizer;

/**
 * @author Pepe Lu
 */
@Configuration
@EnableConfigurationProperties(MyBatisEnumConfigurationBean.class)
public class MyBatisEnumTypeHandlerAutoConfig {
    private Logger logger = LoggerFactory.getLogger(MyBatisEnumTypeHandlerAutoConfig.class);
    private MyBatisEnumConfigurationBean myBatisEnumConfigurationBean;

    public MyBatisEnumTypeHandlerAutoConfig(MyBatisEnumConfigurationBean myBatisEnumConfigurationBean) {
        this.myBatisEnumConfigurationBean = myBatisEnumConfigurationBean;
    }

    @Bean
    public TypeHandlerConfigurationCustomizer typeHandlerConfigurationCustomizer() {
        logger.info("MyBatisEnumTypeHandler initializing...");
        return new TypeHandlerConfigurationCustomizer(myBatisEnumConfigurationBean.getEnumPackage());
    }
}
