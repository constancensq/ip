/**
 * Represents an exception thrown when a done task is called to be marked done again.
 */
public class MarkedDoneException extends DukeException {
    MarkedDoneException() {
        super("You have already marked this task as done!");
    }
}