package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        String answer1 = "Я не знаю ответа.";
        String answer2 = "Я самый умный, и ответ не буду говорить, так как он очень простой.";
        String answer3 = "Иди ты со своими вопросами, я занят.";
        String answer = "";

        JOptionPane.showMessageDialog(null,
                "Ты не можешь писать тут сообщения, нажми просто ок!",
                "Нельзя писать",
                JOptionPane.WARNING_MESSAGE);

        String input1 = (String)JOptionPane.showInputDialog(null,
                "Это окно где ты можешь задать вопрос",
                "Можешь задать вопрос",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Напиши тут свой вопрос.");
        
        
        String[] acceptableValues = {"Вариант 1", "Вариант 2", "Вариант 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Выбери вариант ответа из нескольких, потом я отвечу тебе на твой вопрос.",
                "Я думаю над ответом",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                acceptableValues,
                acceptableValues[1]
                );
        if (input2 != null) { // Проверяем, что пользователь не нажал "Cancel"
            switch (input2) {
                case "Вариант 1":
                    answer = answer1;
                    break;
                case "Вариант 2":
                    answer = answer2;
                    break;
                case "Вариант 3":
                    answer = answer3;
                    break;
                default:
                    answer = "Неизвестный вариант";
            }
        } else {
            answer = "Вы отменили выбор";
        }

        JOptionPane.showMessageDialog(null,
                answer,
                "Ответ на твой вопрос - " + input1,
                JOptionPane.INFORMATION_MESSAGE);
                
    }
}
