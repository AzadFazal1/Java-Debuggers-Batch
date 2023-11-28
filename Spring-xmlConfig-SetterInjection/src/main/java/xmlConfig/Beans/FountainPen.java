package xmlConfig.Beans;

import xmlConfig.Interfaces.Ink;
import xmlConfig.Interfaces.Pen;

public class FountainPen implements Pen {

	private Ink ink;
	
//	public FountainPen(Ink ink) {
//		this.ink = ink;
//	}
	
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	
	public void write() {
		System.out.println("Writing with " + ink.getColor() + " ink of " + ink.getBrandName());
			
	}

}
