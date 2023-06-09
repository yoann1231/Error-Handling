package CatchingExceptionHierarchy;

class MyParentException extends Exception {
}

class MyChildException extends MyParentException {
}

class MySubclassException extends MyChildException {
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MySubclassException();
        } catch (MySubclassException s) {
            System.err.println("Caught MySubclassException");
        } catch (MyChildException c) {
            System.err.println("Caught MyChildException");
        } catch (MyParentException p) {
            System.err.println("Caught MyParentException");
        }
    }
}
