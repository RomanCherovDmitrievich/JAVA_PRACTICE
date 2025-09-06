//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

// Упражнение 3

class Person
{
    private String name;
    private int age;
    private double height;
    private String text;
    private int random_int;
    private double random_double;
    

    public void set_info(String _name, int _age, double _height, int _numberInt, double _numberDouble, String _text)
    {
        name = _name;
        age = _age;
        height = _height;
        random_int = _numberInt;
        random_double = _numberDouble;
        text = _text;
    }

    public void print_info()
    {
        System.out.println("\n И так, вот что я о тебе знаю:");
        System.out.println("Ваше имя: " + name + "\n" + "Ваш возраст: " + age + "\n" +
        "Ваш рост: " + height + " м \n" + "Вы сказали мне: " + text + "\n");
        System.out.println("Представьте, если сложить ваш возраст и ваше число, то будет: "
        + (age+random_int) + "\n");
        System.out.println("А так же если ваш рост умножить на ваше другое число, то будет: "
        + (height*random_double) + "\n");
    }
}
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner in = new Scanner(System.in);

        System.out.println("Привет!");
        System.out.println("(Внутренний голос советует вам ответить компьютеру):");
        String hello = in.nextLine();
        if(!hello.equals("Привет") || hello == null)
        {
            System.out.println("Ты не культурный, не хочу с тобой общаться!");
            System.exit(0);
        }

        //Информация о человеке
        boolean flag;
        String name;
        int age = 0;
        String age_str;
        double height = 0;
        String height_str;
        String info;
        int number_int = 0;
        String number_int_str;
        double number_double = 0;
        String number_double_str;

        // Имя
        System.out.println("Как тебя зовут?");
        do {
            flag = true;
            name = in.nextLine();
            if(name.isEmpty() || name.matches(".*\\d.*") )
            {
                flag = false;
            }
            if(flag == false)
                {
                    System.out.println("Я не верю тебе!");
                    System.out.println("Давай ещё раз, сколько тебе лет?");
                }
        }while(!flag);
        // Возраст
        System.out.println("Сколько тебе лет?");
        do {
            flag = true;
            age_str = in.nextLine();

            if(!age_str.isEmpty())
            {
                try{
                    flag = true;
                    age = Integer.parseInt(age_str);
                    if(age <= 0 ||  age > 100)
                    {
                        flag = false;
                        System.out.println("Неверный возраст! Должен быть от 1 до 100.");
                    }
                } 
                catch (NumberFormatException e) {
                    flag = false;
                    System.out.println("Это не число!");
                }
            }
            else{
                flag = false;;
                System.out.println("Пустая строка!");
            }
            if(!flag)
            {
                System.out.println("Давай ещё раз, сколько тебе лет?");
            }
        }while(!flag);
        // Рост
        System.out.println("Какой у тебя рост?");
        do {
            flag = true;
            height_str = in.nextLine();
            if(!height_str.isEmpty() || !height_str.contains(","))
            {
                try{
                flag = true;
                height = Double.parseDouble(height_str);
                if(height <= 0 || height > 2.5)
                {
                    flag = false;
                    System.out.println("Человек не может быть такого роста!");
                }
                }
                catch (NumberFormatException e) 
                {
                    flag = false;
                    System.out.println("Это не число!");
                }
            }
            else{
                flag = false;
                System.out.println("Пустая строка или неверный ввод! ");
            } 
            if(!flag)
                {
                    System.out.println("Давай ещё раз, какого ты роста?");
                }
        }while(!flag);

        System.out.println("Спасибо. Теперь расскажи что-нибудь о себе:");
        info = in.nextLine();
// Два числа
        System.out.println("Хочешь шутку? Напиши 2 числа, одно целое, другое вещественное(запятую): ");
        do {
            flag = true;
            number_int_str = in.nextLine();

            if(!number_int_str.isEmpty())
            {
                try{
                    flag = true;
                    number_int = Integer.parseInt(number_int_str);
                } 
                catch (NumberFormatException e) {
                    flag = false;
                    System.out.println("Это не число!");
                }
            }
            else{
                flag = false;;
                System.out.println("Пустая строка!");
            }
            if(!flag)
            {
                System.out.println("Давай ещё раз, напиши целое число?");
            }
        }while(!flag);

        do {
            flag = true;
            number_double_str = in.nextLine();
            if(!number_double_str.isEmpty() || !number_double_str.contains(","))
            {
                try{
                flag = true;
                number_double = Double.parseDouble(number_double_str);
                }
                catch (NumberFormatException e) 
                {
                    flag = false;
                    System.out.println("Это не число!");
                }
            }
            else{
                flag = false;
                System.out.println("Пустая строка или неверный ввод! ");
            } 
            if(!flag)
                {
                    System.out.println("Давай ещё раз, напиши одно вещественное число?");
                }
        }while(!flag);

        //info = in.nextLine(); //! Ошибка: nextLine() не может быть после nextInt() или nextDouble() 
        // todo: выяснить почему


        // Проверка инфы
        //System.out.println("name = " + name); // Всё ок
        //System.out.println("age = " + age); // Всё ок
        //System.out.println("height = " + height); // Всё ок
        //System.out.println("numberInt = " + numberInt); // Всё ок // todo но ошибки с классом
        //System.out.println("numberDouble = " + numberDouble); // Всё ок // todo но ошибки с классом
        //System.out.println("text = " + text); //! Не читается



        p.set_info(name, age, height, number_int, number_double, info);
        //Вывод информации
        p.print_info();
    }
}

