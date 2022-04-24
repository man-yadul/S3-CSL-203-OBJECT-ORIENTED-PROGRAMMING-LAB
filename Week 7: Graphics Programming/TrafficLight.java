import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LightDrawing extends JComponent {
    Color redcolor = Color.GRAY;
    Color yellowcolor = Color.GRAY;
    Color greencolor = Color.GRAY;

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(5, 0, 150, 250);
        g.setColor(redcolor);
        g.fillOval(55, 30, 50, 50);
        g.setColor(yellowcolor);
        g.fillOval(55, 100, 50, 50);
        g.setColor(greencolor);
        g.fillOval(55, 170, 50, 50);
    }

    void redrawLight(String str) {
        redcolor = Color.GRAY;
        yellowcolor = Color.GRAY;
        greencolor = Color.GRAY;
        if (str.equals("red"))
            redcolor = Color.RED;
        if (str.equals("yellow"))
            yellowcolor = Color.YELLOW;
        if (str.equals("green"))
            greencolor = Color.GREEN;
        repaint();
    }
}

class LightOptionsPanel extends JPanel implements ActionListener {
    LightDrawing light = new LightDrawing();
    JRadioButton redbutton, yellowbutton, greenbutton;

    LightOptionsPanel() {
        redbutton = new JRadioButton("Red");
        yellowbutton = new JRadioButton("Yellow");
        greenbutton = new JRadioButton("Green");
        ButtonGroup group = new ButtonGroup();

        group.add(redbutton);
        group.add(yellowbutton);
        group.add(greenbutton);
        add(redbutton);
        add(yellowbutton);
        add(greenbutton);
        redbutton.addActionListener(this);
        yellowbutton.addActionListener(this);
        greenbutton.addActionListener(this);
        light.setPreferredSize(new Dimension(160, 260));
        add(light);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redbutton)
            light.redrawLight("red");
        else if (e.getSource() == yellowbutton)
            light.redrawLight("yellow");
        else if (e.getSource() == greenbutton)
            light.redrawLight("green");
    }
}

public class TrafficLight {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        LightOptionsPanel panel = new LightOptionsPanel();
        frame.add(panel);
        frame.setSize(250, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
