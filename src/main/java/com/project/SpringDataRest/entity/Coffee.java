package com.project.SpringDataRest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.Objects;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Coffee extends Auditable {

    @Id
    @UuidGenerator
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;

    @Version
    private Long version;

    @NotBlank
    private String name;

    private Integer price;

    @Enumerated(EnumType.STRING)
    private CoffeeType coffeeType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coffee coffee = (Coffee) o;
        return Objects.equals(id, coffee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}