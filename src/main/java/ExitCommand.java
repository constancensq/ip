/**
 * Represents a command to terminate the Duke chatbot.
 */
public class ExitCommand extends Command {

    /**
     * Executes command to display the goodbye message.
     *
     * @param tasks Task list of all tasks.
     * @param ui Ui to deal with interaction with user.
     * @param storage Storage to load and save tasks.
     * @return Goodbye message.
     */
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        assert tasks != null : "Tasklist not found.";
        assert ui != null : "Ui not found.";
        assert storage != null : "Storage not found.";

        assert ui.showBye() != null : "Message showing bye should be shown.";
        return ui.showBye();
    }

    public boolean isExit() {
        return true;
    }
}
