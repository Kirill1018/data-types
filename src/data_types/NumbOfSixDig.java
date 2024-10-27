package data_types;
import java.util.Scanner;
public class NumbOfSixDig {
	public int number;
	NumbOfSixDig() { }
	public void setNumb() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("шестизначное число");
		this.number = scanner.nextInt();
	}
}