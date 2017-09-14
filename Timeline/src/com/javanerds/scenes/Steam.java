package com.javanerds.scenes;

import com.javanerds.main.Assets;

import java.awt.*;

public class Steam extends Scene{

    public Steam() {

    }

    @Override
    public void tick() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font("Comic Sans MS", 1, 20));
        g.drawString("11", 0, 20);
        g.drawImage(Assets.steamlogo, 75, 100, null);
        g.setFont(new Font("Comic Sans MS", 1, 40));
        g.drawString("Steam (late 2000s-present)", 350, 50);
        g.setFont(new Font("Comic Sans MS", 1, 30));
        g.drawString("originally created in 2003", 350, 150);
        g.drawString("modern face of gaming; easy-to-access games on the PC", 350, 200);
        g.drawString("since most PCs are often far ahead of consoles graphics-wise", 350, 250);
        g.drawString("and because of modifications (“modding”), PC has", 400, 300);
        g.drawString("stayed far ahead in terms of capability", 400, 350);

    }
}
