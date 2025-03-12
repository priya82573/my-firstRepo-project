public class StringArray
{
	public static void main(String[] args) {

		String[] rainbowColors = { "Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red" };
		for (String colors : rainbowColors) {
			System.out.print(colors + " ");
		}
		System.out.println();
		System.out.println(rainbowColors.length);

	}
}
