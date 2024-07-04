package project;

import java.awt.FileDialog;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileMenu {
    public static JFrame frame;
    public static String fileName;
    public static String filePath;
    public static String diretory;

    public static void newFile(){
        Frame.textArea.setText("");
        Frame.frame.setTitle("New");
    }

    public static void openFile(){
        FileDialog fileDialog = new FileDialog(frame, "open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if(fileDialog.getFile() != null){
            diretory = fileDialog.getDirectory();
            fileName = fileDialog.getFile();
            filePath = diretory + fileName;
            Frame.frame.setTitle(fileName);

            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String Line;

                Frame.textArea.setText("");
                while((Line = reader.readLine()) != null) {
                    Frame.textArea.append(Line + "\n");
                };
            } catch (IOException e){
                System.out.println("File not opened" + e);
            }
        }
    }
}
