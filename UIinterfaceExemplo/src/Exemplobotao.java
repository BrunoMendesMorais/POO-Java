import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exemplobotao {
	public static void main(String[] args) {
		JFrame janela=new JFrame("Exemplo");
		JButton botao=new JButton("Clique aqui");
		
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Teste");
				JOptionPane.showMessageDialog(janela,"clicando");
			}
			
		});
		botao.addActionListener(e->JOptionPane.showMessageDialog(janela,"clicando"));
		
		janela.add(botao);
		janela.setSize(300,200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
