package com.SnakeGame_Rest.model;

import javax.persistence.*;

@Entity
@Table(name="bodyParts")
public class BodyPart {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    private int xCoor;

    private int yCoor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public int getxCoor() {
        return xCoor;
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }

    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }
}
