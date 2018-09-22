import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		
		
		//Represent desktop folder with File object
		File desktopFolder = new File("/Users/sanrustrainingcentre/Desktop");
		System.out.println(desktopFolder.exists());
		
		File newFileUnderDesktop = new File(desktopFolder, "test1.txt");
		try {
			newFileUnderDesktop.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("desktopFolder.isDirectory() => " + desktopFolder.isDirectory());
		System.out.println("newFileUnderDesktop.isFile() => " + newFileUnderDesktop.isFile());
		
		File[] roots = File.listRoots();
		for (int index = 0; index < roots.length; index++) {
			System.out.println(roots[index].getAbsolutePath());
		}
		
		File rootDirectory = File.listRoots()[0];
		long freeSpace = rootDirectory.getFreeSpace();
		System.out.println("rootDirectory.getFreeSpace() => " + (freeSpace / (1024.0 * 1024 * 1024)));
		
		File folder1UnderDesktopFolder = new File(desktopFolder, "folder1");
		folder1UnderDesktopFolder.mkdir();
		
		File seriesOfFoldersUnderDesktop = new File(desktopFolder, "folder2/folder3/folder4");
		seriesOfFoldersUnderDesktop.mkdirs();
		
		long lastModifiedTime = newFileUnderDesktop.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(lastModifiedTime));
		
		String date = cal.get(Calendar.YEAR) 
						+ "-" 
						+ (cal.get(Calendar.MONTH) + 1) 
						+ "-" 
						+ cal.get(Calendar.DAY_OF_MONTH)
						+ " " + cal.get(Calendar.HOUR_OF_DAY)
						+ ":" + cal.get(Calendar.MINUTE)
						+ ":" + cal.get(Calendar.SECOND)
						+ "." + cal.get(Calendar.MILLISECOND);
		
		System.out.println("Last Modified date => " + date);
		
		File folder2 = new File("/Users/sanrustrainingcentre/Desktop/folder2");
		File[] filesUnderDesktop = desktopFolder.listFiles();
		File[] filesUnderFolder2 = folder2.listFiles();
		
		System.out.println("-----------filesUnderDesktop---------------");
		for (File file : filesUnderDesktop) {
			System.out.println(file);
		}
		
		System.out.println("-----------filesUnderFolder2---------------");
		for (File file : filesUnderFolder2) {
			System.out.println(file);
		}
		
		System.out.println("-----------filesUnderFolder1---------------");
		File folder1 = new File("/Users/sanrustrainingcentre/Desktop/folder1");
		File[] filesUnderFolder1 = folder1.listFiles();
		for (File file : filesUnderFolder1) {
			System.out.println(file);
		}
		
		
		System.out.println("-----------Only Images under Folder1---------------");
		File[] imagesUnderFolder1 = folder1.listFiles(new ImageFilter());
		for (File file : imagesUnderFolder1) {
			System.out.println(file);
		}
		
		System.out.println("-----------Only Text files under Folder1---------------");
		File[] textFilesUnderFolder1 = folder1.listFiles(new TextFilter());
		for (File file : textFilesUnderFolder1) {
			System.out.println(file);
		}
		
	}

}












