package ru.yandex.practicum.catsgram.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor(staticName = "of")
@NoArgsConstructor(force = true)
class Person {
    @NonNull
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
}

public class Practicum {
    public static void main(String[] args) {
        String username = null;
        Person roman = Person.of("Roman", "Igorev", 38, "+78889991234");
        Person person = Person.of(username, "Igorev", 38, "+78889991234");
    }
}