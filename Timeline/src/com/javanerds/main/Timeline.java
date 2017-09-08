package com.javanerds.main;

import com.javanerds.scenes.Scene;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Timeline implements Runnable{
    private Thread thread;
    private boolean running = false;
    private Window window;

    private int width;
    private int height;
    private String title;

    private BufferStrategy bs;
    private Graphics g;

    public Timeline(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
    }

    private void init(){
        window = new Window(title, width, height);
    }

    public void tick(){
        if (Scene.getScene() != null) {
            Scene.getScene().tick();
        }
    }

    public void render(){
        //Sets buffer strategy
        bs = window.getCanvas().getBufferStrategy();

        //Creates buffer strategy if bs is null
        if (bs == null) {
            window.getCanvas().createBufferStrategy(3);
            return;
        }

        //Gets instance of graphics object
        g = bs.getDrawGraphics();

        //Clears the screen
        g.clearRect(0, 0, width, height);

        //Renders current state
        if (Scene.getScene() != null) {
            Scene.getScene().render(g);
        }

        //Shows buffer strategy
        bs.show();

        //Disposes graphics
        g.dispose();
    }

    public void run(){
        //Inits the game
        init();

        //Vars to set fps
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        //Writes to logger
        //Logger.getInstance().write("Run started");

        //Game loop
        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                tick();
                render();
                ticks++;
                delta--;
            }

            if (timer >= 1000000000) {
                System.out.println(ticks);
                //Logger.getInstance().write("" + ticks);
                ticks = 0;
                timer = 0;
            }

        }

        stop();
    }

    //Function that starts the game
    public synchronized void start() {
        //Logger.getInstance().write("Game Started");
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    //Function that stops game
    public synchronized void stop() {
        //Logger.getInstance().write("Game Stopped");
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
