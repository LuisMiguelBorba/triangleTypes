package luis;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Funcoes {

    public JLabel labels(String txt, int x, int y, int width, int height){
        JLabel label = new JLabel();
        label.setBounds(x, y, width, height);
        label.setText(txt);
        return label;
    }

    public String areaT(String A, String B, String C){
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(s);

        DecimalFormat df = new DecimalFormat("#.####");
        String areaTotal = df.format(area);
        System.out.println(areaTotal);
        return  areaTotal;
    }

    public JButton botao(int x, int y, int width, int height){
        JButton botao = new JButton();
        botao.setBounds(x, y, width, height);
        return botao;
    }

    public JButton botao(String txt,int  x, int y, int width, int height){
        JButton botao = new JButton();
        botao.setBounds(x, y, width, height);
        botao.setText(txt);
        return botao;
    }

    public JTextArea txtarea(int x, int y, int width, int height){
        JTextArea areaTxt = new JTextArea();
        areaTxt.setBounds(x, y, width, height);
        return areaTxt;
    }

    public ArrayList tipoTriangulo(String A, String B, String C){
        double a = Double.parseDouble(A);
        double b = Double.parseDouble(B);
        double c = Double.parseDouble(C);
        List<String> txt = new ArrayList<>();

        if(a>=b+c){
            txt.add("Nao forma");
        }
        else{
            if(Math.pow(a,2) == Math.pow(b,2)+Math.pow(c,2)){
                txt.add("RETANGULO");
            }
            if (Math.pow(a,2)> Math.pow(b,2)+Math.pow(c,2)){
                txt.add("OBTUSANGULO");
            }
            if (Math.pow(a,2)< Math.pow(b,2)+Math.pow(c,2)){
                txt.add("ACUTANGULO");
            }
            if(a==b && a ==c && b==c){
                txt.add("EQUILATERO");
            }

            if(a==b| b==c){
                txt.add("ISOSCELES");
            }
        }
        return (ArrayList) txt;
    }
}
