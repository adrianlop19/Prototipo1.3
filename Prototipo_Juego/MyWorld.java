import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase del fondo.
 * 
 * @author (Adrián López 21357) 
 * @version (1.3)
 */
public class MyWorld extends World
{
    public static int scoreB=0;
    public static int scoreM=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        showText("Aciertos:" +scoreB,50,25);
        showText("Fallos" +scoreM,50,50);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        scoreB=0;
        cañon cañon = new cañon();
        addObject(cañon,293,396);
        Calabaza calabaza = new Calabaza();
        addObject(calabaza,24,14);
        Cupcake cupcake = new Cupcake();
        addObject(cupcake,82,58);
        Hamburguesa hamburguesa = new Hamburguesa();
        addObject(hamburguesa,146,23);
        Manzana manzana = new Manzana();
        addObject(manzana,208,41);
        naranja naranja = new naranja();
        addObject(naranja,272,18);
        papas papas = new papas();
        addObject(papas,337,37);
        Calabaza calabaza2 = new Calabaza();
        addObject(calabaza2,396,31);
        Hamburguesa hamburguesa2 = new Hamburguesa();
        addObject(hamburguesa2,458,27);
        naranja naranja2 = new naranja();
        addObject(naranja2,516,19);
        papas papas2 = new papas();
        addObject(papas2,576,54);
        papas papas3 = new papas();
        addObject(papas3,458,103);
        Manzana manzana2 = new Manzana();
        addObject(manzana2,272,80);
        Manzana manzana3 = new Manzana();
        addObject(manzana3,619,15);
        Calabaza calabaza3 = new Calabaza();
        addObject(calabaza3,621,120);
        Cupcake cupcake2 = new Cupcake();
        addObject(cupcake2,677,21);
        papas papas4 = new papas();
        addObject(papas4,684,195);
        Cupcake cupcake3 = new Cupcake();
        addObject(cupcake3,145,139);
        Calabaza calabaza4 = new Calabaza();
        addObject(calabaza4,239,141);
        papas papas5 = new papas();
        addObject(papas5,366,138);
        Hamburguesa hamburguesa3 = new Hamburguesa();
        addObject(hamburguesa3,29,155);
    }
}
