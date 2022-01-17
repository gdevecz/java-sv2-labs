package exceptionclass.bank;

public class InvalidBankOperationException extends RuntimeException {

    public InvalidBankOperationException() {
        super();
    }

    public InvalidBankOperationException(String message) {
        super(message);
    }

    public InvalidBankOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
