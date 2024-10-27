package data_types;
import java.util.Scanner;
public class ChristmTree {
	public int tierAm, height;
	ChristmTree() { }
	public void draw() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите число ярусов и высоту через пробел:");
		String features = scanner.nextLine();
		String[] characteristics = features.split(" ");
		this.tierAm = Integer.valueOf(characteristics[0]);
		this.height = Integer.valueOf(characteristics[1]);
	}
}