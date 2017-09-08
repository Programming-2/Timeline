package com.javanerds.scenes;

import java.awt.Graphics;

public abstract class Scene {

    private static Scene currentScene = null;

    public Scene(){}

    public static Scene getScene() {
        return currentScene;
    }

    public static void setScene(Scene scene) {
        currentScene = scene;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
}
