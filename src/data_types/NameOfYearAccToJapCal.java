package data_types;
import java.util.Scanner;
public class NameOfYearAccToJapCal {
	public String dateOfHumBirth;
	NameOfYearAccToJapCal() { }
	public void setName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("дата рождения");
		this.dateOfHumBirth = scanner.nextLine();
	}
}