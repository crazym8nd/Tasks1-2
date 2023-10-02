package Vitaly;
/*Задание 1
        Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива, значения которых в сумме дают число переданное в массив.
        Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
        Один и тот же элемент не может быть использован дважды.
        array = [3, 8, 15, 17], Number = 23
        result = [1,2]
        Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
        из 23 нужно вычесть значение и получить число которое будем сравнивать со старой мапой,, создавая новый массив
*/


import java.util.Arrays;
import java.util.LinkedHashMap;

public class Solution01 {
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17};
        int number = 23;
        LinkedHashMap<Integer, Integer> numbers = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            numbers.put(array[i], i); //  k =3 v =0
        }
        for (int i = 0; i < array.length; i++) {
            int value = array[i]; // value = 3
            int goal = number - value; //goal = 20
            Integer matching = numbers.get(goal); // k = 0 v=null?
            if (matching != null && i != matching) {
                System.out.println(Arrays.toString(new int[]{i, matching}));
            }
        }
    }
}
