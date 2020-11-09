package our.company;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
        из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.*/
        String[] listWords = {"after", "before", "apple", "banana", "after", "close", "red", "string", "word", "after", "apple"};
        getListInfo(listWords);


        /* 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.*/
        TelephoneDirectory td = new TelephoneDirectory();
        td.adds("Petrov", "+79996541232");
        td.adds("Mishkov", "+79835647885");
        td.adds("Krutov", "+79652369855");
        td.adds("Petrov", "+79893571596");
        td.get("Petrov");
        td.get("Mishkov");
        td.get("Krutov");
    }

    public static void getListInfo(String[] arr){

        Map<String, Integer> mapArr = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (mapArr.containsKey(arr[i])){
                int count = mapArr.get(arr[i]);
                count++;
                mapArr.put(arr[i], count);
            } else {
                mapArr.put(arr[i], 1);
            }
        }
        for (Map.Entry<String, Integer> o : mapArr.entrySet()){
            System.out.println(MessageFormat.format("Уникальное значение: {0}", o.getKey()));
        }
        System.out.println();
        for (Map.Entry<String, Integer> o : mapArr.entrySet()){
            System.out.println(MessageFormat.format("Значение: {0}, Количество: {1}", o.getKey(), o.getValue()));
        }

    }
}
