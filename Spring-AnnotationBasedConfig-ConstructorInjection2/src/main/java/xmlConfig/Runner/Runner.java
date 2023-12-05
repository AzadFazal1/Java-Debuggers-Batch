package xmlConfig.Runner;
import xmlConfig.config.*;

import xmlConfig.Beans.Writer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Runner {

	public static void main(String[] args) {
		//BeanFactory factory = new XMLBeanFactory(new ClassPathResource("Spring-config.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Writer writer1 = (Writer)context.getBean("writer");
		writer1.write();
		System.out.println(writer1);
		Writer writer2 = (Writer)context.getBean("writer");
		writer2.write();
		System.out.println(writer2);

	}

}
