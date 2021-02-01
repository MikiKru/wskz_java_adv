package lect07_annotations;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Task {
    private String title;
    private LocalDateTime registrationTime = LocalDateTime.now();

    @DefaultValueAnnotation(title = "My First TASK")
    public void setTitle() throws NoSuchMethodException {
        DefaultValueAnnotation defaultValueAnnotation = this.getClass()
                .getMethod("setTitle")
                .getAnnotation(DefaultValueAnnotation.class);
        this.title = defaultValueAnnotation.title();
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Task task = new Task();
        task.setTitle();
        System.out.println(task);
    }

}
