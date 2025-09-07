import javax.swing.*;
import java.awt.*;

public class ShapesExample extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Настройка качества rendering
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                            RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Рисуем фигуры
        g2d.setColor(Color.GREEN);
        g2d.fillPolygon(new int[]{400, 400, 300}, new int[]{500, 150, 150}, 3); // Треугольник
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(new ShapesExample());
        frame.setVisible(true);
    }
}