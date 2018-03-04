package courseworkproj;

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.PLAIN;

public class DrawStack extends Stack implements Drawable {
    Font font = new Font("Monospaced", PLAIN, 16);  //  A new monospaced font of an appropriate size.
    @Override
    public void draw(Graphics g, JPanel c) {    //  Overide of the draw method obtained from Drawable.
        int i = 50; //  Default x and y coordinates, width and height values, and a tracker for what node is currently being drawn.
        int j = 50;
        int k = 400;
        int l = 30;
        int n = 0;
        c.setBackground(Color.GRAY);    //  Sets the canvas (or any JPanel) the structure is being drawn to to gray. This will persist across any other intended changes to the application.
        if(head != null) {  //  Draws the head node in the first column with custom text and inverted colours to other nodes, then goes to the next node to get ready for all to be drawn.
            Node m = head;
            g.setFont(font);
            g.setColor(Color.BLACK);
            g.fillRect(i, j, k, l);
            g.setColor(Color.WHITE);
            g.drawRect(i, j, k, l);
            g.drawString("Head node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i+20, j+(l/2));
            j += 35;
            m = m.next;
            int x = 1;
            while(m != null && x <= 16) {   // Draws the next 16 nodes to the first column.
                g.setColor(Color.WHITE);
                g.fillRect(i, j, k, l);
                g.setColor(Color.BLACK);
                g.drawRect(i, j, k, l);
                g.drawString("Node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i + 20, j + (l / 2));
                j += 35;
                m = m.next;
                x++;
            }
            j = 50;
            while(m != null && x > 15 && x <= 33) { // Draws the next 17 nodes to the second column.
                g.setColor(Color.WHITE);
                g.fillRect(i + 450, j, k, l);
                g.setColor(Color.BLACK);
                g.drawRect(i + 450, j, k, l);
                g.drawString("Node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i + 470, j + (l / 2));
                j += 35;
                m = m.next;
                x++;
            }
            j = 50;
            while(m != null && x > 33 && x <= 50) { //  Draws the next 17 nodes to the third column. Any values pushed to nodes higher than this will not be drawn until a sufficient amount
                g.setColor(Color.WHITE);            //  of values have been popped.
                g.fillRect(i + 900, j, k, l);
                g.setColor(Color.BLACK);
                g.drawRect(i + 900, j, k, l);
                g.drawString("Node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i + 920, j + (l / 2));
                j += 35;
                m = m.next;
                x++;
            }
        }
    }
}
