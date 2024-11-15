package thread.control;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedException extends Exception {
        @Override
        public String toString() {
            //throw new Exception();
        }
    }
}
