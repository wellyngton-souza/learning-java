package project;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Frame {
    public static JFrame frame;
    public static JTextArea textArea;
    private static JMenuItem aNew;

    public static void createFrame(){
        frame = new JFrame("Note Keeper");

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("C:/Users/wellyngton/Downloads/App java/src/assets/sample1.jfif");

        int width = 64;
        int height = 64;

        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        frame.setIconImage(scaledIcon.getImage());
    }
    public static void createTextArea(){
        textArea = new JTextArea();
        frame.add(textArea);

        JScrollPane scrollBar = new JScrollPane(textArea);
        scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        scrollBar.setBorder(BorderFactory.createEmptyBorder()); //

        frame.add(scrollBar);
    }
    public static void createMenu(){
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);

        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuFormat = new JMenu("Format");

        JMenu[] menus = { menuFile, menuEdit, menuFormat };

        for (int i = 0; i < menus.length; i++) menu.add(menus[i]);

        JMenuItem New = new JMenuItem("New");
        New.addActionListener(e -> FileMenu.newFile());
        New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(e -> FileMenu.openFile());
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(e -> FileMenu.save());
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem saveAs = new JMenuItem("Save As...");
        saveAs.addActionListener(e -> FileMenu.saveAs());
        saveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem cut = new JMenuItem("Cut");
        cut.addActionListener(e -> Edit.cut());
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem copy = new JMenuItem("Copy");
        copy.addActionListener(e -> Edit.copy());
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem paste = new JMenuItem("Paste");
        paste.addActionListener(e -> Edit.paste());
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem selecAll = new JMenuItem("Select");
        selecAll.addActionListener(e -> Edit.selectAll());
        selecAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem boldItem = new JMenuItem("BoldItem");
        boldItem.addActionListener(e -> FormatMenu.boldItem());

        JMenuItem italicItem = new JMenuItem("Italic");
        italicItem.addActionListener(e -> FormatMenu.italicItem());

        JMenuItem fontColorItem = new JMenuItem("Font Color");
        fontColorItem.addActionListener(e -> FormatMenu.fontColorItem());

        JMenuItem[] menusItens = { New, open, save, saveAs };

        for (int i = 0; i < menusItens.length; i++) menuFile.add(menusItens[i]);

        JMenuItem[] menusEdit = { cut, copy, paste, selecAll };

        for (int i = 0; i < menusEdit.length; i++) menuEdit.add(menusEdit[i]);

        JMenuItem[] menuFormatItems = { boldItem, italicItem, fontColorItem };

        for (int i = 0; i < menuFormatItems.length; i++) menuFormat.add(menuFormatItems[i]);
    }

    public static void main(String[] args) {
        createFrame();
        createTextArea();
        createMenu();

        frame.setVisible(true);
    }
}