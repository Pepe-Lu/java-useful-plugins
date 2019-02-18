package pepelu.plugins.mybatis;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Pepe Lu
 */
@ConfigurationProperties("mybatis.plugins")
public class MyBatisEnumConfigurationBean {
    private String enumPackage;

    public String getEnumPackage() {
        return enumPackage;
    }

    public void setEnumPackage(String enumPackage) {
        this.enumPackage = enumPackage;
    }
}
