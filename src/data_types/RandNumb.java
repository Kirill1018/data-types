package data_types;
import java.util.*;
public class RandNumb {
	public int[] randQuant = new int[10], sortArr = new int[10];
	public ArrayList<Integer> numbWhichAreLessThanAvVal = new ArrayList<Integer>();
	RandNumb() { }
	public void createArr() {
		Random random = new Random();
		for (int i = 0; i < randQuant.length; i++) this.randQuant[i] = random.nextInt(9 + 10 + 1) - 10;
	}
}