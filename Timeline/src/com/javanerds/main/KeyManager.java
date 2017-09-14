package com.javanerds.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    public boolean up, down, left, right, space, e;
    private boolean[] keys;

    private static KeyManager instance = null;

    public static KeyManager getInstance() {
        if(instance == null){
            instance = new KeyManager();
        }
        return instance;
    }

    private KeyManager() {
        keys = new boolean[256];
    }

    public void tick() {
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        right = keys[KeyEvent.VK_D];
        left = keys[KeyEvent.VK_A];
        space = keys[KeyEvent.VK_SPACE];
        e = keys[KeyEvent.VK_E];
        System.out.println(up);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }


}