package com.SnakeGame_Rest.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="snake")
public class Snake {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String direction;

    @JoinColumn(name="bodyPart_id")
    @OneToMany(cascade = CascadeType.ALL)
    private  List<BodyPart> bodyParts;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public List<BodyPart> getBodyParts() {
        return bodyParts;
    }

    public void setBodyParts(List<BodyPart> bodyParts) {
        this.bodyParts = bodyParts;
    }



    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
