import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.forward();
        turtle.turn(90);
        turtle.setShellColor(Color.cyan);
        turtle.setColor(Color.gray);
        turtle.forward();
        turtle.turn(90);
        turtle.forward();
        turtle.turn(90);
        turtle.forward();
        turtle.turn(305);
        turtle.forward(15);
        turtle.turn(180);
        turtle.forward(15);
        turtle.turn(225);;
    }
}
        