import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PersonInfo_with_GI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Расширенная форма");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Панель с полями ввода
            JPanel inputPanel = new JPanel(new GridLayout(6, 2, 10, 10));
            inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JTextField nameField = new JTextField();
            JTextField ageField = new JTextField();
            JTextField heightField = new JTextField();
            JTextField numberIntField = new JTextField();
            JTextField numberDoubleField = new JTextField();
            JTextArea aboutArea = new JTextArea(3, 20);
            JScrollPane aboutScroll = new JScrollPane(aboutArea);

            inputPanel.add(new JLabel("Имя:"));
            inputPanel.add(nameField);
            inputPanel.add(new JLabel("Возраст:"));
            inputPanel.add(ageField);
            inputPanel.add(new JLabel("Рост (м):"));
            inputPanel.add(heightField);
            inputPanel.add(new JLabel("Целое число:"));
            inputPanel.add(numberIntField);
            inputPanel.add(new JLabel("Дробное число:"));
            inputPanel.add(numberDoubleField);
            inputPanel.add(new JLabel("О себе:"));
            inputPanel.add(aboutScroll);

            // Панель с кнопками
            JPanel buttonPanel = new JPanel();
            JButton submitButton = new JButton("Показать информацию");
            JButton clearButton = new JButton("Очистить");
            
            buttonPanel.add(submitButton);
            buttonPanel.add(clearButton);

            // Область для вывода результатов
            JTextArea resultArea = new JTextArea(8, 30);
            resultArea.setEditable(false);
            resultArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
            JScrollPane resultScroll = new JScrollPane(resultArea);

            // Обработчики событий
            submitButton.addActionListener(e -> {
                if (validateInput(nameField, ageField, heightField, 
                                 numberIntField, numberDoubleField)) {
                    
                    Person person = new Person(
                        nameField.getText(),
                        Integer.parseInt(ageField.getText()),
                        Double.parseDouble(heightField.getText()),
                        Integer.parseInt(numberIntField.getText()),
                        Double.parseDouble(numberDoubleField.getText()),
                        aboutArea.getText()
                    );
                    
                    resultArea.setText(person.getFormattedInfo());
                }
            });

            clearButton.addActionListener(e -> {
                nameField.setText("");
                ageField.setText("");
                heightField.setText("");
                numberIntField.setText("");
                numberDoubleField.setText("");
                aboutArea.setText("");
                resultArea.setText("");
            });

            // Добавляем все на форму
            frame.add(inputPanel, BorderLayout.NORTH);
            frame.add(buttonPanel, BorderLayout.CENTER);
            frame.add(resultScroll, BorderLayout.SOUTH);

            frame.pack();
            frame.setLocationRelativeTo(null); // Центрируем окно
            frame.setVisible(true);
        });
    }

    private static boolean validateInput(JTextField... fields) {
        for (JTextField field : fields) {
            if (field.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Все поля должны быть заполнены!", 
                    "Ошибка", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }
}

class Person {
    private String name;
    private int age;
    private double height;
    private int randomNumber;
    private double randomDouble;
    private String about;

    public Person(String name, int age, double height, 
                 int randomNumber, double randomDouble, String about) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.randomNumber = randomNumber;
        this.randomDouble = randomDouble;
        this.about = about;
    }

    public String getFormattedInfo() {
        return String.format(
            "╔══════════════════════════════════╗\n" +
            "║          ИНФОРМАЦИЯ О ВАС        ║\n" +
            "╠══════════════════════════════════╣\n" +
            "║ Имя: %-25s   ║\n" +
            "║ Возраст: %-22d  ║\n" +
            "║ Рост: %-24.2f   ║\n" +
            "║ Ваше число: %-20d ║\n" +
            "║ Ваше дробное число: %-12.2f ║\n" +
            "╠══════════════════════════════════╣\n" +
            "║ ШУТКИ:                           ║\n" +
            "║ Возраст + число = %-14d ║\n" +
            "║ Рост × число = %-16.2f  ║\n" +
            "╠══════════════════════════════════╣\n" +
            "║ О СЕБЕ:                          ║\n" +
            "║ %-32s ║\n" +
            "╚══════════════════════════════════╝",
            name, age, height, randomNumber, randomDouble,
            age + randomNumber, height * randomDouble,
            about.length() > 30 ? about.substring(0, 30) + "..." : about
        );
    }
}