package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Editorial editorial = new Editorial();

        editorial.createEditorial("Editorial");
    }

}