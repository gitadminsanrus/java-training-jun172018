package demo;

import folder1.A;

public class Demo {

	public static void main(String[] args) {
		
		com.google.docs.OpenDocument googleDoc = new com.google.docs.OpenDocument();
		googleDoc.open();
		
		com.microsoft.docs.OpenDocument microsoftDoc = new com.microsoft.docs.OpenDocument();
		microsoftDoc.open();
		
		A a1 = new A();

	}

}
