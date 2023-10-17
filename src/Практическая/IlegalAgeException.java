package Практическая;

public class IlegalAgeException extends  RuntimeException{
    public IlegalAgeException(String message) {
        super(message);
    }
}
