/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author suresh
 */
public class Entity {
    private  int x,y,size;
    public Entity(int size){
        this.size=size;
    }
    public int getY(){return y;}
    public int getX(){return x;}
    public void setX(int x){this.x=y;}
    public void setY(int y){this.y=y;}
    public void setPosition(int x,int y){
    this.x=x;
    this.y=y;
    }
    public void move(int dx, int dy){
    x +=dx;
    y +=dy;
    }
    public Rectangle getBound(){
    return new Rectangle(x,y,size,size);
    }
    public boolean isCollsion(Entity o){
    if(o==this)return false;
    return getBound().intersects(o.getBound());
    }
    public void render(Graphics2D g2d){
        g2d.fillRect(x + 1, y + 1, size - 2, size - 2);
    }
}
