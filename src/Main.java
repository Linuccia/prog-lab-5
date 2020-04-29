import Manager.CollectionManager;
import Manager.Commander;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    System.out.println("\nВыход из программы...");
                }
            });
            Commander commander = new Commander(new CollectionManager(new File("JSON.json")));
            commander.interactiveMod();
        }catch (NoSuchElementException e){
            System.out.println("Выход из программы...");
        }
    }
}
