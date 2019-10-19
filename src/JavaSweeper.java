import javax.swing.*;
import java.awt.*;

import sweeper.Box;
import sweeper.Coord;
import sweeper.Ranges;

public class JavaSweeper extends JFrame {

    private final int IMAGE_SIZE = 50;
    private final int COLS = 15;
    private final int ROWS = 1;
    private JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper();
    }

    private JavaSweeper() {
        Ranges.setSize(new Coord(COLS,ROWS));
        setImages();
        initPanel();
        initFrame();
    }

//https://youtu.be/YhHLlRqqKNI?list=PLt5E226f3KMEv6huOjYdpVKZIz1PSlvEA&t=94

    private void initPanel() {
        panel = new JPanel()//инициализируем панель
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Box box : Box.values()) {
                    Coord coord = new Coord(box.ordinal() * IMAGE_SIZE, 0);
                    g.drawImage((Image) box.image, coord.x, coord.y, this);
                }
            }
        };
        panel.setPreferredSize(new Dimension(Ranges.getSize().x * IMAGE_SIZE,
                                            Ranges.getSize().y * IMAGE_SIZE));//задаем размеры панели
        add(panel);//добавляем панель
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//выход из программы при закрытии
        setTitle("MineSweeper");//устанавливаем заголовок окна
        setVisible(true);//делаем окно видимым
        setResizable(false);//объявляем окно неизменяемым по размеру
        pack();//изменяет размер формы
        setLocationRelativeTo(null);//устанавливает форму по центру
        setIconImage(getImage("icon"));
    }

    private void setImages() {
        for (Box box : Box.values()) {
            box.image = getImage(box.name().toLowerCase());
        }
    }

    private Image getImage(String name) {
        String fileName = "img/" + name + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(fileName));// инициализируем и задаем картинку
        return icon.getImage();//возвращяем картинку
    }
}
