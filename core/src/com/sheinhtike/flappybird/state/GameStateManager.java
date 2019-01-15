package com.sheinhtike.flappybird.state;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {

    private Stack<State> states;

    public GameStateManager() {
        states = new Stack<State>();
    }

    public State push(State item) {
        return states.push(item);
    }

    public State pop() {
        return states.pop();
    }

    public State peek() {
        return states.peek();
    }

    public boolean empty() {
        return states.empty();
    }

    public void set(State item) {
        states.pop();
        states.push(item);
    }

    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
