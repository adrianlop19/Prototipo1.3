import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class papas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class papas extends Actor
{
    /**
     * Act - do whatever the papas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {//Funcion para que el objeto caiga desde el cielo
        World w =getWorld();
        setLocation(getX(), getY()+1);
       if(isAtEdge()){
           w.removeObject(this);
        }
    }
}
