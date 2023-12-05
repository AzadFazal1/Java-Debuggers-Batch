package xmlConfig.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import xmlConfig.Interfaces.Pen;
@Component
@Scope(value="prototype")
public class Writer {
	private Pen pen;
	
	@Autowired
	public Writer(Pen pen) {
		this.pen = pen;
	}
	
	public void write() {
		pen.write();
	}
	// if you are using only XMLBased configuration
	// <component-scan basePackage = {"com.st", com.abc"} >
}
