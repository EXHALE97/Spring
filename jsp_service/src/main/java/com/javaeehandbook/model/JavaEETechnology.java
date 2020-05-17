package com.javaeehandbook.model;

public class JavaEETechnology {

    public JavaEETechnology() {
        versions = new UsedVersions();
    }

    private int id;

    private String name;

    private UsedVersions versions;

    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsedVersions getVersions() {
        return versions;
    }

    public void setVersions(UsedVersions versions) {
        this.versions = versions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
