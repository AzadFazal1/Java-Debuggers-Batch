package xmlConfig.Runner;
import xmlConfig.config.*;

import xmlConfig.Beans.Writer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Runner {

	public static void main(String[] args) {
		//BeanFactory factory = new XMLBeanFactory(new ClassPathResource("Spring-config.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Writer writer = (Writer)context.getBean(Writer.class);
		writer.write();
		((AbstractApplicationContext) context).close();
	}

}
