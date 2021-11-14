import javax.swing.*;

public class Calculadora extends javax.swing.JFrame{
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
    private JButton bIgual;
    private JButton bSetNumero1;
    private JButton bSetNumero2;
    private JLabel lbResultado;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a0Button;

    public Calculadora() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        setSize(500, 400);
        setResizable(false);
    }
}
