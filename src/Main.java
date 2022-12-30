import java.util.Arrays;

public class Main {

    //Напишите программу, которая переворачивает массив.
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        //Напишите программу, которая проверяет, является ли строка палиндромом.
        System.out.println();
        System.out.println(Polindrom.isPolindrom("топот"));
        System.out.println(Polindrom.isPolindrom("java"));

        //Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
        String str = "Учить джаву тяжело";
        char[] strToArray = str.toCharArray();
        for (int i = 0; i < strToArray.length / 2; i++) {
            System.out.print(strToArray[i]);
        }
        System.out.println();
        for (int i = strToArray.length / 2; i <= strToArray.length - 1; i++) {
            System.out.print(strToArray[i]);
        }

        //Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
        System.out.println();
        String[] arrayString = new String[5];
        arrayString[0] = "первая строка";
        arrayString[1] = "первая строка";
        arrayString[2] = "третья строка";
        arrayString[3] = "пятая строка";
        arrayString[4] = "пятая строка";
        for (int i = 0; i < arrayString.length - 1; i++) {
            if (arrayString[i].equals(arrayString[i + 1])) {
                arrayString[i] = null;
            }
        }
        System.out.println(Arrays.toString(arrayString));
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i] != null) {
                System.out.print(arrayString[i] + " ");
            }
        }

        System.out.println();




        //Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» И. О. Автора.
        String [][] arrayBooks = { {"Нос", "Н. В. Гоголь"}, {"Вий", "Н. В. Гоголь"}, {"Война и мир", "Л. Н. Толстой"}, {"Мцыри", "М. Ю. Лермонтов"}};
        System.out.println(Arrays.toString(arrayBooks[0]));
        System.out.println(Arrays.toString(arrayBooks[1]));
        System.out.println(Arrays.toString(arrayBooks[2]));
        System.out.println(Arrays.toString(arrayBooks[3]));


        /*Необходимо реализовать следующий метод:
        1. Получаем на входе массив чисел.
        2. Все четные числа увеличиваем на единицу.
        3. Возвращаем кусок списка с 3-го по 7-й элемент.*/
        System.out.println();
        changeArray.changeMyArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        System.out.println();
        Squaring.squaringNumber(5);




    }

}