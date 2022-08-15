import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balas extends Actor
{
    /**
     * Act - do whatever the balas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld count;
    public void act()
    {
        setLocation(getX(),getY()-10);
        
        {//Funcion para que el objeto caiga desde el cielo
        World w =getWorld();
       if(isAtEdge()){
           w.removeObject(this);
           
        }
        
        else 
        if(isTouching(Calabaza.class)){
            count.scoreB++;
            removeTouching(Calabaza.class);
        }   
              
        else 
        if(isTouching(Hamburguesa.class)){
            count.scoreM++;
            removeTouching(Hamburguesa.class);
        }
        else 
        if(isTouching(Manzana.class)){
            count.scoreB++;
            removeTouching(Manzana.class);
        }   
        else 
        if(isTouching(naranja.class)){
            count.scoreB++;
            removeTouching(naranja.class);
        }
        else 
        if(isTouching(papas.class)){
            count.scoreM++;
            removeTouching(papas.class);
        }    
        else 
        if(isTouching(Cupcake.class)){
            count.scoreM++;
            removeTouching(Cupcake.class);
        }
        else
        if(count.scoreB>=17){
            Greenfoot.stop();
        }
    }
    
}
}
