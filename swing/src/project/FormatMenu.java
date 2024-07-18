package project;
import javax.swing.*;
import java.awt.*;

public class FormatMenu {
    public static void boldItem(){
        Font currentFont = Frame.textArea.getFont();
        Font boldFont = currentFont.deriveFont(Font.BOLD);
        Frame.textArea.setFont(boldFont);
    }
    public static void italicItem(){
        Font currentFont = Frame.textArea.getFont();
        Font italicFont = currentFont.deriveFont(Font.ITALIC);
        Frame.textArea.setFont(italicFont);
    }
    public static void fontColorItem(){
        Color selectedColor = JColorChooser.showDialog(null, "set font color", Color.BLACK);
        if(selectedColor != null){
            Frame.textArea.setForeground(selectedColor);
        }
    }
}
