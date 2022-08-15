import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class naranja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class naranja extends Actor
{
    
    public void act()
    {//Funcion para que el objeto caiga desde el cielo
        World w =getWorld();
        setLocation(getX(), getY()+1);
       if(isAtEdge()){
           setLocation((Greenfoot.getRandomNumber(600)),5);
        }
    }
}
