package data_types;
import java.util.Scanner;
public class IntArrOfTwoDim {
	public int lineAm, colAm;
	IntArrOfTwoDim() { }
	public void complArr() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("число строк");
		this.lineAm = scanner.nextInt();
		System.out.println("число столбцов");
		this.colAm = scanner.nextInt();
	}
}