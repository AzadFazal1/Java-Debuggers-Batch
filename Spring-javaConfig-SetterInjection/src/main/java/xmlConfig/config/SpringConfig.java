package xmlConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import xmlConfig.Beans.BlackInk;
import xmlConfig.Beans.FountainPen;
import xmlConfig.Beans.Writer;

@Configuration
public class SpringConfig {
	
	@Bean
	public BlackInk blackInk() {
		return new BlackInk();
	}
	
	@Bean
	public FountainPen fountainPen(BlackInk blackInk) {
		
		FountainPen fountainPen = new FountainPen();
		fountainPen.setInk(blackInk);
		return fountainPen;
	}
	
	@Bean
	public Writer writer(FountainPen fountainPen) {
		Writer writer = new Writer();
		writer.setPen(fountainPen);
		return writer;
		
	}

}
