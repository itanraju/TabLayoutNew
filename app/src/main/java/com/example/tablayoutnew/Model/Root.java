package com.example.tablayoutnew.Model;

import java.util.List;

public class Root{
    public String status;
    public List<Category> category;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }
}
