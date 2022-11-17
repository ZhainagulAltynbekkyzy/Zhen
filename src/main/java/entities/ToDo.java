package entities;

import java.time.LocalDate;

public class ToDo {
    private String task_name;
    private LocalDate deadline;
    private Boolean isDone;

    public ToDo(String task_name, LocalDate deadline, Boolean isDone) {
        this.task_name = task_name;
        this.deadline = deadline;
        this.isDone = isDone;
    }

    public ToDo() {
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}
