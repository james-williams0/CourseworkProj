package courseworkproj;

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.PLAIN;

public class DrawQueue extends Queue implements Drawable {
    Font font = new Font("Monospaced", PLAIN, 16);  //  A new monospaced font of an appropriate size.
    @Override
    public void draw(Graphics g, JPanel c) {
        int i = 50; //  Default x and y coordinates, width and height values, and a tracker for what node is currently being drawn.
        int j = 50;
        int k = 400;
        int l = 30;
        int n = 0;
        if(front != null) {
            int x = 1;
            Node m = front;
            if(front == back) {     //  If the front and back nodes are the same (i.e. there is only one node in the queue) node in the first column with custom text and inverted
                g.setFont(font);    //  colours to other nodes, then goes to the next node to get ready for all to be drawn.
                g.setColor(Color.WHITE);
                g.fillRect(i, j, k, l);
                g.setColor(Color.BLACK);
                g.drawRect(i, j, k, l);
                g.drawString("Front/back node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i + 20, j + (l / 2));
            } else {    //  If the front and back are not the same (i.e. there is more than one node) different text will be used to indicate it is just the front node.
                g.setFont(font);
                g.setColor(Color.WHITE);
                g.fillRect(i, j, k, l);
                g.setColor(Color.BLACK);
                g.drawRect(i, j, k, l);
                g.drawString("Front node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i + 20, j+(l/2));
                j += 35;
                m = m.next;
                while(m.next != null && x <= 16) {  //  Following loops operate essentially exactly the same as in the stack.
                    g.setColor(Color.BLACK);
                    g.fillRect(i, j, k, l);
                    g.setColor(Color.WHITE);
                    g.drawRect(i, j, k, l);
                    g.drawString("Node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i + 20, j+(l/2));
                    j += 35;
                    m = m.next;
                    x++;
                }
                j = 50;
                i += 450;
                while(m.next != null && x > 16 && x <= 33) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i, j, k, l);
                    g.setColor(Color.WHITE);
                    g.drawRect(i , j, k, l);
                    g.drawString("Node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i + 20, j+(l/2));
                    j += 35;
                    m = m.next;
                    x++;
                }
                j = 50;
                i += 450;
                while(m.next != null && x > 33 && x <= 49) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i, j, k, l);
                    g.setColor(Color.WHITE);
                    g.drawRect(i, j, k, l);
                    g.drawString("Node(" + Integer.toString(n++) + "): " + Integer.toString(m.getVal()), i + 20, j+(l/2));
                    j += 35;
                    m = m.next;
                    x++;
                }
                g.setColor(Color.WHITE);    //  For the back node, it will ALWAYS stay drawn in the same position at the bottom-right of all drawn nodes, for example, if 60 values are
                g.fillRect(i, 610, k, l);   //  enqueued, the second to last node drawn will read "Node (49): valueOfNode49" but this node will read "Node (59): valueOfBack".
                g.setColor(Color.BLACK);
                g.drawRect(i, 610, k, l);
                g.drawString("Back node(" + Integer.toString(size()-1) + "): " + Integer.toString(back.getVal()), i + 20, 610+(l/2));
            }
        }
    }
}
