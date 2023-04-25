import java.util.Scanner;

/**
 * @Task4 Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую
 * строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
	public static void main(String[] args) {
		dataHandler();
	}

	// входные данные с проверкой на пустую строку
	static void inputData() throws CustomNullException {
		System.out.print("Введите что-то: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		if (s.isEmpty()) {
			throw new CustomNullException("Пустые строки вводить нельзя");
		} else {
			System.out.printf("Вы ввели %s", s);
		}
	}

	// обработка exception
	static void dataHandler() {
		try {
			inputData();
		} catch (CustomNullException e) {
			System.out.println(e.getMessage());
		}
	}

	// кастомный exception
	static class CustomNullException extends IllegalArgumentException {
		CustomNullException(String message) {
			super(message);
		}
	}
}
