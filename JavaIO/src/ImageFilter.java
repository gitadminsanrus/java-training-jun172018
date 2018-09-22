import java.io.File;
import java.io.FilenameFilter;

public class ImageFilter implements FilenameFilter {
	
	public boolean accept(File dir, String name)
	{
		return name.endsWith(".png") 
				|| name.endsWith(".jpg") 
				|| name.endsWith(".jpeg") 
				|| name.endsWith(".png") 
				|| name.endsWith(".gif");
	}

}
