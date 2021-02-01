package lect06_reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Task {
    public String title;
    private LocalDateTime registrationTime;
    private int days;
}
