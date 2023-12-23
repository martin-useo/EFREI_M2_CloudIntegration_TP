package fr.efrei.tp.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "items")
@Entity
public class Item {

    private String Id;
    private String name;
    private int price;
}
