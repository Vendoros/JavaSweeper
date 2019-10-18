import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

    private JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper();
    }

    public JavaSweeper() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 300));
        add(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MineSweeper");
        setVisible(true);
        setResizable(false);
        pack();//изменяет размер формы
        setLocationRelativeTo(null);//устанавливает форму по центру
    }

}
