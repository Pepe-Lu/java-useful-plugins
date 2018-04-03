package pepelu.plugins.mybatis;

import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import pepelu.plugins.mybatis.typehandler.MyBatisEnumTypeHandler;
import pepelu.plugins.mybatis.typehandler.MyBatisEnum;

import java.util.Set;

public class TypeHandlerConfigurationCustomizer implements ConfigurationCustomizer {
    private String myBatisEnumTypePackage;

    public TypeHandlerConfigurationCustomizer(String myBatisEnumTypePackage) {
        this.myBatisEnumTypePackage = myBatisEnumTypePackage;
    }

    @Override
    public void customize(Configuration configuration) {
        TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();

        ResolverUtil<Class<?>> resolverUtil = new ResolverUtil<>();
        resolverUtil.find(new ResolverUtil.IsA(MyBatisEnum.class), myBatisEnumTypePackage);
        Set<Class<? extends Class<?>>> typeSet = resolverUtil.getClasses();
        for (Class<?> type : typeSet) {
            if (type.isEnum() && MyBatisEnum.class.isAssignableFrom(type)) {
                typeHandlerRegistry.register(type, MyBatisEnumTypeHandler.class);
            }
        }
    }
}
