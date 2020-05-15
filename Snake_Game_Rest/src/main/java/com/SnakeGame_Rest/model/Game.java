package com.SnakeGame_Rest.model;


import javax.persistence.*;

@Entity
@Table(name="game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @JoinColumn(name="snake_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Snake snake;

    @JoinColumn(name="food_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Food food;

    @JoinColumn(name="boundary_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Boundary boundary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Boundary getBoundary() {
        return boundary;
    }

    public void setBoundary(Boundary boundary) {
        this.boundary = boundary;
    }
}
