package com.job.Entity;

public class Catgory {
    private String id;
    private String catgoryName;
    private String description;

    public Catgory(String id, String catgoryName, String description) {
        this.id = id;
        this.catgoryName = catgoryName;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatgoryName() {
        return catgoryName;
    }

    public void setCatgoryName(String catgoryName) {
        this.catgoryName = catgoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
