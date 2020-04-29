package Manager;

import java.io.IOException;
import java.util.Scanner;

/*
 * Класс, управляющий выполнением команд
 */
public class Commander {
    private CollectionManager manager;
    private String strCommand = "";
    public Commander(CollectionManager manager) {
        this.manager = manager;
    }
    public void interactiveMod() throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            while (!strCommand.equals("exit")) {
                strCommand = scan.nextLine();
                String[] commands = strCommand.trim().split(" ", 7);
                try {
                    switch (commands[0]) {
                        case "":
                            break;
                        case "help":
                            manager.help();
                            break;
                        case "info":
                            manager.info();
                            break;
                        case "show":
                            manager.show();
                            break;
                        case "add":
                            manager.add();
                            break;
                        case "update":
                            manager.update(commands[1]);
                            break;
                        case "remove_by_id":
                            manager.remove_by_id(commands[1]);
                            break;
                        case "clear":
                            manager.clear();
                            break;
                        case "save":
                            try {
                                manager.save();
                            } catch (Exception e) {
                                System.out.println("Отсутствуют права на запись в файл");
                            }
                            break;
                        case"execute_script":
                            manager.execute_script(commands[1]);
                            break;
                        case "remove_first":
                            manager.remove_first();
                            break;
                        case"add_if_min":
                            manager.add_if_min();
                            break;
                        case"remove_greater":
                            manager.remove_greater(commands[1]);
                            break;
                        case "average_of_price":
                            manager.average_of_price();
                            break;
                        case"count_by_owner":
                            manager.count_by_owner(commands[1], commands[2], commands[3], commands[4]);
                            break;
                        case "count_less_than_price":
                            manager.count_less_than_price(commands[1]);
                            break;
                        case "exit":
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Неизвестная команда. Повторите ввод");
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("У команды отсутствует аргумент");
                }
            }
        }
    }
}
