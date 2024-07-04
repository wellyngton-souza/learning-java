package project;

import javax.swing.*;

public class Frame {
    public static JFrame frame;
    public static JTextArea textArea;
    private static JMenuItem aNew;

    public static void createFrame(){
        frame = new JFrame("Note Keeper");

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save As...");

        JMenuItem[] menusItens = { New, open, save, saveAs };

        for (int i = 0; i < menusItens.length; i++) menuFile.add(menusItens[i]);
    }

    public static void main(String[] args) {
        createFrame();
        createTextArea();
        createMenu();

        frame.setVisible(true);
    }
}