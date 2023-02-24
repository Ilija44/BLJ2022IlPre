package Exceptions;

public class LeaseLengthCollisionException extends Exception {
    public LeaseLengthCollisionException(){
        super("A other person is leasing the car");
    }
}
