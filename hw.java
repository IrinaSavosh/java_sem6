package seminar_6;

import java.util.HashSet;
import java.util.Scanner;

public class hw {
    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
     * методы.
     * Реализовать в java.
     * Создать множество ноутбуков.
     * Написать метод, который будет запрашивать у пользователя критерий фильтрации
     * и выведет ноутбуки,
     * отвечающие фильтру.
     * NoteBook notebook1 = new NoteBook
     * NoteBook notebook2 = new NoteBook
     * NoteBook notebook3 = new NoteBook
     * NoteBook notebook4 = new NoteBook
     * NoteBook notebook5 = new NoteBook
     * 
     * Например: “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет
     * 
     * Далее нужно запросить минимальные значения для указанных критериев -
     * сохранить параметры фильтрации можно также в Map.
     * 
     * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
     * условиям.
     * 
     * Класс сделать в отдельном файле
     * 
     * приветствие
     * Выбор параметра
     * выбор конкретнее
     * вывод подходящих
     */
    public static void main(String[] args) {
        Computers compOne = new Computers("HP", "Windows", 500, 4, "Черный");
        Computers compTwo = new Computers("HP", "Linux", 500, 4, "Серый");
        Computers compThree = new Computers("Apple", "MacOS", 600, 4, "Белый");
        Computers compFour = new Computers("Apple", "MacOS", 600, 4, "Черный");
        Computers compFive = new Computers("Asus", "Without an operating system", 700, 8, "Серый");

        HashSet<Computers> unique = new HashSet<Computers>();
        unique.add(compOne);
        unique.add(compTwo);
        unique.add(compThree);
        unique.add(compFour);
        unique.add(compFive);

        System.out.println("Рады видеть Вас в нашем магазине!\n"
                + "Eсли Вы хотите посмотреть все модели, то нажмите 0.\n"
                + "Если хотите отфильтровать параметры, выберите тип сортировки:\n1. Производитель (бренд)."
                + "\n2. Операционная система.\n3. Объем оперативной памяти.\n4. Объем жесткого диска."
                + "\n5. Цвет.");

        Scanner in = new Scanner(System.in);
        System.out.print("Ваш выбор: ");
        int number = in.nextInt();
        System.out.println("--------------------");
        if (number == 0) {
            Computers.getAll(unique);
        } else if (number == 1) {
            System.out.println("Выберите бренд модели:\n"
                    + "1. Apple.\n2. Asus.\n3. HP\n");
            System.out.print("Ваш выбор: ");
            int intoNumberOne = in.nextInt();
            System.out.println("--------------------");
            if (intoNumberOne == 1) {
                for (Computers i : unique) {
                    i.filterString("Apple");
                }
            } else if (intoNumberOne == 2) {
                for (Computers i : unique) {
                    i.filterString("Asus");
                }
            } else if (intoNumberOne == 3) {
                for (Computers i : unique) {
                    i.filterString("HP");
                }
            }
        } else if (number == 2) {
            System.out.println("Выберите тип операционной системы:\n"
                    + "1. MacOS.\n2. Linux.\n3. Windows.\n4. Without an operating system.");
            System.out.print("Ваш выбор: ");
            int intoNumberTwo = in.nextInt();
            System.out.println("--------------------");
            if (intoNumberTwo == 1) {
                for (Computers i : unique) {
                    i.filterString("MacOS");
                }
            } else if (intoNumberTwo == 2) {
                for (Computers i : unique) {
                    i.filterString("Linux");
                }
            } else if (intoNumberTwo == 3) {
                for (Computers i : unique) {
                    i.filterString("Windows");
                }
            } else if (intoNumberTwo == 4) {
                for (Computers i : unique) {
                    i.filterString("Without an operating system");
                }
            }
        } else if (number == 3) {
            System.out.println("Установите минимальное и максимальное значения");
            System.out.print("Минимальное: ");
            int min = in.nextInt();
            System.out.print("Максимальное: ");
            int max = in.nextInt();
            System.out.println("--------------------");
            for (Computers i : unique) {
                i.filterMaxMin(min, max);
            }
        } else if (number == 4) {
            System.out.println("Установите минимальное и максимальное значения");
            System.out.print("Минимальное: ");
            int min = in.nextInt();
            System.out.print("Максимальное: ");
            int max = in.nextInt();
            System.out.println("--------------------");
            for (Computers i : unique) {
                i.filterMaxMin(min, max);
            }
        } else if (number == 5) {
            System.out.println("Выберите Цвет модели:\n"
                    + "1. Белый.\n2. Серый.\n3. Черный\n");
            System.out.print("Ваш выбор: ");
            int intoNumberThree = in.nextInt();
            System.out.println("--------------------");
            if (intoNumberThree == 1) {
                for (Computers i : unique) {
                    i.filterString("Белый");
                }
            } else if (intoNumberThree == 2) {
                for (Computers i : unique) {
                    i.filterString("Серый");
                }
            } else if (intoNumberThree == 3) {
                for (Computers i : unique) {
                    i.filterString("Черный");
                }
            }
        }

        in.close();
    }

}
