package calculadora12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UtilidadesMain extends JFrame implements ActionListener {

    Metodos metodos = new Metodos();
    // CalculadoraU
    public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bs, br, bm, bd, bp, bi, bc, bcalcu;
    public JLabel label1;
    public Font fuente1 = new Font("SansSerif", Font.PLAIN, 50);
    public Font fuente2 = new Font("SansSerif", Font.PLAIN, 20);
    public String signo = "", puntox = "", puntoy = "", r = "";

    //Notas
    public JButton bnotas, agregarnot;
    public JScrollPane scrollnot;
    public JTextArea textnot;

    //Convertidor
    public JButton bconve, agregarACal, actualizar;
    public JComboBox longiz, longde, pesoiz, pesode, voliz, volde, sm;
    public JLabel flecha, barraS, xcal, igual, ycal, valorEnCal;
    public float valorCon;
    public Font fuente3 = new Font("SansSerif", Font.PLAIN, 14);
    public Font fuente4 = new Font("SansSerif", Font.PLAIN, 36);
    public Font fuente5 = new Font("Consolas", Font.BOLD, 18);

    public UtilidadesMain() {

        setLayout(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Color grisc = new Color(51, 51, 51);
        Color cla = new Color(165, 165, 165);
        Color azul = new Color(37, 55, 134);
        Color fondo = new Color(26, 26, 26);

        //
        //botones de aplicacion
        //
        bcalcu = new JButton("+-×÷");
        bcalcu.setBounds(10, 10, 75, 70);
        bcalcu.setBackground(fondo);
        bcalcu.setFont(fuente5);
        bcalcu.setForeground(Color.WHITE);
        bcalcu.setBorderPainted(false);
        bcalcu.setFocusPainted(false);
        add(bcalcu);
        bcalcu.addActionListener(this);

        bnotas = new JButton("Notas");
        bnotas.setBounds(10, 90, 75, 70);
        bnotas.setBackground(azul);
        bnotas.setFont(fuente3);
        bnotas.setForeground(Color.WHITE);
        bnotas.setBorderPainted(false);
        bnotas.setFocusPainted(false);
        add(bnotas);
        bnotas.addActionListener(this);

        bconve = new JButton("a↔b");
        bconve.setBounds(10, 170, 75, 70);
        bconve.setBackground(azul);
        bconve.setFont(fuente3);
        bconve.setForeground(Color.WHITE);
        bconve.setBorderPainted(false);
        bconve.setFocusPainted(false);
        add(bconve);
        bconve.addActionListener(this);

        //
        // Notas
        //
        agregarnot = new JButton("Agregar valor de calculadora");
        agregarnot.setBounds(105, 210, 385, 30);
        agregarnot.setVisible(false);
        agregarnot.setBackground(azul);
        agregarnot.setFont(fuente3);
        agregarnot.setForeground(Color.WHITE);
        agregarnot.setBorderPainted(false);
        agregarnot.setFocusPainted(false);
        add(agregarnot);
        agregarnot.addActionListener(this);

        textnot = new JTextArea();
        textnot.setFont(fuente2);
        textnot.setBackground(cla);
        scrollnot = new JScrollPane(textnot);
        scrollnot.setBounds(105, 10, 385, 190);
        scrollnot.setBorder(null);
        scrollnot.setVisible(false);
        add(scrollnot);

        //
        // Calculadora
        //
        b1 = new JButton("1");
        b1.setBounds(105, 90, 75, 30);
        b1.setBackground(grisc);
        b1.setFont(fuente2);
        b1.setForeground(Color.WHITE);
        b1.setBorderPainted(false);
        b1.setFocusPainted(false);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setBounds(190, 90, 75, 30);
        b2.setBackground(grisc);
        b2.setFont(fuente2);
        b2.setForeground(Color.WHITE);
        b2.setBorderPainted(false);
        b2.setFocusPainted(false);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setBounds(275, 90, 75, 30);
        b3.setBackground(grisc);
        b3.setFont(fuente2);
        b3.setForeground(Color.WHITE);
        b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        add(b3);
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.setBounds(105, 130, 75, 30);
        b4.setBackground(grisc);
        b4.setFont(fuente2);
        b4.setForeground(Color.WHITE);
        b4.setBorderPainted(false);
        b4.setFocusPainted(false);
        add(b4);
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setBounds(190, 130, 75, 30);
        b5.setBackground(grisc);
        b5.setFont(fuente2);
        b5.setForeground(Color.WHITE);
        b5.setBorderPainted(false);
        b5.setFocusPainted(false);
        add(b5);
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setBounds(275, 130, 75, 30);
        b6.setBackground(grisc);
        b6.setFont(fuente2);
        b6.setForeground(Color.WHITE);
        b6.setBorderPainted(false);
        b6.setFocusPainted(false);
        add(b6);
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.setBounds(105, 170, 75, 30);
        b7.setBackground(grisc);
        b7.setFont(fuente2);
        b7.setForeground(Color.WHITE);
        b7.setBorderPainted(false);
        b7.setFocusPainted(false);
        add(b7);
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setBounds(190, 170, 75, 30);
        b8.setBackground(grisc);
        b8.setFont(fuente2);
        b8.setForeground(Color.WHITE);
        b8.setBorderPainted(false);
        b8.setFocusPainted(false);
        add(b8);
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setBounds(275, 170, 75, 30);
        b9.setBackground(grisc);
        b9.setFont(fuente2);
        b9.setForeground(Color.WHITE);
        b9.setBorderPainted(false);
        b9.setFocusPainted(false);
        add(b9);
        b9.addActionListener(this);

        b0 = new JButton("0");
        b0.setBounds(105, 210, 245, 30);
        b0.setBackground(grisc);
        b0.setFont(fuente2);
        b0.setForeground(Color.WHITE);
        b0.setBorderPainted(false);
        b0.setFocusPainted(false);
        add(b0);
        b0.addActionListener(this);

        bs = new JButton("+");
        bs.setBounds(360, 130, 60, 30);
        bs.setBackground(azul);
        bs.setFont(fuente2);
        bs.setForeground(Color.WHITE);
        bs.setBorderPainted(false);
        bs.setFocusPainted(false);
        add(bs);
        bs.addActionListener(this);

        br = new JButton("-");
        br.setBounds(360, 170, 60, 30);
        br.setBackground(azul);
        br.setFont(fuente2);
        br.setForeground(Color.WHITE);
        br.setBorderPainted(false);
        br.setFocusPainted(false);
        add(br);
        br.addActionListener(this);

        bm = new JButton("×");
        bm.setBounds(430, 130, 60, 30);
        bm.setBackground(azul);
        bm.setFont(fuente2);
        bm.setForeground(Color.WHITE);
        bm.setBorderPainted(false);
        bm.setFocusPainted(false);
        add(bm);
        bm.addActionListener(this);

        bd = new JButton("÷");
        bd.setBounds(430, 170, 60, 30);
        bd.setBackground(azul);
        bd.setFont(fuente2);
        bd.setForeground(Color.WHITE);
        bd.setBorderPainted(false);
        bd.setFocusPainted(false);
        add(bd);
        bd.addActionListener(this);

        bi = new JButton("=");
        bi.setBounds(430, 210, 60, 30);
        bi.setBackground(azul);
        bi.setFont(fuente2);
        bi.setForeground(Color.WHITE);
        bi.setBorderPainted(false);
        bi.setFocusPainted(false);
        add(bi);
        bi.addActionListener(this);

        bp = new JButton(".");
        bp.setBounds(360, 210, 60, 30);
        bp.setBackground(azul);
        bp.setFont(fuente2);
        bp.setForeground(Color.WHITE);
        bp.setBorderPainted(false);
        bp.setFocusPainted(false);
        add(bp);
        bp.addActionListener(this);

        bc = new JButton("C");
        bc.setBounds(360, 90, 130, 30);
        bc.setBackground(cla);
        bc.setFont(fuente2);
        bc.setBorderPainted(false);
        bc.setFocusPainted(false);
        add(bc);
        bc.addActionListener(this);

        label1 = new JLabel("0");
        label1.setBounds(120, 15, 400, 60);
        label1.setForeground(Color.WHITE);
        label1.setFont(fuente1);
        add(label1);

        //
        // Convertidor
        //
        longiz = new JComboBox();
        longiz.setBounds(105, 10, 150, 30);
        longiz.setVisible(false);
        longiz.setBackground(grisc);
        longiz.setFont(fuente3);
        longiz.setForeground(Color.WHITE);
        longiz.setRequestFocusEnabled(false);
        add(longiz);
        longiz.addItem("  Centímetro (cm)");
        longiz.addItem("  Kilómetro (k)");
        longiz.addItem("  Metro (m)");
        longiz.addItem("  Milla");
        longiz.addItem("  Pie (ft)");
        longiz.addItem("  Pulgada (in)");
        longiz.addItem("  Gramo (g)");
        longiz.addItem("  Kilogramo (kg)");
        longiz.addItem("  Tonelada (t)");
        longiz.addItem("  Onza (oz)");
        longiz.addItem("  Libra (lb)");
        longiz.addItem("  Litro (L)");
        longiz.addItem("  Metro^3 (m^3)");
        longiz.addItem("  Galón EUA (gal)");

        longde = new JComboBox();
        longde.setBounds(340, 10, 150, 30);
        longde.setVisible(false);
        longde.setBackground(grisc);
        longde.setFont(fuente3);
        longde.setForeground(Color.WHITE);
        longde.setRequestFocusEnabled(false);
        add(longde);
        longde.addItem("  Centímetro (cm)");
        longde.addItem("  Kilómetro (k)");
        longde.addItem("  Metro (m)");
        longde.addItem("  Milla");
        longde.addItem("  Pie (ft)");
        longde.addItem("  Pulgada (in)");
        longde.addItem("  Gramo (g)");
        longde.addItem("  Kilogramo (kg)");
        longde.addItem("  Tonelada (t)");
        longde.addItem("  Onza (oz)");
        longde.addItem("  Libra (lb)");
        longde.addItem("  Litro (L)");
        longde.addItem("  Metro^3 (m^3)");
        longde.addItem("  Galón EUA (gal)");

        actualizar = new JButton("Actualizar");
        actualizar.setBounds(105, 210, 385, 30);
        actualizar.setVisible(false);
        actualizar.setBackground(azul);
        actualizar.setFont(fuente3);
        actualizar.setForeground(Color.WHITE);
        actualizar.setBorderPainted(false);
        actualizar.setFocusPainted(false);
        add(actualizar);
        actualizar.addActionListener(this);

        agregarACal = new JButton("Añadir valor");
        agregarACal.setBounds(340, 170, 150, 30);
        agregarACal.setVisible(false);
        agregarACal.setBackground(cla);
        agregarACal.setFont(fuente3);
        agregarACal.setEnabled(false);
        agregarACal.setBorderPainted(false);
        agregarACal.setFocusPainted(false);
        add(agregarACal);
        agregarACal.addActionListener(this);

        flecha = new JLabel("↔");
        flecha.setBounds(273, 10, 50, 30);
        flecha.setVisible(false);
        flecha.setFont(fuente4);
        flecha.setForeground(Color.WHITE);
        add(flecha);

        barraS = new JLabel("1               =    1");
        barraS.setBounds(115, 60, 450, 30);
        barraS.setVisible(false);
        barraS.setFont(fuente4);
        barraS.setForeground(Color.WHITE);
        add(barraS);

        valorEnCal = new JLabel("Valor en calculadora");
        valorEnCal.setBounds(115, 170, 150, 30);
        valorEnCal.setVisible(false);
        valorEnCal.setFont(fuente3);
        valorEnCal.setForeground(Color.WHITE);
        add(valorEnCal);

        igual = new JLabel("=");
        igual.setBounds(285, 110, 30, 50);
        igual.setVisible(false);
        igual.setFont(fuente4);
        igual.setForeground(Color.WHITE);
        add(igual);

        xcal = new JLabel(String.valueOf(metodos.x));
        xcal.setBounds(115, 110, 150, 50);
        xcal.setVisible(false);
        xcal.setFont(fuente4);
        xcal.setForeground(Color.WHITE);
        add(xcal);

        ycal = new JLabel(String.valueOf(metodos.x));
        ycal.setBounds(345, 110, 145, 50);
        ycal.setVisible(false);
        ycal.setFont(fuente4);
        ycal.setForeground(Color.WHITE);
        add(ycal);

    }

    public void actionPerformed(ActionEvent e) {

        //
        //Botones principales
        //
        if (e.getSource() == bcalcu) {
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);
            b0.setVisible(true);
            bs.setVisible(true);
            br.setVisible(true);
            bm.setVisible(true);
            bd.setVisible(true);
            bc.setVisible(true);
            bp.setVisible(true);
            bi.setVisible(true);
            label1.setVisible(true);
            bcalcu.setBackground(new Color(26, 26, 26));
            longiz.setVisible(false);
            longde.setVisible(false);
            actualizar.setVisible(false);
            agregarACal.setVisible(false);
            flecha.setVisible(false);
            barraS.setVisible(false);
            valorEnCal.setVisible(false);
            igual.setVisible(false);
            xcal.setVisible(false);
            ycal.setVisible(false);
            bconve.setBackground(new Color(37, 55, 134));
            agregarnot.setVisible(false);
            scrollnot.setVisible(false);
            bnotas.setBackground(new Color(37, 55, 134));
        }

        if (e.getSource() == bnotas) {
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            b6.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);
            b0.setVisible(false);
            bs.setVisible(false);
            br.setVisible(false);
            bm.setVisible(false);
            bd.setVisible(false);
            bc.setVisible(false);
            bp.setVisible(false);
            bi.setVisible(false);
            label1.setVisible(false);
            bcalcu.setBackground(new Color(37, 55, 134));
            longiz.setVisible(false);
            longde.setVisible(false);
            actualizar.setVisible(false);
            agregarACal.setVisible(false);
            flecha.setVisible(false);
            barraS.setVisible(false);
            valorEnCal.setVisible(false);
            igual.setVisible(false);
            xcal.setVisible(false);
            ycal.setVisible(false);
            bconve.setBackground(new Color(37, 55, 134));
            agregarnot.setVisible(true);
            scrollnot.setVisible(true);
            bnotas.setBackground(new Color(26, 26, 26));
        }

        if (e.getSource() == bconve) {
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            b6.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);
            b0.setVisible(false);
            bs.setVisible(false);
            br.setVisible(false);
            bm.setVisible(false);
            bd.setVisible(false);
            bc.setVisible(false);
            bp.setVisible(false);
            bi.setVisible(false);
            label1.setVisible(false);
            bcalcu.setBackground(new Color(37, 55, 134));
            longiz.setVisible(true);
            longde.setVisible(true);
            actualizar.setVisible(true);
            agregarACal.setVisible(true);
            flecha.setVisible(true);
            barraS.setVisible(true);
            valorEnCal.setVisible(true);
            igual.setVisible(true);
            xcal.setVisible(true);
            ycal.setVisible(true);
            bconve.setBackground(new Color(26, 26, 26));
            agregarnot.setVisible(false);
            scrollnot.setVisible(false);
            bnotas.setBackground(new Color(37, 55, 134));
        }

        //
        // Notas
        //
        if (e.getSource() == agregarnot) {
            textnot.append(String.valueOf(metodos.x) + " ");
        }

        //
        // Convertidor
        //
        String medidaiz = longiz.getSelectedItem().toString();
        String medidade = longde.getSelectedItem().toString();
        float conx = metodos.x;

        if (medidaiz.equals("  Centímetro (cm)")) {
            if (medidade.equals("  Centímetro (cm)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Kilómetro (k)")) {
                conx = metodos.x / 100000;
                barraS.setText("1               =    0.00001");
            } else if (medidade.equals("  Metro (m)")) {
                conx = metodos.x / 100;
                barraS.setText("1               =    0.01");
            } else if (medidade.equals("  Milla")) {
                conx = metodos.x / 160934;
                barraS.setText("1               =    0.000006");
            } else if (medidade.equals("  Pie (ft)")) {
                conx = metodos.x / 3048 * 100;
                barraS.setText("1               =    0.032808");
            } else if (medidade.equals("  Pulgada (in)")) {
                conx = metodos.x / 254 * 100;
                barraS.setText("1               =    0.3937");
            } else if (medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)") || medidade.equals("  Litro (L)")
                    || medidade.equals("  Metro^3 (m^3)") || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Kilómetro (k)")) {
            if (medidade.equals("  Centímetro (cm)")) {
                conx = metodos.x * 100000;
                barraS.setText("1               =    100000");
            } else if (medidade.equals("  Kilómetro (k)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Metro (m)")) {
                conx = metodos.x * 1000;
                barraS.setText("1               =    1000");
            } else if (medidade.equals("  Milla")) {
                conx = metodos.x * 621 / 1000;
                barraS.setText("1               =    0.621");
            } else if (medidade.equals("  Pie (ft)")) {
                conx = metodos.x * 328083 / 100;
                barraS.setText("1               =    3280.83");
            } else if (medidade.equals("  Pulgada (in)")) {
                conx = metodos.x * 3937008 / 100;
                barraS.setText("1               =    39370.08");
            } else if (medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)") || medidade.equals("  Litro (L)")
                    || medidade.equals("  Metro^3 (m^3)") || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Metro (m)")) {
            if (medidade.equals("  Centímetro (cm)")) {
                conx = metodos.x * 100;
                barraS.setText("1               =    100");
            } else if (medidade.equals("  Kilómetro (k)")) {
                conx = metodos.x / 1000;
                barraS.setText("1               =    .001");
            } else if (medidade.equals("  Metro (m)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Milla")) {
                conx = metodos.x * 621 / 1000000;
                barraS.setText("1               =    0.000621");
            } else if (medidade.equals("  Pie (ft)")) {
                conx = metodos.x * 328083 / 100000;
                barraS.setText("1               =    3.2808");
            } else if (medidade.equals("  Pulgada (in)")) {
                conx = metodos.x * 3937 / 100;
                barraS.setText("1               =    39.37");
            } else if (medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)") || medidade.equals("  Litro (L)")
                    || medidade.equals("  Metro^3 (m^3)") || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Milla")) {
            if (medidade.equals("  Centímetro (cm)")) {
                conx = metodos.x * 1609344 / 10;
                barraS.setText("1               =    160934.4");
            } else if (medidade.equals("  Kilómetro (k)")) {
                conx = metodos.x * 1609 / 1000;
                barraS.setText("1               =    1.609");
            } else if (medidade.equals("  Metro (m)")) {
                conx = metodos.x * 1609;
                barraS.setText("1               =    1609");
            } else if (medidade.equals("  Milla")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Pie (ft)")) {
                conx = metodos.x * 5280;
                barraS.setText("1               =    5280");
            } else if (medidade.equals("  Pulgada (in)")) {
                conx = metodos.x * 63360;
                barraS.setText("1               =    63360");
            } else if (medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)") || medidade.equals("  Litro (L)")
                    || medidade.equals("  Metro^3 (m^3)") || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Pie (ft)")) {
            if (medidade.equals("  Centímetro (cm)")) {
                conx = metodos.x * 3048 / 100;
                barraS.setText("1               =    30.48");
            } else if (medidade.equals("  Kilómetro (k)")) {
                conx = metodos.x * 305 / 1000000;
                barraS.setText("1               =    0.000305");
            } else if (medidade.equals("  Metro (m)")) {
                conx = metodos.x * 3048 / 10000;
                barraS.setText("1               =    0.3048");
            } else if (medidade.equals("  Milla")) {
                conx = metodos.x * 189 / 1000000;
                barraS.setText("1               =    0.000189");
            } else if (medidade.equals("  Pie (ft)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Pulgada (in)")) {
                conx = metodos.x * 12;
                barraS.setText("1               =    12");
            } else if (medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)") || medidade.equals("  Litro (L)")
                    || medidade.equals("  Metro^3 (m^3)") || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Pulgada (in)")) {
            if (medidade.equals("  Centímetro (cm)")) {
                conx = metodos.x * 254 / 100;
                barraS.setText("1               =    2.54");
            } else if (medidade.equals("  Kilómetro (k)")) {
                conx = metodos.x * 25 / 1000000;
                barraS.setText("1               =    0.000025");
            } else if (medidade.equals("  Metro (m)")) {
                conx = metodos.x * 254 / 10000;
                barraS.setText("1               =    0.0254");
            } else if (medidade.equals("  Milla")) {
                conx = metodos.x * 16 / 1000000;
                barraS.setText("1               =    0.000016");
            } else if (medidade.equals("  Pie (ft)")) {
                conx = metodos.x * 8333 / 100000;
                barraS.setText("1               =    0.08333");
            } else if (medidade.equals("  Pulgada (in)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)") || medidade.equals("  Litro (L)")
                    || medidade.equals("  Metro^3 (m^3)") || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        }

        if (medidaiz.equals("  Gramo (g)")) {
            if (medidade.equals("  Gramo (g)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Kilogramo (kg)")) {
                conx = metodos.x / 1000;
                barraS.setText("1               =    0.001");
            } else if (medidade.equals("  Tonelada (t)")) {
                conx = metodos.x / 1000000;
                barraS.setText("1               =    0.000001");
            } else if (medidade.equals("  Onza (oz)")) {
                conx = metodos.x * 3527 / 100000;
                barraS.setText("1               =    0.03527");
            } else if (medidade.equals("  Libra (lb)")) {
                conx = metodos.x * 22 / 10000;
                barraS.setText("1               =    0.0022");
            } else if (medidade.equals("  Centímetro (cm)") || medidade.equals("  Kilómetro (k)")
                    || medidade.equals("  Metro (m)") || medidade.equals("  Milla")
                    || medidade.equals("  Pie (ft)") || medidade.equals("  Pulgada (in)")
                    || medidade.equals("  Litro (L)") || medidade.equals("  Metro^3 (m^3)")
                    || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Kilogramo (kg)")) {
            if (medidade.equals("  Gramo (g)")) {
                conx = metodos.x * 1000;
                barraS.setText("1               =    1000");
            } else if (medidade.equals("  Kilogramo (kg)")) {
                conx = metodos.x;
                barraS.setText("1               =    0.001");
            } else if (medidade.equals("  Tonelada (t)")) {
                conx = metodos.x / 1000;
                barraS.setText("1               =    0.001");
            } else if (medidade.equals("  Onza (oz)")) {
                conx = metodos.x * 352739 / 10000;
                barraS.setText("1               =    35.2739");
            } else if (medidade.equals("  Libra (lb)")) {
                conx = metodos.x * 22046 / 10000;
                barraS.setText("1               =    2.2046");
            } else if (medidade.equals("  Centímetro (cm)") || medidade.equals("  Kilómetro (k)")
                    || medidade.equals("  Metro (m)") || medidade.equals("  Milla")
                    || medidade.equals("  Pie (ft)") || medidade.equals("  Pulgada (in)")
                    || medidade.equals("  Litro (L)") || medidade.equals("  Metro^3 (m^3)")
                    || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Tonelada (t)")) {
            if (medidade.equals("  Gramo (g)")) {
                conx = metodos.x * 1000000;
                barraS.setText("1               =    1000000");
            } else if (medidade.equals("  Kilogramo (kg)")) {
                conx = metodos.x * 1000;
                barraS.setText("1               =    1000");
            } else if (medidade.equals("  Tonelada (t)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Onza (oz)")) {
                conx = metodos.x * 35273;
                barraS.setText("1               =    35273");
            } else if (medidade.equals("  Libra (lb)")) {
                conx = metodos.x * 220462 / 100;
                barraS.setText("1               =    2204.62");
            } else if (medidade.equals("  Centímetro (cm)") || medidade.equals("  Kilómetro (k)")
                    || medidade.equals("  Metro (m)") || medidade.equals("  Milla")
                    || medidade.equals("  Pie (ft)") || medidade.equals("  Pulgada (in)")
                    || medidade.equals("  Litro (L)") || medidade.equals("  Metro^3 (m^3)")
                    || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Onza (oz)")) {
            if (medidade.equals("  Gramo (g)")) {
                conx = metodos.x * 28345 / 1000;
                barraS.setText("1               =    28.345");
            } else if (medidade.equals("  Kilogramo (kg)")) {
                conx = metodos.x * 28345 / 1000000;
                barraS.setText("1               =    0.02835");
            } else if (medidade.equals("  Tonelada (t)")) {
                conx = metodos.x * 28345 / 1000000000;
                barraS.setText("1               =    0.000028");
            } else if (medidade.equals("  Onza (oz)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Libra (lb)")) {
                conx = metodos.x * 625 / 10000;
                barraS.setText("1               =    0.0625");
            } else if (medidade.equals("  Centímetro (cm)") || medidade.equals("  Kilómetro (k)")
                    || medidade.equals("  Metro (m)") || medidade.equals("  Milla")
                    || medidade.equals("  Pie (ft)") || medidade.equals("  Pulgada (in)")
                    || medidade.equals("  Litro (L)") || medidade.equals("  Metro^3 (m^3)")
                    || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Libra (lb)")) {
            if (medidade.equals("  Gramo (g)")) {
                conx = metodos.x * 4535924 / 10000;
                barraS.setText("1               =    453.5924");
            } else if (medidade.equals("  Kilogramo (kg)")) {
                conx = metodos.x * 4535924 / 10000000;
                barraS.setText("1               =    0.45359");
            } else if (medidade.equals("  Tonelada (t)")) {
                conx = metodos.x * 453592 / 1000000000;
                barraS.setText("1               =    0.000453");
            } else if (medidade.equals("  Onza (oz)")) {
                conx = metodos.x * 16;
                barraS.setText("1               =    16");
            } else if (medidade.equals("  Libra (lb)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Centímetro (cm)") || medidade.equals("  Kilómetro (k)")
                    || medidade.equals("  Metro (m)") || medidade.equals("  Milla")
                    || medidade.equals("  Pie (ft)") || medidade.equals("  Pulgada (in)")
                    || medidade.equals("  Litro (L)") || medidade.equals("  Metro^3 (m^3)")
                    || medidade.equals("  Galón EUA (gal)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        }

        if (medidaiz.equals("  Litro (L)")) {
            if (medidade.equals("  Litro (L)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Metro^3 (m^3)")) {
                conx = metodos.x / 1000;
                barraS.setText("1               =    0.001");
            } else if (medidade.equals("  Galón EUA (gal)")) {
                conx = metodos.x * 264172 / 1000000;
                barraS.setText("1               =    0.264172");
            } else if (medidade.equals("  Centímetro (cm)") || medidade.equals("  Kilómetro (k)")
                    || medidade.equals("  Metro (m)") || medidade.equals("  Milla")
                    || medidade.equals("  Pie (ft)") || medidade.equals("  Pulgada (in)")
                    || medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Metro^3 (m^3)")) {
            if (medidade.equals("  Litro (L)")) {
                conx = metodos.x * 1000;
                barraS.setText("1               =    1000");
            } else if (medidade.equals("  Metro^3 (m^3)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Galón EUA (gal)")) {
                conx = metodos.x * 2641721 / 10000;
                barraS.setText("1               =    264.1721");
            } else if (medidade.equals("  Centímetro (cm)") || medidade.equals("  Kilómetro (k)")
                    || medidade.equals("  Metro (m)") || medidade.equals("  Milla")
                    || medidade.equals("  Pie (ft)") || medidade.equals("  Pulgada (in)")
                    || medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        } else if (medidaiz.equals("  Galón EUA (gal)")) {
            if (medidade.equals("  Litro (L)")) {
                conx = metodos.x * 37854 / 10000;
                barraS.setText("1               =    3.7854");
            } else if (medidade.equals("  Metro^3 (m^3)")) {
                conx = metodos.x * 37854 / 10000000;
                barraS.setText("1               =    0.003785");
            } else if (medidade.equals("  Galón EUA (gal)")) {
                conx = metodos.x;
                barraS.setText("1               =    1");
            } else if (medidade.equals("  Centímetro (cm)") || medidade.equals("  Kilómetro (k)")
                    || medidade.equals("  Metro (m)") || medidade.equals("  Milla")
                    || medidade.equals("  Pie (ft)") || medidade.equals("  Pulgada (in)")
                    || medidade.equals("  Gramo (g)") || medidade.equals("  Kilogramo (kg)")
                    || medidade.equals("  Tonelada (t)") || medidade.equals("  Onza (oz)")
                    || medidade.equals("  Libra (lb)")) {
                conx = 0;
                barraS.setText("      No convertible");
            }
        }

        if (e.getSource() == actualizar) {
            if (conx == 0) {
                agregarACal.setEnabled(false);
            } else {
                agregarACal.setEnabled(true);
            }
            xcal.setText(String.valueOf(metodos.x));
            ycal.setText(String.valueOf(conx));
        }

        if (e.getSource() == agregarACal) {
            metodos.x = conx;
            label1.setText(String.valueOf(metodos.x));
        }

        //
        // Calculadora
        //
        if (e.getSource() == bp && metodos.y == 0 && signo == "") {
            puntox = ".";
        } else if (e.getSource() == bp && metodos.y != 0) {
            puntoy = ".";
        } else if (e.getSource() == bp && metodos.y == 0) {
            puntoy = ".";
        }

        if (e.getSource() == br && metodos.x == 0 && signo == "") {
            r = "-";
            label1.setText("-");
        }

        if (e.getSource() == bs) {
            signo = "+";
            metodos.y = 0;
            label1.setText("+");
        }

        if (e.getSource() == br && metodos.x != 0) {
            signo = "-";
            metodos.y = 0;
            label1.setText("-");
        }

        if (e.getSource() == bd) {
            signo = "/";
            metodos.y = 0;
            label1.setText("÷");
        }

        if (e.getSource() == bm) {
            signo = "*";
            metodos.y = 0;
            label1.setText("×");
        }

        if (signo == "" && r == "") {
            if (puntox == ".") {    // x flotante positivo
                if (e.getSource() == b1) { metodos.bxp(1); label1.setText(String.valueOf(metodos.x));} 
                else if (e.getSource() == b2) { metodos.bxp(2); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b3) { metodos.bxp(3); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b4) { metodos.bxp(4); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b5) { metodos.bxp(5); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b6) { metodos.bxp(6); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b7) { metodos.bxp(7); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b8) { metodos.bxp(8); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b9) { metodos.bxp(9); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b0) { metodos.bxp0(); label1.setText(String.valueOf(metodos.x));}

            } else {                // x entero positivo
                if (e.getSource() == b1) { metodos.bx(1); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b2) { metodos.bx(2); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b3) { metodos.bx(3); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b4) { metodos.bx(4); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b5) { metodos.bx(5); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b6) { metodos.bx(6); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b7) { metodos.bx(7); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b8) { metodos.bx(8); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b9) { metodos.bx(9); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b0) { metodos.bx0(); label1.setText(String.valueOf(metodos.x));}
            }

        } else if (signo == "" && r == "-") {
            if (puntox == ".") {    // x flotante negativo
                if (e.getSource() == b1) { metodos.bxnp(1); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b2) { metodos.bxnp(2); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b3) { metodos.bxnp(3); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b4) { metodos.bxnp(4); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b5) { metodos.bxnp(5); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b6) { metodos.bxnp(6); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b7) { metodos.bxnp(7); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b8) { metodos.bxnp(8); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b9) { metodos.bxnp(9); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b0) { metodos.bxnp0(); label1.setText(String.valueOf(metodos.x));}

            } else {                // x entero positivo
                if (e.getSource() == b1) { metodos.bxn(1); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b2) { metodos.bxn(2); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b3) { metodos.bxn(3); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b4) { metodos.bxn(4); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b5) { metodos.bxn(5); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b6) { metodos.bxn(6); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b7) { metodos.bxn(7); label1.setText(String.valueOf(metodos.x));} 
                else if (e.getSource() == b8) { metodos.bxn(8); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b9) { metodos.bxn(9); label1.setText(String.valueOf(metodos.x));}
                else if (e.getSource() == b0) { metodos.bxn0(); label1.setText(String.valueOf(metodos.x));}
            }

        } else if (signo != "") {
            if (puntoy == ".") {    // y flotante
                if (e.getSource() == b1) { metodos.byp(1); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b2) { metodos.byp(2); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b3) { metodos.byp(3); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b4) { metodos.byp(4); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b5) { metodos.byp(5); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b6) { metodos.byp(6); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b7) { metodos.byp(7); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b8) { metodos.byp(8); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b9) { metodos.byp(9); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b0) { metodos.byp0(); label1.setText(String.valueOf(metodos.y));}

            } else {                // y entero
                if (e.getSource() == b1) { metodos.by(1); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b2) { metodos.by(2); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b3) { metodos.by(3); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b4) { metodos.by(4); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b5) { metodos.by(5); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b6) { metodos.by(6); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b7) { metodos.by(7); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b8) { metodos.by(8); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b9) { metodos.by(9); label1.setText(String.valueOf(metodos.y));}
                else if (e.getSource() == b0) { metodos.by0(); label1.setText(String.valueOf(metodos.y));}
            }
        }

        if (e.getSource() == bi) {
            metodos.py = 10;
            puntoy = "";

            if (signo == "+") {
                metodos.x = metodos.x + metodos.y;
                label1.setText(String.valueOf(metodos.x));
            } else if (signo == "-") {
                metodos.x = metodos.x - metodos.y;
                label1.setText(String.valueOf(metodos.x));
            } else if (signo == "/") {
                metodos.x = metodos.x / metodos.y;
                label1.setText(String.valueOf(metodos.x));
            } else if (signo == "*") {
                metodos.x = metodos.x * metodos.y;
                label1.setText(String.valueOf(metodos.x));
            }
        }

        if (e.getSource() == bc) {
            metodos.x = 0;
            metodos.y = 0;
            metodos.px = 10;
            metodos.py = 10;
            metodos.pxn = 10;
            signo = "";
            puntox = "";
            puntoy = "";
            r = "";
            label1.setText(String.valueOf(metodos.x));
        }
    }

    public static void main(String[] args) {

        UtilidadesMain interfaz = new UtilidadesMain();
        Color fondo = new Color(26, 26, 26);

        interfaz.setBounds(0, 0, 507, 285);
        interfaz.getContentPane().setBackground(fondo);
        interfaz.setTitle("Calculadora"); // v1.12
        interfaz.setVisible(true);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
    }
}
