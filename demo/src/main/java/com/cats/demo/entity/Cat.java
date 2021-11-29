package com.cats.demo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Accessors(chain = true)
public class Cat {

    @Id
    private String id;

    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;
}
