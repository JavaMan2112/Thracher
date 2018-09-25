
package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.*;

public class WindowEngine extends JFrame{

    public JButton button1x1;
    public JButton button1x2;
    public JButton button1x3;
    public JButton button1x4;
    public JButton button1x5;
    public JButton button1x6;
    public JButton button1x7;
    public JButton button1x8;
    public JButton button1x9;

    public JButton button2x1;
    public JButton button2x2;
    public JButton button2x3;
    public JButton button2x4;
    public JButton button2x5;
    public JButton button2x6;
    public JButton button2x7;
    public JButton button2x8;
    public JButton button2x9;

    public JButton button3x1;
    public JButton button3x2;
    public JButton button3x3;
    public JButton button3x4;
    public JButton button3x5;
    public JButton button3x6;
    public JButton button3x7;
    public JButton button3x8;
    public JButton button3x9;


    public Color color = (Color.WHITE);
    Font fontForButton = new Font("Verdana", Font.BOLD, 15);
    Font fontHomePage = new Font("Italic", Font.BOLD, 40);



    public WindowEngine() {
        setTitle("YouTube TOP by NikoPapchenko");

        JPanel vkladka1 = new JPanel();
        vkladka1.setBackground(Color.WHITE);
        JPanel vkladka2 = new JPanel();
        vkladka2.setBackground(Color.WHITE);
        JPanel vkladka3 = new JPanel();
        vkladka3.setBackground(Color.WHITE);
        JPanel vkladka4 = new JPanel();
        vkladka3.setBackground(Color.WHITE);
        JPanel vkladka5 = new JPanel();
        vkladka3.setBackground(Color.WHITE);


        JMenu menu = new JMenu("Меню");
        JMenu menu2 = new JMenu("Опции");
        JMenu menu3 = new JMenu("О Программе");

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.add(menu3);

        JMenuItem menuItem = new JMenuItem("Выбор цвета фона");
        JMenuItem menuItem2 = new JMenuItem("Описание");
        JMenuItem menuItem3 = new JMenuItem("Разработчики");
        JMenuItem menuItem4 = new JMenuItem("Закрыть программу");

        menu.add(menuItem4);
        menu2.add(menuItem);
        menu3.add(menuItem2);
        menu3.add(menuItem3);




        Icon iconButton2 = new ImageIcon(getClass().getResource("1.png"));
        button1x1 = new JButton("КИК Обзор", iconButton2);
        button1x1.setToolTipText("Ссылка на URL");
        button1x1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x1.setFont(fontForButton);
        button1x1.setForeground(Color.RED);


        button1x1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCrzwOa2lzzPjfiLIn7Y8SrQ").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x1);

        Icon iconButton3 = new ImageIcon(getClass().getResource("2.png"));
        button1x2 = new JButton("СПС", iconButton3);
        button1x2.setToolTipText("Ссылка на URL");
        button1x2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x2.setFont(fontForButton);
        button1x2.setForeground(Color.RED);


        button1x2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCsgnWX-HU2BIS7B-QMzPcfQ").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x2);

        Icon iconButton4 = new ImageIcon(getClass().getResource("5.png"));
        button1x3 = new JButton("Utopia Show", iconButton4);
        button1x3.setToolTipText("Ссылка на URL");
        button1x3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x3.setFont(fontForButton);
        button1x3.setForeground(Color.RED);


        button1x3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UC8M5YVWQan_3Elm-URehz9w").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x3);

        Icon iconButton5 = new ImageIcon(getClass().getResource("6.png"));
        button1x4 = new JButton("SciOne", iconButton5);
        button1x4.setToolTipText("Ссылка на URL");
        button1x4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x4.setFont(fontForButton);
        button1x4.setForeground(Color.RED);


        button1x4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCSaVoRErW4kqKsDqExs2MXA").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x4);

        Icon iconButton6 = new ImageIcon(getClass().getResource("vert dider.png"));
        button1x5 = new JButton("Vert Dider", iconButton6);
        button1x5.setToolTipText("Ссылка на URL");
        button1x5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x5.setFont(fontForButton);
        button1x5.setForeground(Color.RED);


        button1x5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/results?search_query=vert+dider").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x5);

        Icon iconButton7 = new ImageIcon(getClass().getResource("9.png"));
        button1x9 = new JButton("VoicePower", iconButton7);
        button1x9.setToolTipText("Ссылка на URL");
        button1x9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x9.setFont(fontForButton);
        button1x9.setForeground(Color.RED);


        button1x5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UChh4KdOL_b1D5oc3yJiaq6A/featured").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x9);

        Icon iconButton8 = new ImageIcon(getClass().getResource("10.png"));
        button1x8 = new JButton("Set Up", iconButton8);
        button1x8.setToolTipText("Ссылка на URL");
        button1x8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x8.setFont(fontForButton);
        button1x8.setForeground(Color.RED);


        button1x8.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCRSVV9S92vfCq4HZGn5AsOQ").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x8);

        Icon iconButton9 = new ImageIcon(getClass().getResource("11.png"));
        button1x7 = new JButton("Trach Smach", iconButton9);
        button1x7.setToolTipText("Ссылка на URL");
        button1x7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x7.setFont(fontForButton);
        button1x7.setForeground(Color.RED);


        button1x7.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/TrashRecord").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x7);

        Icon iconButton10 = new ImageIcon(getClass().getResource("12.png"));
        button1x6 = new JButton("Научпоп", iconButton10);
        button1x6.setToolTipText("Ссылка на URL");
        button1x6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1x6.setFont(fontForButton);
        button1x6.setForeground(Color.RED);


        button1x6.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCaY08MNW5C097-0je7xT6fA").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka2.add(button1x6);

        Icon iconButton11 = new ImageIcon(getClass().getResource("13.png"));
        button2x1 = new JButton("Игорь Войтенко", iconButton11);
        button2x1.setToolTipText("Ссылка на URL");
        button2x1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x1.setFont(fontForButton);
        button2x1.setForeground(Color.RED);


        button2x1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UC7DFMwmTVwwSO2E5vs2GgQw").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x1);

        Icon iconButton12 = new ImageIcon(getClass().getResource("14.png"));
        button2x2 = new JButton("Ярослав Брин", iconButton12);
        button2x2.setToolTipText("Ссылка на URL");
        button2x2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x2.setFont(fontForButton);
        button2x2.setForeground(Color.RED);


        button2x2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/BrinVIDEO").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x2);

        Icon iconButton13 = new ImageIcon(getClass().getResource("15.png"));
        button2x3 = new JButton("TGYM", iconButton13);
        button2x3.setToolTipText("Ссылка на URL");
        button2x3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x3.setFont(fontForButton);
        button2x3.setForeground(Color.RED);


        button2x3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/TheTGym").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x3);

        Icon iconButton14 = new ImageIcon(getClass().getResource("16.png"));
        button2x4 = new JButton("GymFit INFO", iconButton14);
        button2x4.setToolTipText("Ссылка на URL");
        button2x4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x4.setFont(fontForButton);
        button2x4.setForeground(Color.RED);


        button2x4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCWfukvhzGWMtu0LBm99gXxA").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x4);

        Icon iconButton15 = new ImageIcon(getClass().getResource("17.png"));
        button2x5 = new JButton("GoB Channel", iconButton15);
        button2x5.setToolTipText("Ссылка на URL");
        button2x5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x5.setFont(fontForButton);
        button2x5.setForeground(Color.RED);


        button2x5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCc2UzuPHYQytHnsZXo0xkVQ").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x5);

        Icon iconButton16 = new ImageIcon(getClass().getResource("18.png"));
        button2x6 = new JButton("Sportfaza", iconButton16);
        button2x6.setToolTipText("Ссылка на URL");
        button2x6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x6.setFont(fontForButton);
        button2x6.setForeground(Color.RED);


        button2x6.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCLN-c4TbT-O5bYA-2tptALw").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x6);

        Icon iconButton17 = new ImageIcon(getClass().getResource("19.png"));
        button2x7 = new JButton("Body Mania", iconButton17);
        button2x7.setToolTipText("Ссылка на URL");
        button2x7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x7.setFont(fontForButton);
        button2x7.setForeground(Color.RED);


        button2x7.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/bodymaniaa").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x7);

        Icon iconButton18 = new ImageIcon(getClass().getResource("21.png"));
        button2x8 = new JButton("Алексей Столяров", iconButton18);
        button2x8.setToolTipText("Ссылка на URL");
        button2x8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x8.setFont(fontForButton);
        button2x8.setForeground(Color.RED);


        button2x8.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/fitnessstoliarov").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x8);

        Icon iconButton19 = new ImageIcon(getClass().getResource("20.png"));
        button2x9 = new JButton("your fit", iconButton19);
        button2x9.setToolTipText("Ссылка на URL");
        button2x9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2x9.setFont(fontForButton);
        button2x9.setForeground(Color.RED);


        button2x9.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UC6Qkbg501AQodtwDGiEQR_Q").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka3.add(button2x9);

        Icon iconButton20 = new ImageIcon(getClass().getResource("30.png"));
        button3x1 = new JButton("FailArmy", iconButton20);
        button3x1.setToolTipText("Ссылка на URL");
        button3x1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x1.setFont(fontForButton);
        button3x1.setForeground(Color.RED);


        button3x1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/failarmy").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x1);

        Icon iconButton21 = new ImageIcon(getClass().getResource("22.png"));
        button3x2 = new JButton("SA Wardega", iconButton21);
        button3x2.setToolTipText("Ссылка на URL");
        button3x2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x2.setFont(fontForButton);
        button3x2.setForeground(Color.RED);


        button3x2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCdZwMpK-iWqCos46xPscDeg").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x2);

        Icon iconButton22 = new ImageIcon(getClass().getResource("23.png"));
        button3x3 = new JButton("Break Pranks", iconButton22);
        button3x3.setToolTipText("Ссылка на URL");
        button3x3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x3.setFont(fontForButton);
        button3x3.setForeground(Color.RED);


        button3x3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/break").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x3);

        Icon iconButton23 = new ImageIcon(getClass().getResource("24.png"));
        button3x4 = new JButton("Darvin St", iconButton23);
        button3x4.setToolTipText("Ссылка на URL");
        button3x4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x4.setFont(fontForButton);
        button3x4.setForeground(Color.RED);


        button3x4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCeHjNIOPCmR6BCYixiozzQQ").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x4);

        Icon iconButton24 = new ImageIcon(getClass().getResource("25.png"));
        button3x5 = new JButton("Pr Network", iconButton24);
        button3x5.setToolTipText("Ссылка на URL");
        button3x5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x5.setFont(fontForButton);
        button3x5.setForeground(Color.RED);


        button3x5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCxY6aVCtHoVNkqBa5iYuyow").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x5);

        Icon iconButton25 = new ImageIcon(getClass().getResource("26.png"));
        button3x6 = new JButton("FreddyFairhair", iconButton25);
        button3x6.setToolTipText("Ссылка на URL");
        button3x6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x6.setFont(fontForButton);
        button3x6.setForeground(Color.RED);


        button3x6.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/FreddyFairhair").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x6);

        Icon iconButton26 = new ImageIcon(getClass().getResource("27.png"));
        button3x7 = new JButton("DM Pranks", iconButton26);
        button3x7.setToolTipText("Ссылка на URL");
        button3x7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x7.setFont(fontForButton);
        button3x7.setForeground(Color.RED);


        button3x7.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCwrfRCqA9wvqp9zCvzLl6Sw").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x7);

        Icon iconButton27 = new ImageIcon(getClass().getResource("28.png"));
        button3x8 = new JButton("Friz Channel", iconButton27);
        button3x8.setToolTipText("Ссылка на URL");
        button3x8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x8.setFont(fontForButton);
        button3x8.setForeground(Color.RED);


        button3x8.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/StudioFreeZe").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x8);

        Icon iconButton28 = new ImageIcon(getClass().getResource("29.png"));
        button3x9 = new JButton("Whatever", iconButton28);
        button3x9.setToolTipText("Ссылка на URL");
        button3x9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3x9.setFont(fontForButton);
        button3x9.setForeground(Color.RED);


        button3x9.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/whatever").toURI());

                        }catch (Exception ee){}
                    }
                }
        );
        vkladka4.add(button3x9);





        JTabbedPane vkladki = new JTabbedPane();

        getContentPane().add(vkladki);







        menuItem.addActionListener(
                new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        color = JColorChooser.showDialog(null, "Выбери цвет фона", color);
                        if (color == null)
                            color = (Color.WHITE);
                        vkladka1.setBackground(color);
                        vkladka2.setBackground(color);
                        vkladka3.setBackground(color);
                        vkladka4.setBackground(color);
                        vkladka5.setBackground(color);
                    }
                }
        );

        menuItem2.addActionListener(
                new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "   Программа создана для\n   быстрого доступа к ютуб\n   каналам которые по мнению\n   автора являються лучшими.\n                     v. 0.1\n      IntelliJ IDEA 1.8.0_152 ");
                    }
                }
        );



        menuItem3.addActionListener(
                new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "              Niko Papchenko\n                       Sumy\n       ");
                    }
                }
        );



        menuItem4.addActionListener(
                new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(1);
                    }
                }
        );




        Icon iconHomePage = new ImageIcon(getClass().getResource("1.png"));
        JLabel label = new JLabel("THE YOUTUBE TOP");
        label.setFont(fontHomePage);
        JPanel pane = new JPanel();
        JPanel pane2 = new JPanel();
        JPanel pane3 = new JPanel();
        JPanel pane4 = new JPanel();
        vkladka1.add(pane, label);
        vkladka1.add(pane3, label);
        pane.setBackground(Color.RED);
        pane2.setBackground(Color.RED);
        pane3.setBackground(Color.RED);
        pane4.setBackground(Color.RED);
        vkladka1.setLayout(new GridBagLayout());
        vkladka1.add(label);
        vkladka1.add(pane2);
        vkladka1.add(pane4);





        vkladki.addTab("           Главная            ", vkladka1);
        vkladki.addTab("           Наука            ", vkladka2);
        vkladki.addTab("           Спорт            ", vkladka3);
        vkladki.addTab("           Развлечение            ", vkladka4);
    }
}