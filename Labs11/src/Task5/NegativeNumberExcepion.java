package Task5;

public class NegativeNumberExcepion extends Exception {
    //A)
    private String methodName;

    public NegativeNumberExcepion(String methodName) {
        this.methodName = methodName;
    }

    public String getMessage() {
        return ("Negative value has been passed to " + methodName + " method!");
    }
}