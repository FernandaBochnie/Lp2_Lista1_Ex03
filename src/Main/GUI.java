

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    private Container cp;
    
    private JPanel pnCentro = new JPanel();
    
    private JLabel lbAno = new JLabel("Ano de Nascimento");
    
    private JTextField tfAnoNascimento = new JTextField();
    
    private JLabel lbIdade = new JLabel("Idade");
    private JLabel lbIdadePessoa = new JLabel();
    private JLabel lbVotar = new JLabel("Pode Votar?");
    private JLabel lbPodeVotar = new JLabel();
    private JLabel lbDirigir = new JLabel("Pode Dirigir?");
    private JLabel lbPodeDirigir = new JLabel();
    
    private JButton btCalcular = new JButton("Calcular");
    
    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("GUI");
        
        cp.add(pnCentro, BorderLayout.CENTER);
        pnCentro.setLayout(new GridLayout(5,2));
        
        pnCentro.add(lbAno);
        pnCentro.add(tfAnoNascimento);
        
        pnCentro.add(lbIdade);
        pnCentro.add(lbIdadePessoa);
        
        pnCentro.add(lbVotar);
        pnCentro.add(lbPodeVotar);
        
        pnCentro.add(lbDirigir);
        pnCentro.add(lbPodeDirigir);
        
        pnCentro.add(btCalcular);
        
        btCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Entidade entidade = new Entidade();
                
                entidade.setAno(Integer.valueOf(tfAnoNascimento.getText()));
                
                lbIdadePessoa.setText(String.valueOf(entidade.getIdade()));
                lbPodeVotar.setText(String.valueOf(entidade.getVotar()));
                lbPodeDirigir.setText(String.valueOf(entidade.getDirigir()));
            }
        });
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
