package luis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        JFrame frame = new JFrame();
        JPanel painel = new JPanel();

        frame.setSize(300,300);
        painel.setSize(300,300);
        painel.setLayout(null);

        JTextArea a = funcoes.txtarea(32,10,66,19);
        JTextArea b = funcoes.txtarea(32,32,66,19);
        JTextArea c = funcoes.txtarea(32,54,66,19);

        painel.add(a);
        painel.add(b);
        painel.add(c);

        JLabel res = funcoes.labels("",10,80,111,11);
        painel.add(res);

        painel.add(funcoes.labels("A: ",10,10,22,22));//a
        painel.add(funcoes.labels("B: ",10,32,22,22));//b
        painel.add(funcoes.labels("C: ",10,54,22,22));//c

        JButton botao1 =  funcoes.botao("TIPO",110,10,66,19);
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String A = a.getText();
                String B = b.getText();
                String C = c.getText();
                String d = String.valueOf(funcoes.tipoTriangulo(A,B,C));
                System.out.println(d instanceof String);
                res.setText(d);

                a.setText(null);
                b.setText(null);
                c.setText(null);
            }
        });
        painel.add(botao1);

        JButton botao2 = funcoes.botao("AREA", 110,32,66,19);
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String A = a.getText();
                String B = b.getText();
                String C = c.getText();

                res.setText("Area total: "+funcoes.areaT(A,B,C));

                a.setText(null);
                b.setText(null);
                c.setText(null);

            }
        });
        painel.add(botao2);

        frame.add(painel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}