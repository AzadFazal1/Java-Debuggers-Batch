package xmlConfig.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xmlConfig.Interfaces.Ink;
import xmlConfig.Interfaces.Pen;
@Component
public class FountainPen implements Pen {

	private Ink ink;
	@Autowired
	public FountainPen(Ink ink) {
		this.ink = ink;
	}
	
	//Setter injection using auto wired
	
	
	public void write() {
		System.out.println("Writing with " + ink.getColor() + " ink of " + ink.getBrandName());
			
	}

}
