import Manager.CollectionManager;
import Manager.Commander;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * @author Stephanskaya P.A.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    System.out.println("\nВыход из программы...");
                }
            });
            Commander commander = new Commander(new CollectionManager(new File(System.getenv("ProductsFile"))));
            commander.interactiveMod();
        }catch (NoSuchElementException e){
            System.out.println("Выход из программы...");
        } catch (NullPointerException e) {
            System.out.println("Имя файла должно быть передано через переменную окружения ProductsFile");
        }
    }
}
