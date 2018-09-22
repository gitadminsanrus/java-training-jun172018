package search;

import java.io.File;

public class Search {
	
	private File rootFile;
	
	public Search(File rootFile) {
		this.rootFile = rootFile;
	}
	
	public void startIndexing() {
		System.out.println(rootFile.getAbsolutePath());
		for (File root : rootFile.listFiles()) {
			listFiles(root);
		}
	}
	
	private void listFiles(File file) {
		System.out.println(file.getAbsolutePath());
		
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files != null && files.length > 0) {
				for (File eachFile : file.listFiles()) {
					listFiles(eachFile);
				}
			}
		}
	}

}
