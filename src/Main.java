import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        //firstTask();
        //secondTask();
        //thirdTask();
        //fourthTask();
        //fifthTask();
        //sixthTask();
        //seventhTask();
        //eightTask();
        //ninthTask();
        //tenthTask();
        //eleventhTask();
        //twelfthTask();
        //thirteenthTask();
        //fourteenthTask();
        //fifteenthTask();
        //sixteenthTask();
        //seventeenthTask();
        //eighteenthTask();
        //nineteenthTask();
        //twentiethTask();
    }

    //Задача 1: Четное или нечетное число
    public static void firstTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: "); int num = in.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Число четное");
        }
        else
        {
            System.out.println("Число нечетное");
        }

        in.close();
    }

    //Задача 2: Минимальное из трех чисел
    public static void secondTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 3 числa через пробел: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(num1 < num2 && num1 < num3)
        {
            System.out.printf("Минимальное число: %d ", num1);
        }
        else if (num2 < num1 && num2 < num3)
        {
            System.out.printf("Минимальное число: %d ", num2);
        }
        else if (num3 < num1 && num3 < num2)
        {
            System.out.printf("Минимальное число: %d ", num3);
        }

        in.close();
    }

    //Задача 3: Таблица умножения
    public static void thirdTask()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * 5 = " + (i * 5) + '\n', i);
        }
    }

    //Задача 4: Сумма чисел от 1 до N
    public static void fourthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число N: "); int N = in.nextInt();

        int sum = 0;
        for (int i = 0; i <= N; i++)
        {
            sum += i;
        }

        System.out.println("Сумма всех чисел: " + sum);

        in.close();
    }

    //Задача 5: Число Фибоначчи
    public static void fifthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число N: "); int N = in.nextInt();

        int[] mass = new int[N];
        mass[0] = 0;
        mass[1] = 1;

        for (int i = 2; i < N; i++)
        {
            mass[i] = mass[i - 1] + mass[i - 2];
        }

        for (int i : mass)
        {
            System.out.println(i);
        }

        in.close();
    }

    //Задача 6: Проверка простого числа
    public static void sixthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: "); int num = in.nextInt();

        if(num < 2)
        {
            System.out.printf("Число %d непростое", num);
            return;
        }

        boolean flag = true;
        for (int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                flag = false;
                break;
            }

        }

        if(flag)
        {
            System.out.printf("Число %d простое", num);
        }
        else
        {
            System.out.printf("Число %d непростое", num);
        }
        in.close();
    }

    //Задача 7: Обратный порядок чисел
    public static void seventhTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: "); int N = in.nextInt();

        for (int i = N; i > 0; i--)
        {
            System.out.println(i);
        }

        in.close();
    }

    //Задача 8: Сумма четных чисел
    public static void eightTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число A и B через пробел: ");
        int A = in.nextInt();
        int B = in.nextInt();

        int sum = 0;
        for (int i = A; i <= B; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }

        System.out.println(sum);

        in.close();
    }

    //Задача 9: Реверс строки
    public static void ninthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = in.nextLine();

        for (int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }

        in.close();
    }

    //Задача 10: Количество цифр в числе
    public static void tenthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: "); int num = in.nextInt();

        int count = 0;
        while(num > 0)
        {
            num /= 10;
            count++;
        }

        System.out.println("Количество цифр в числе: " + count);

        in.close();
    }

    //Задача 11: Факториал числа
    public static void eleventhTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число N: "); int N = in.nextInt();

        int mult = 1;
        for (int i = 1; i <= N; i++)
        {
            mult *= i;
        }

        System.out.printf("Факториал %d равен: %d", N, mult);

        in.close();
    }

    //Задача 12: Сумма цифр числа
    public static void twelfthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число N: "); int num = in.nextInt();

        int tempNum = num;

        int sum = 0;
        while(num > 0)
        {
            sum += num % 10;
            num /= 10;
        }

        System.out.printf("Сумма цифр числа %d равна: %d", tempNum, sum);

        in.close();
    }

    //Задача 13: Палиндром
    public static void thirteenthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = in.nextLine();

        str = str.toLowerCase();

        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
            {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Строка является палиндромом");
        }
        else
        {
            System.out.println("Строка не является палиндромом");
        }

        in.close();
    }

    //Задача 14: Найти максимальное число в массиве
    public static void fourteenthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: "); int size = in.nextInt();
        System.out.print("Введите элементы массива: ");

        int[] mass = new int[size];

        for (int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();
        }

        System.out.println("Максимальное число в массиве: " + Arrays.stream(mass).max().getAsInt());

        in.close();
    }

    //Задача 15: Сумма всех элементов массива
    public static void fifteenthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: "); int size = in.nextInt();
        System.out.print("Введите элементы массива: ");

        int[] mass = new int[size];

        for (int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();
        }

        System.out.println("Сумма чисел массива: " + Arrays.stream(mass).sum());

        in.close();
    }

    //Задача 16: Количество положительных и отрицательных чисел
    public static void sixteenthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: "); int size = in.nextInt();
        System.out.print("Введите элементы массива: ");

        int[] mass = new int[size];

        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();

            if(mass[i] < 0)
            {
                countNegative++;
            }
            else
            {
                countPositive++;
            }
        }

        System.out.printf("В массиве %d отрицательных и %d положительных чисел", countNegative, countPositive);

        in.close();
    }

    //Задача 17: Простые числа в диапазоне
    public static void seventeenthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число A: ");
        int num1 = in.nextInt();

        System.out.print("Введите целое число B: ");
        int num2 = in.nextInt();

        for(int i = num1; i <= num2; i++) {
            boolean flag = true;

            if (i < 2) {
                continue;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Число " + i + " является простым");
            } else {
                continue;
            }
        }
            in.close();
    }

    //Задача 18: Подсчет гласных и согласных в строке
    public static void eighteenthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = in.nextLine();

        str = str.toLowerCase();

        int countVowels = 0;
        int countСonsonant  = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if("аеёиоуыэюя".indexOf(str.charAt(i)) != -1)
            {
                countVowels++;
            }
            else if ("бвгджзйклмнпрстфхцчшщ".indexOf(str.charAt(i)) != -1)
            {
                countСonsonant++;
            }
        }

        System.out.printf("В строке %d гласных и %d согласных", countVowels, countСonsonant);

        in.close();
    }

    //Задача 19: Перестановка слов в строке
    public static void nineteenthTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = in.nextLine();

        String[] mass = str.split(" ");

        for (int i = 0; i < mass.length / 2; i++)
        {
            String temp = mass[i];

            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = temp;
        }

        String newStr = "";
        for (String s : mass)
        {
            newStr += s + ' ';
        }
        newStr = newStr.trim();

        System.out.println(newStr);

        in.close();
    }

    //Задача 20: Число Армстронга
    public static void twentiethTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        int tempNum = num;
        int count = 0;
        while(tempNum > 0)
        {
            tempNum /= 10;
            count++;
        }

        tempNum = num;
        int sum = 0;
        while(tempNum > 0)
        {
            sum += Math.pow(tempNum % 10, count);
            tempNum /= 10;
        }

        if(sum == num)
        {
            System.out.printf("Число %d является числом Армстронга", num);
        }
        else
        {
            System.out.printf("Число %d не является числом Армстронга", num);
        }

        in.close();
    }
}