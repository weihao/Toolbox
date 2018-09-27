import java.io.File;

public class BatchRenameFilesInADirectory {
    public static void main(String[] args) {
        // Linux Path.
        String path = "/home/Test/";
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                File f = new File(path + listOfFiles[i].getName());
                String filename = listOfFiles[i].getName().replaceAll("", "");
                f.renameTo(new File(path + filename));
            }
        }
    }
}
