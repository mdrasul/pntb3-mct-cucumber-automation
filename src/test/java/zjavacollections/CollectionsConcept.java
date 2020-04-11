package zjavacollections;

import java.util.ArrayList;
import java.util.List;import org.openqa.selenium.WebElement;

public class CollectionsConcept {

	public static void main(String[] args) {



		List<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Orange");

		System.out.println("First Print With All Loaded Item ");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));

		}
		
		myList.remove(2);
		
		System.out.println("Second Item Removed ");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}

		myList.clear();
		System.out.println("Cleared ");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}

		



		//		String[] myArr = new String[5];
		//		myArr[0] = "A";
		//		myArr[1] = "b";
		//		myArr[2] = "c";
		//		myArr[3] = "d";
		//		myArr[4] = "e";
		//
		//		System.out.println("First Print With All Loaded Item ");
		//		for(int i=0;i<myArr.length;i++) {
		//			System.out.println(myArr[i]);
		//			
		//			if(i==2) {
		//				myArr[i] = "";
		//			}
		//			
		//		}
		//		
		//		System.out.println("2nd Print With All Removed Item at index2 ");
		//		for(int i=0;i<myArr.length;i++) {
		//			System.out.println(myArr[i]);
		//	
		//			
		//		}
		//		
		//		
		//		myArr = new String[6];
		//
		//		System.out.println("3rd Resized ");
		//		for(int i=0;i<myArr.length;i++) {
		//			System.out.println(myArr[i]);
		//	
		//		}






	}

}
