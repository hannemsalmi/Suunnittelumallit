package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
	String[] array = {"banaani", "omena", "mandariini", "kiivi", "ananas", "greippi"};
	List<String> list = new ArrayList<>();
	for (int i = 0; i < array.length; i++) {
	    list.add(array[i]);
	}
	
	ListConverter newline = new NewlineStrategy();
    System.out.println(newline.listToString(list));
    
    ListConverter everyother = new EveryOtherStrategy();
    System.out.println(everyother.listToString(list));
    
    ListConverter everythird = new EveryThirdStrategy();
    System.out.println(everythird.listToString(list));

	}
}
	
