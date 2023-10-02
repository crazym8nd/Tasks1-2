package Vitaly;
/*Задание 2
        Дан массив целых чисел.
        Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты

        Пример:
        Array: [4,5,6,6,8]
        Result: true
        Число 6 повторяется 2 раза

        Array: [4,5,6,7,8]
        Result: false
        Дубликатов нет
*/


import java.util.HashSet;

public class Solution02 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 6, 8};
        boolean result= false;

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            result =set.add(array[i]);
        }
        System.out.println(result);

    }


}
