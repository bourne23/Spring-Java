package com.foxborn.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
@Data
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "car_item_rel",       // join and change table name
    joinColumns = @JoinColumn(name="c_id"),     //  join by cart id
    inverseJoinColumns = @JoinColumn(name = "i_id"))  // join other side by item-id
    private List<Item> itemList;


}
