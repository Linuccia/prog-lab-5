package Manager;

/**
 * Класс исключение при неверном вводе значений полей
 */
public class WrongArgument extends Exception {
    public WrongArgument(String message) {
        super(message);
    }
}
