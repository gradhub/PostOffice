package ru.myapp.PostOffice;
public class IllegalPackageException extends RuntimeException {
    public IllegalPackageException(String message){
        super(message);
    }
}
