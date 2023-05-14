package com.ogutdeniz.behavioralpatterns.chainofresponsibility.helpdeskexample;

public class Ticket {
    private String category;
    private String description;

    // Constructor, getters, and setters

    public Ticket(String category, String description) {
        this.category = category;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
