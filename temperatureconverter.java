import java.util.Scanner;

public class temperatureconverter {

	public static boolean isNumber(String inTemp) {
		// method to validate the number
		boolean validator = false;
		int number;
		
		try {
			number = Integer.parseInt(inTemp);
			validator = true;
		} catch (Exception e) {
			validator = false;
		}
		
		return validator;
	}
	
	public static void solve() {
		Scanner data = new Scanner(System.in);
		
		System.out.println("A: Convert Celsius to Fahrenheit");
		System.out.println("B: Convert Fahrenheit to Celsius");
		String selection;
		var temp = 0;
		String number;
		boolean validate = null;		
		
		do {
			selection = data.nextLine().toUpperCase();
		} while (!selection.equals("A") && !selection.equals("B"));
		
		// Will repeat until the user enter a invalid number
		do {
			System.out.print("Enter the starting temperature: ");
			number = data.nextLine();
			validate = isNumber(number);
		} while (!validate);
		
		temp = Integer.parseInt(number);
		
		switch (selection) {
			case "A":
				System.out.printf("%s degress Celsius is %s degrees Fahrenheit.", temp, String.format("%.2f", (temp * 1.8 + 32)));
				break;
			case "B":
				System.out.printf("%s degress Celsius is %s degrees Celsius.", temp, String.format("%.2f", (temp - 32) / 1.8));
				break;
			default:
				break;
		}
	}
	
	public static void main(String[] args) {
		solve();
	}

}
