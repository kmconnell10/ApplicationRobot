import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{
    public static void main(String[]args) throws Exception{
        Robot caloom = new Robot();
        caloom.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }
}