import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

    private final int IMAGE_SIZE = 50;
    private final int COLS = 15;
    private final int ROWS = 1;
    private JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper();
    }

    private JavaSweeper() {
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
                g.drawImage(getImage("bomb"),0,0,this);
                g.drawImage(getImage("num1"),IMAGE_SIZE,0,this);
            }
        };
        panel.setPreferredSize(new Dimension(COLS * IMAGE_SIZE, ROWS * IMAGE_SIZE));//задаем размеры панели
        add(panel);//добавляем панель
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//выход из программы при закрытии
        setTitle("MineSweeper");//устанавливаем заголовок окна
        setVisible(true);//делаем окно видимым
        setResizable(false);//объявляем окно неизменяемым по размеру
        pack();//изменяет размер формы
        setLocationRelativeTo(null);//устанавливает форму по центру
    }

    private Image getImage(String name){
         ImageIcon icon = new ImageIcon("res/img/"+ name+".png");
         return icon.getImage();
    }
}
