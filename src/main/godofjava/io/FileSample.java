package godofjava.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by chgm1006 on 2015. 4. 24..
 */
public class FileSample {
    private void checkFiles(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = " + file.createNewFile());
            System.out.println("Absolute path = " + file.getAbsolutePath());
            System.out.println("Absolute file = " + file.getAbsoluteFile());
            System.out.println("Canonical path = " + file.getCanonicalPath());
            System.out.println("Canonical file = " + file.getCanonicalFile());

            System.out.println("Name = " + file.getName());
            System.out.println("Path = " + file.getPath());
            System.out.println("Directory = " + file.getParent());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists? = " + file.exists());
        System.out.println("Make " + pathName + " result = " + file.mkdir());
        System.out.println(pathName + " is directory? = " + file.isDirectory());
        System.out.println(pathName + " is file? = " + file.isFile());
        System.out.println(pathName + " is hidden? = " + file.isHidden());
        System.out.println(pathName + " can read? = " + file.canRead());
        System.out.println(pathName + " can write? = " + file.canWrite());
        System.out.println(pathName + " can execute? = " + file.canExecute());
        System.out.println(pathName + " last modified = " + new Date(file.lastModified()));
//    System.out.println("Delete " + pathName + " result = " + file.delete());
    }

    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = File.separator + "Users" + File.separator + "chgm1006" + File.separator + "basicjava";
//    sample.checkPath(pathName);

        String fileName = "test.txt";
        sample.checkFiles(pathName, fileName);
    }


}
