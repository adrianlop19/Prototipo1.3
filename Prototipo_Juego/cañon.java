import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cañon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cañon extends Actor
{
    /**
     * Act - do whatever the cañon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {//Funcion para que el caño se mueva de lado a lado
        if (Greenfoot.isKeyDown("right")){
        setLocation(getX()+5,getY());}
        if (Greenfoot.isKeyDown("left")){
        setLocation(getX()-5,getY());}
        shooter();
    }
    public void shooter(){//Funcion para disparar las balas de cañon con espacio
        World w= getWorld();
        if(Greenfoot.isKeyDown("Space"))
        {
            w.addObject(new balas(),getX(),getY());
        }
    }
}
