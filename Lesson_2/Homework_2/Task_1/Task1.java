import java.util.Scanner;

/**
 * @task1 Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
 * возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {
	public static void main(String[] args) {
		float inputFloat = task1();
		System.out.println("Вы ввели: " + inputFloat);
	}

	/**
	 * @return введённое значение типа float
	 */
	public static float task1() {
		Scanner scanner = new Scanner(System.in);
		float inputFloat = 0;
		boolean isValid = false;

		while (!isValid) {
			try {
				System.out.print("Введите дробное число: ");
				inputFloat = Float.parseFloat(scanner.nextLine());
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("Ошибка: введено неверное значение. Попробуйте еще раз.");
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		return inputFloat;
	}
}
