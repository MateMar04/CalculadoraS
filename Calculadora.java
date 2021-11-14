import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora extends javax.swing.JFrame {
    private JPanel panel1;
    private JTextField tfNumero1;
    private JTextField tfNumero2;
    private JButton bMas;
    private JButton bMenos;
    private JButton bPor;
    private JButton bClear;
    private JButton bDividir;
    private JButton bPromedio;
    private JButton bPunto;
    private JButton bSetNumero1;
    private JButton bSetNumero2;
    private JLabel lbResultado;
    private JButton bSiete;
    private JButton bOcho;
    private JButton bNueve;
    private JButton bCuatro;
    private JButton bCinco;
    private JButton bSeis;
    private JButton bTres;
    private JButton bDos;
    private JButton bUno;
    private JButton bCero;
    private JTextField tfResultado;
    private JButton ansButton;

    private double numero1;
    private double numero2;
    private double resultado;
    private double resultadoAnterior;

    public Calculadora() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        setSize(500, 400);
        setResizable(false);
        bCero.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 0);
            }
        });
        bUno.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 1);
            }
        });
        bDos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 2);
            }
        });
        bTres.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 3);
            }
        });
        bCuatro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 4);
            }
        });
        bCinco.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 5);
            }
        });
        bSeis.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 6);
            }
        });
        bSiete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 7);
            }
        });
        bOcho.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 8);
            }
        });
        bNueve.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + 9);
            }
        });

        bPunto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tfResultado.setText(tfResultado.getText() + ".");
            }
        });

        bSetNumero1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numero1 = Double.parseDouble(tfResultado.getText());
                tfResultado.setText("");
                tfNumero1.setText(String.valueOf(numero1));
            }
        });
        bSetNumero2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numero2 = Double.parseDouble(tfResultado.getText());
                tfResultado.setText("");
                tfNumero2.setText(String.valueOf(numero2));
            }
        });
    }
}
