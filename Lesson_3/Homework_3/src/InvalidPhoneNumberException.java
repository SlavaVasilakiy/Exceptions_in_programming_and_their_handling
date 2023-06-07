class InvalidPhoneNumberException extends InvalidInputException {
    public InvalidPhoneNumberException() {
        super("Неверный формат номера телефона. Номер должен быть целым беззнаковым числом без форматирования.");
    }
}