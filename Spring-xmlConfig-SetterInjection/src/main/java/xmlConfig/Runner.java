package xmlConfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlConfig.Beans.Writer;

import org.springframework.context.ApplicationContext;
public class Runner {

	public static void main(String[] args) {
		//BeanFactory factory = new XMLBeanFactory(new ClassPathResource("Spring-config.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
		Writer writer = (Writer)context.getBean("writer");
		writer.write();
		for(String bean : context.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
		
		((AbstractApplicationContext) context).close();
		
	}

}
