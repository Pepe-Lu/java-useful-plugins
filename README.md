# java-useful-plugins
Useful plugins in Java

## MyBatis plugins

MyBatis plugins provide plugins like enum type handlers.

For more usage, refer to [mybatis-plugins-demo](https://github.com/Pepe-Lu/java-useful-plugins/tree/master/mybatis-plugins-demo).

### MyBatisEnumTypeHandler

+ Include mybatis-plugins jar in your class path.

+ Configure your enum package to be recognized as MyBatisEnumType.

>For properties file:

>mybatis.plugins.enum-package: **