class InvalidDateFormatException extends InvalidInputException {
    public InvalidDateFormatException() {
        super("Неверный формат даты рождения. Формат должен быть dd.mm.yyyy.");
    }
}