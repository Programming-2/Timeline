package com.javanerds.scenes;

import com.javanerds.main.Assets;

import java.awt.Graphics;

public class FirstGen extends Scene{

    public FirstGen(){

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.odyessy, 0, 0, null);
    }
}
