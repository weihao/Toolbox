import java.io.*;
import java.util.Arrays;

public class BatchReplaceWordsInADirectory {
    public static void main(String[] args) throws IOException {
        String path = "/home/temp/";
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        Arrays.sort(listOfFiles);

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                File f = new File(path + listOfFiles[i].getName());
                String _name = listOfFiles[i].getName();

                updateFile(f);

                System.out.println(String.format("%s file processed.", _name));
            }
        }
    }

    private static void updateFile(File f) throws IOException {
        File tempFile = new File(f.getAbsolutePath() + ".tmp");
        try (BufferedReader reader = new BufferedReader(new FileReader(f));
             PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Replace logic here.
                writer.println(line.replaceAll("\\{Good Bye 2017\\}", "\\{Good Bye 2018\\}"));
            }
        }
        f.delete();
        tempFile.renameTo(f);
    }
}
