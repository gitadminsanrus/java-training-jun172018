package search;

import java.io.File;

public class SearchDemo {

	public static void main(String[] args) {
		
		Search search = new Search(new File("/Users/sanrustrainingcentre/"));
		search.startIndexing();

	}

}
