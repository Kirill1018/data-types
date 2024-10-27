package data_types;
import java.util.*;
public class DataTyp {
	static boolean isWritt = false;
	static String[] signs = { "обезьяны", "петуха", "собаки",
			"свиньи", "крысы", "быка",
			"тигра", "кролика", "дракона",
			"змеи", "лошади", "овцы" };
	public static void main(String[] args) {
		NameOfYearAccToJapCal name = new NameOfYearAccToJapCal();
		name.setName();
		for (int x = 1902; x <= 2081; x++) {
			for (int i = 21; i <= 31; i++) {
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " марта " + Integer
						.toString(x) + " г")) getSign("знак: овен " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " января " + Integer
						.toString(x) + " г")) getSign("знак: водолей " + "год: " + year(x));
			}
			for (int i = 21; i <= 30; i++) if (name.dateOfHumBirth.contains(Integer.toString(i) + " апреля " + Integer
					.toString(x) + " г")) getSign("знак: телец " + "год: " + year(x));
			for (int i = 22; i <= 31; i++) {
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " мая " + Integer
						.toString(x) + " г")) getSign("знак: близнецы " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " августа " + Integer
						.toString(x) + " г")) getSign("знак: дева " + "год: " + year(x));
			}
			for (int i = 22; i <= 30; i++) if (name.dateOfHumBirth.contains(Integer.toString(i) + " июня " + Integer
					.toString(x) + " г")) getSign("знак: рак " + "год: " + year(x));
			for (int i = 23; i <= 31; i++) {
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " июля " + Integer
						.toString(x) + " г")) getSign("знак: лев " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " декабря " + Integer
						.toString(x) + " г")) getSign("знак: козерог " + "год: " + year(x));
			}
			for (int i = 24; i <= 30; i++) if (name.dateOfHumBirth.contains(Integer.toString(i) + " сентября " + Integer
					.toString(x) + " г")) getSign("знак: весы " + "год: " + year(x));
			for (int i = 24; i <= 31; i++) if (name.dateOfHumBirth.contains(Integer.toString(i) + " октября " + Integer
					.toString(x) + " г")) getSign("знак: скорпион " + "год: " + year(x));
			for (int i = 23; i <= 30; i++) if (name.dateOfHumBirth.contains(Integer.toString(i) + " ноября " + Integer
					.toString(x) + " г")) getSign("знак: стрелец " + "год: " + year(x));
			for (int i = 20; i <= 29; i++) if (name.dateOfHumBirth.contains(Integer.toString(i) + " февраля " + Integer
					.toString(x) + " г")) getSign("знак: рыбы " + "год: " + year(x));
			for (int i = 1; i <= 20; i++) {
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " апреля " + Integer
						.toString(x) + " г")) getSign("знак: овен " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " января " + Integer
						.toString(x) + " г")) getSign("знак: козерог " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " марта " + Integer
						.toString(x) + " г")) getSign("знак: рыбы " + "год: " + year(x));
			}
			for (int i = 1; i <= 21; i++) {
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " мая " + Integer
						.toString(x) + " г")) getSign("знак: телец " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " июня " + Integer
						.toString(x) + " г")) getSign("знак: близнецы " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " августа " + Integer
						.toString(x) + " г")) getSign("знак: лев " + "год: " + year(x));
			}
			for (int i = 1; i <= 22; i++) {
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " июля " + Integer
						.toString(x) + " г")) getSign("знак: рак " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " ноября " + Integer
						.toString(x) + " г")) getSign("знак: скорпион " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " декабря " + Integer
						.toString(x) + " г")) getSign("знак: стрелец " + "год: " + year(x));
			}
			for (int i = 1; i <= 23; i++) {
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " сентября " + Integer
						.toString(x) + " г")) getSign("знак: дева " + "год: " + year(x));
				if (name.dateOfHumBirth.contains(Integer.toString(i) + " октября " + Integer
						.toString(x) + " г")) getSign("знак: весы " + "год: " + year(x));
			}
			for (int i = 1; i <= 19; i++) if (name.dateOfHumBirth.contains(Integer.toString(i) + " февраля " + Integer
					.toString(x) + " г")) getSign("знак: водолей " + "год: " + year(x));
		}
		NumbOfSixDig numbOfSixDig = new NumbOfSixDig();
		numbOfSixDig.setNumb();
		int sumOfFirstPart = 0, sumOfSecPart = 0;//суммы левой и правой частей числа
		if (String.valueOf(numbOfSixDig.number).length() == 6) {
			int[] firstPart = new int[3], secPart = new int[3];
			char[] firstArrOfChar = new char[3], secArrOfChar = new char[3];
			for (int i = 0; i < String.valueOf(numbOfSixDig.number).length() / 2; i++) {
				firstArrOfChar[i] = String.valueOf(numbOfSixDig.number).toCharArray()[i];
				firstPart[i] = Integer.valueOf(String.valueOf(firstArrOfChar[i]));
				sumOfFirstPart += firstPart[i];
			}
			int iterator = 0;//номер итерации в цикле
			for (int i = String.valueOf(numbOfSixDig.number).length() / 2; i < String
					.valueOf(numbOfSixDig.number).length(); i++) {
				secArrOfChar[iterator] = String.valueOf(numbOfSixDig.number).toCharArray()[i];
				secPart[iterator] = Integer.valueOf(String.valueOf(secArrOfChar[iterator]));
				sumOfSecPart += secPart[iterator];
				iterator++;
			}
			if (sumOfFirstPart == sumOfSecPart) System.out.println("да");
			else System.out.println("нет");
		}
		for (int i = 0; i < 10000000; i++) {
			String number = String.valueOf(i);
			char[] quantities = number.toCharArray();
			int sum = 0;//сумма цифр числа, возведённых в степень, равную количеству цифр в числе
			for (int x = 0; x < quantities.length; x++) sum += Math.pow(Integer.valueOf(String
					.valueOf(quantities[x])), quantities.length);
			if (sum == i) System.out.print(i + " ");
		}
		System.out.println();
		ChristmTree christmTree = new ChristmTree();
		christmTree.draw();
		int indent = christmTree.tierAm * christmTree.height, amount = 1, margin = indent;//количество ярусов и символов и высота
		for (int i = 0; i < christmTree.tierAm; i++) {
			indent = margin;
			amount = 1;//сброс ширины ёлки
			for (int y = 0; y < christmTree.height; y++) {
				for (int x = 0; x < indent; x++) System.out.print(" ");
				for (int x = 0; x < amount; x++) System.out.print("*");
				System.out.println();
				indent--;
				amount += 2;
			}
			christmTree.height++;
		}
		RandNumb randNumb = new RandNumb();
		randNumb.createArr();
		double arrSum = 0;//сумма элементов массива
		for (int i = 0; i < randNumb.randQuant.length; i++) {
			System.out.print(randNumb.randQuant[i] + " ");
			arrSum += randNumb.randQuant[i];
		}
		System.out.println();
		System.out.println(arrSum);
		double avVal = arrSum / randNumb.randQuant.length;
		for (int i = 0; i < randNumb.randQuant.length; i++) if (randNumb.randQuant[i] < avVal) randNumb
		.numbWhichAreLessThanAvVal.add(randNumb.randQuant[i]);
		for (int i = 0; i < randNumb.numbWhichAreLessThanAvVal.toArray().length; i++) System
		.out.print(randNumb.numbWhichAreLessThanAvVal.toArray()[i] + " ");
		System.out.println();
		System.out.println(avVal);
		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < randNumb.randQuant.length; i++) if (randNumb.randQuant[i] < randNumb
					.randQuant[i - 1]) {
				swap(randNumb.randQuant, i, i - 1);
				needIteration = true;
			}
		}
		for (int i = 0; i < randNumb.randQuant.length; i++) System.out
		.print(randNumb.randQuant[i] + " ");
		System.out.println();
		IntArrOfTwoDim intArrOfTwoDim = new IntArrOfTwoDim();
		Scanner scanner = new Scanner(System.in);
		intArrOfTwoDim.complArr();
		int[][] dimensions = new int[intArrOfTwoDim.lineAm][intArrOfTwoDim.colAm];
		inArr(intArrOfTwoDim, dimensions);
		System.out.println("номер строки для удаления");
		int lineNumb = scanner.nextInt() - 1;
		if (lineNumb + 1 <= 0) {
			System.out.println("номер строки должен быть больше 0");
			return;
		}
		if (lineNumb >= intArrOfTwoDim.lineAm) {
			System.out.println("номер строки должен быть меньшим или равным количеству строк");
			return;
		}
		for (int i = 0; i < intArrOfTwoDim.colAm; i++) remLine(dimensions, lineNumb);
		for (int i = lineNumb; i < intArrOfTwoDim.lineAm - 1; i++) dimensions[i] = dimensions[i + 1];
		for (int i = 0; i < intArrOfTwoDim.lineAm - 1; i++) {
			for (int x = 0; x < intArrOfTwoDim.colAm; x++) System.out.print(dimensions[i][x] + " ");
			System.out.println();
		}
	}
	static void getSign(String sign) {
		if (isWritt) return;
		System.out.println(sign);
		isWritt = true;
	}
	static String year(int annum) {
		String nameOfYearAccToJapCal = new String();
		for (int i = 0; i < signs.length; i++) if (annum % signs.length == i) nameOfYearAccToJapCal = signs[i];
		return nameOfYearAccToJapCal;
	}
	static void swap(int[] array, int ind1, int ind2) {
		int tmp = array[ind1];
		array[ind1] = array[ind2];
		array[ind2] = tmp;
	}
	static void inArr(IntArrOfTwoDim arrOfTwoDim, int[][] massif) {
		Random random = new Random();
		for (int i = 0; i < arrOfTwoDim.lineAm; i++) {
			for (int x = 0; x < arrOfTwoDim.colAm; x++) {
				massif[i][x] = random.nextInt(10);
				System.out.print(massif[i][x] + " ");
			}
			System.out.println();
		}
	}
	static void remLine(int[][] massif, int lineQuant) { massif[lineQuant] = null; }
}