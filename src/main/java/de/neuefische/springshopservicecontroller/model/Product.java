package de.neuefische.springshopservicecontroller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component

public class Product {
    String id; // Produkt-ID
    String name; // Name des Produktes zur entsprechenden Produkt-ID


}

