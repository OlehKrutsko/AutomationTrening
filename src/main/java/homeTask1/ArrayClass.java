package homeTask1;

public class ArrayClass {
	int a, b, c;

	public int sumArray(int a, int b, int c) {
		int myArray[] = { a, b, c };
		int total = 0;
		for (int i = 0; i < myArray.length; i++) {
			total += myArray[i];
		}

		return total;
	}

	public int averArray(int a, int b, int c, int count) {
		int myArray[] = { a, b, c };
		int total = 0;
		for (int i = 0; i < myArray.length; i++) {
			total += myArray[i];
		}

		return total / count;
	}

	public int incrArray(int a, int b, int c) {
		int myArray[] = { a, b, c };
		int total = 0;
		for (int i = 0; i < myArray.length; i++) {
			total += myArray[i] * 2;
		}

		return total;
	}

	public static void main(String[] args) {

		ArrayClass ar = new ArrayClass();
		System.out.println(ar.sumArray(5, 6, 9));
		System.out.println(ar.averArray(5, 6, 10, 3));
		System.out.println(ar.incrArray(5, 6, 9));

	}
}