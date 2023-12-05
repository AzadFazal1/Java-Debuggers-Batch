package xmlConfig.Beans;

import org.springframework.stereotype.Component;

import xmlConfig.Interfaces.Ink;
@Component
public class BlackInk implements Ink{

	public String getColor() {
		return "Black";
	}

	public String getBrandName() {
		return "Parker";
	}

}
