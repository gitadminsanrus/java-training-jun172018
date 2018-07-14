
/**
 * Java Documentation
 * 
 * This class represents a typical Box, and has following attributes/state:
 * 1. Width 
 * 2. Height
 * 3. Length
 * 
 * Volume of the box can be calculated by calling {@link #volume()} method of box object.
 * 
 * @author Sanrus Training Centre
 * @version 1
 * @since 1.0.0
 *
 */
public class Box {
	
	double width;
	double height;
	double length;
	
	//object-level initialization block
	//this block runs on every object just before the constructor gets executed.
	{
		width = 0.1;
		height = 0.1;
		length = 0.1;
	}
	
	//Constructor Overloading when you have multiple constructors
	Box()
	{
		width = 1;
		height = 1;
		length = 1;
	}
	
	Box(double width, double height, double length) 
	{
		//'this' is a java keyword and always points to object scope. 
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	double volume() {
		return width * height * length;
	}

}
