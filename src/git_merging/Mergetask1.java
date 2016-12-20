/** this is the test comment**/
package git_merging;

import java.util.ArrayList;

public class Mergetask1 {
	private ArrayList<String> events = new ArrayList<String>();
	
	public void createEvents() {
		events.add("We are going to a movie on saturday");
		events.add("Study session on Sunday @ Jim's house");
	}
	
	
	public void thoughtFortheDay() {
		System.out.println("On the other hand you have different fingers.");
	}
	
	public void upcomingEvents() {
		System.out.println("Upcoming Events - Please join with us");
		for (String event : events)
			System.out.println(event);
		
	}

	public static void main(String[] args) {
		Mergetask1 mt = new Mergetask1();
		mt.thoughtFortheDay();
		mt.createEvents();
		mt.upcomingEvents();

	}

}
