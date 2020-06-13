package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> manNames = new ArrayList<>();
        manNames.add("Женя");
        manNames.add("Петя");
        manNames.add("Толя");
        manNames.add("Слава");
        manNames.add("Юра");
        manNames.add("Влад");
        manNames.add("Сергей");
        manNames.add("Саша");
        for (String item : manNames) {
            System.out.println(item);
        }
        if (manNames.contains("Гена")) {
            System.out.println("Имя Гена в списке есть");
        } else {
            System.out.println("Имени Гена в списке нет");
        }
        manNames.remove("Петя");
        System.out.println(manNames);
        manNames.remove(2);
		System.out.println(manNames);

		List<String> womanNames = new ArrayList<>();
		womanNames.add("Катя");
		womanNames.add("Алина");
		womanNames.add("Маша");
		womanNames.add("Юля");
		womanNames.add("Валя");
		womanNames.add("Света");
		manNames.addAll(womanNames);
		System.out.println(manNames);
		System.out.println(manNames.size());

    }
}
