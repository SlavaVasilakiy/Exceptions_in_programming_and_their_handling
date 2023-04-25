/**
 * @Task2
 * Если необходимо, исправьте данный код
 * try {
 *    int d = 0;
 *    double catchedRes1 = intArray[8] / d;
 *    System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *    System.out.println("Catching exception: " + e);
 * }
 */

public class Task2 {

	public static void main(String[] args) {
		task2();
	}

	public static void task2() {
		try {
			int d = 0;
			int[] array = new int[8];
			double caughtRes1 = array[7] / d;
			System.out.println("caughtRes1 = " + caughtRes1);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Catching exception: " + e);
		}
	}
}
