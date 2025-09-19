package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        String number_str;
        int number = 0;
        int sum = 0;
        int count = 0;

        while (count !=3) {
            System.out.println("Напиши число от 1 до 100.");
            do {
                flag = true;
                number_str = in.nextLine();

                if(!number_str.isEmpty())
                {
                    try{
                        flag = true;
                        number = Integer.parseInt(number_str);
                        if(number <= 0 ||  number > 100)
                        {
                            flag = false;
                            System.out.println("Неверное число! Должно быть от 1 до 100.");
                        }
                        sum += number;
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
                    System.out.println("Давай ещё раз, напиши число?");
                }
            }while(!flag);
            ++count;
            if(count != 3)
            {
                System.out.print("Мне нужно ещё одно число. 2");
            }
        }
        System.out.println("Сумма ваших чисел = " + sum);
        
    }
}
