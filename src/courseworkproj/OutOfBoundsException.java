package courseworkproj;

import java.lang.RuntimeException;

public class OutOfBoundsException extends RuntimeException {
    OutOfBoundsException(String message) {
        super(message);
    }
}