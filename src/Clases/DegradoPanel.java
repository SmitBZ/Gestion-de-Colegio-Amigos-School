
package Clases;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.JPanel;

/**
 *
 * @author Smit
 */
public class DegradoPanel extends JPanel{
    private final Color star;
    private final Color fin;

    public DegradoPanel(Color star, Color fin) {
        this.star = star;
        this.fin = fin;
    }
    
    @Override
        public void paintComponent(Graphics g) {
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint painter = new GradientPaint(0, 0, star,
                0, height, fin);
        Paint oldPainter = g2.getPaint();
        g2.setPaint(painter);
        g2.fill(g2.getClip());
        painter = new GradientPaint(0, 0, fin,
                0, height / 2, star);
        g2.setPaint(painter);
        g2.fill(g2.getClip());

        painter = new GradientPaint(0, height / 2, star,
                0, height, fin);
        g2.setPaint(painter);
        g2.fill(g2.getClip());

        g2.setPaint(oldPainter);
    }
}
