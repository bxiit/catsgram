package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = "id")
public class Post {
    Long id;
    long authorId;
    String description;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Instant postDate;
}
