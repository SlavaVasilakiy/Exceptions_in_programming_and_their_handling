import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class UserInput {
    private TempData tempData;

    private void validateInput(String[] input) throws InvalidInputException {
        if (input.length != 6) {
            throw new InvalidInputException("Неверное количество данных: Требуется 6 значений. Вы ввели " + input.length);
        }

        // Проверка формата даты рождения
        String dateOfBirth = input[3];
        if (!dateOfBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InvalidDateFormatException();
        }

        // Проверка формата номера телефона
        String phoneNumber = input[4];
        if (!phoneNumber.matches("\\d+")) {
            throw new InvalidPhoneNumberException();
        }
    }

    public void getUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n%s", "Введите данные: Фамилия Имя Отчество Дата_рождения Номер_телефона Пол",
                            "Всё через пробел, форматы данных:",
                            "ФИО: строки, Дата рождения: dd.mm.yyyy, Телефон: цифры, Пол: m или f",
                            "-> ");

        String[] data = scanner.nextLine().trim().replaceAll("\\s+"," ").split(" ");

        try {
            validateInput(data);

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String dateOfBirth = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);

            if (gender != 'm' && gender != 'f') {
                throw new InvalidInputException("Неверное значение пола. Ожидается m или f.");
            }

            tempData = new TempData(lastName, firstName, middleName, dateOfBirth, phoneNumber, gender);
        } catch (InvalidInputException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
            getUserData(); // Повторный запрос данных у пользователя в случае ошибки
        }
    }

    public void writeToFile() {
        try (FileWriter writer = new FileWriter(tempData.getLastName() + ".txt", true)) {
            writer.write(tempData.toString() + "\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}