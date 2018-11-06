import java.io.File;
import java.util.Arrays;

public class BatchRenameFilesInADirectory {
    public static void main(String[] args) {
        String path = "/home/temp/";
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        // Sort all files by name to keep consistency.
        Arrays.sort(listOfFiles);


        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                File f = new File(path + listOfFiles[i].getName());

                // Rename files logic here.
                String filename = listOfFiles[i].getName().replaceAll("req", "resp");

                
                f.renameTo(new File(path + filename));
            }
        }
    }
}
