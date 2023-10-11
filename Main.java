import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String gamesPath = "/Users/elizavetagilyarevskaya/Desktop/Games"; // Укажите путь к папке Games

        File gamesFolder = new File(gamesPath);
        boolean gamesFolderCreated = gamesFolder.mkdir();
        if (gamesFolderCreated) {
            System.out.println("Папка Games успешно создана");
        } else {
            System.out.println("Не удалось создать папку Games");
            return;
        }

        String[] subfolders = {"src", "res", "savegames", "temp"};

        for (String subfolder : subfolders) {
            File folder = new File(gamesPath + "/" + subfolder);
            boolean folderCreated = folder.mkdir();
            if (folderCreated) {
                System.out.println("Папка " + subfolder + " успешно создана");
            } else {
                System.out.println("Не удалось создать папку " + subfolder);
            }
        }

        String srcPath = gamesPath + "/src";
        String[] srcSubfolders = {"main", "test"};

        for (String subfolder : srcSubfolders) {
            File folder = new File(srcPath + "/" + subfolder);
            boolean folderCreated = folder.mkdir();
            if (folderCreated) {
                System.out.println("Папка " + subfolder + " успешно создана");
            } else {
                System.out.println("Не удалось создать папку " + subfolder);
            }
        }

        File mainJavaFile = new File(srcPath + "/main/Main.java");
        File utilsJavaFile = new File(srcPath + "/main/Utils.java");

        try {
            boolean mainFileCreated = mainJavaFile.createNewFile();
            boolean utilsFileCreated = utilsJavaFile.createNewFile();

            if (mainFileCreated) {
                System.out.println("Файл Main.java успешно создан");
            } else {
                System.out.println("Не удалось создать файл Main.java");
            }

            if (utilsFileCreated) {
                System.out.println("Файл Utils.java успешно создан");
            } else {
                System.out.println("Не удалось создать файл Utils.java");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файлов");
        }

        String resPath = gamesPath + "/res";
        String[] resSubfolders = {"drawables", "vectors", "icons"};

        for (String subfolder : resSubfolders) {
            File folder = new File(resPath + "/" + subfolder);
            boolean folderCreated = folder.mkdir();
            if (folderCreated) {
                System.out.println("Папка " + subfolder + " успешно создана");
            } else {
                System.out.println("Не удалось создать папку " + subfolder);
            }
        }

        File tempFile = new File(gamesPath + "/temp/temp.txt");

        try {
            boolean tempFileCreated = tempFile.createNewFile();
            if (tempFileCreated) {
                System.out.println("Файл temp.txt успешно создан");
            } else {
                System.out.println("Не удалось создать файл temp.txt");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
        }

        StringBuilder log = new StringBuilder();


        try (FileWriter writer = new FileWriter("temp.txt")) {
            writer.write(log.toString());
            writer.flush();
            System.out.println("Лог успешно записан в файл 'temp.txt'");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи лога в файл 'temp.txt'" + e.getMessage());
        }

    }

}


