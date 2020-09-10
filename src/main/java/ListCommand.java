/**
 * Represents a command to list current items in tasks list.
 */
public class ListCommand extends Command {
    /**
     * Executes command to print out all tasks in the tasks list, or notify an empty task list.
     *
     * @param tasks Task list of all tasks.
     * @param ui Ui to deal with interaction with user.
     * @param storage Storage to load and save tasks.
     */
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        assert tasks != null : "Tasklist not found.";
        assert ui != null : "Ui not found.";
        assert storage != null : "Storage not found.";

        if (tasks.getNumTasks() == 0) {
            return ui.showEmptyTaskList();
        }

        String tasksList = "";
        for (int i = 0; i < tasks.getNumTasks(); i++) {
            tasksList = tasksList + "\n " + (i + 1) + ". " + tasks.getTask(i + 1);
        }
        assert ui.showTaskList(tasksList) != null : "Message showing tasklist should be shown.";
        return ui.showTaskList(tasksList);
    }

    public boolean isExit() {
        return false;
    }
}
