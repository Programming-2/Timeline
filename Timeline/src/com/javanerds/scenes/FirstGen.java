package com.javanerds.scenes;

import com.javanerds.main.Assets;

import java.awt.*;

public class FirstGen extends Scene{

    public FirstGen(){

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("2", 0, 20);
        g.drawImage(Assets.odyessy, 0, 0, null);
    }
}
