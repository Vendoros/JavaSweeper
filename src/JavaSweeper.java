import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

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
        panel = new JPanel();//инициализируем панель
        {
//            @Override
//            protected void paintComponent (Graphics g){
//
//        }
        };
        panel.setPreferredSize(new Dimension(500, 300));//задаем размеры панели
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
}
