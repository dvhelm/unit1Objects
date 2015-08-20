import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(135);
        turtle.forward(72);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.penDown();
        turtle.forward(100);
        turtle.turn(120);
        turtle.forward(100);
        turtle.turn(90);
        turtle.forward(100);
        

    }
}
