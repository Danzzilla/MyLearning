package edu.greenriver.sdev.cookingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Recipe {
    //an auto-increment primary key (aka surrogate key)
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;

    private String name;
    private List<String> ingredients;
    private double servings;
    private int cookTime;
    private boolean vegan;
}
