package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;

    public boolean matches(String search) {

        if (name.contains(search)) {
            return true;
        }
        return false;
    }
}