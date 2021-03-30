package com.carvajalossman.platzimarket.domain;

import javax.persistence.Column;
import java.math.BigDecimal;

public class Product {

    private int productId;
    private String name;
    private int categoryId;
    private BigDecimal price;
    private int stock;
    private boolean active;
    private Category category;


}
