package CollectionFrameworkLearnings;

import java.util.ArrayList;
import java.util.List;
public class CollectionFrameworkDemos {

	public static void main(String[] args) {

		List<String> places = new ArrayList<>();

		places.add("Andamans");
		places.add("Lakshdweep");
		places.add(null);
		places.add(null);
		places.add("Andamans");
		places.remove(places.indexOf("Andamans"));

		System.out.println(places.toString());
	}
}
