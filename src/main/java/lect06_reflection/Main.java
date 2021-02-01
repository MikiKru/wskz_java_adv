package lect06_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class task = Class.forName("lect06_reflection.Task");
        // POLA
        // getFields() - rozpoznaje specyfikatory dostępu
        Arrays.stream(task.getFields()).forEach(System.out::println);
        Arrays.stream(task.getDeclaredFields()).forEach(System.out::println);
        // METODY
        Arrays.stream(task.getMethods()).forEach(System.out::println);
        // KONSTRUKTORY
        Arrays.stream(task.getConstructors()).forEach(System.out::println);
        // INSTANCJONOWANIE
        Task taskFromReflection = (Task) task.newInstance();
        // OPERACJE NA POLACH KLASY
        Field titleField = task.getDeclaredField("title");
        titleField.set(taskFromReflection, "Reflection learning");
        System.out.println(titleField.get(taskFromReflection));
        // OPERACJE NA METODACH
        Method setRegistrationTime = task.getMethod("setRegistrationTime", LocalDateTime.class);
        setRegistrationTime.invoke(taskFromReflection, LocalDateTime.now());
        Method toStringMethod = task.getMethod("toString");
        System.out.println(toStringMethod.invoke(taskFromReflection));
    }
}
