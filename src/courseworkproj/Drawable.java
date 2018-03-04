package courseworkproj;

import java.awt.*;
import javax.swing.*;

interface Drawable {                    //  To be implemented by DrawableQueue and DrawableStack, this will be overidden to contain various graphic methods depending on their requirements.
    void draw(Graphics g, JPanel c);
}