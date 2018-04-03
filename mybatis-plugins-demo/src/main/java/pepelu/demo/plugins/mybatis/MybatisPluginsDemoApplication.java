package pepelu.demo.plugins.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pepelu.demo.plugins.mybatis.mapper")
public class MybatisPluginsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPluginsDemoApplication.class, args);
	}
}
