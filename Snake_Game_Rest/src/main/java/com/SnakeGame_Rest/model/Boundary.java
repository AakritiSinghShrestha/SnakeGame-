package com.SnakeGame_Rest.model;


import javax.persistence.*;

@Entity
@Table(name="boundary")
public class Boundary {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
