package source;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formulario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario frame = new formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Horas - Minutos y Segundos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(64, 27, 248, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa la cantidad de d\u00EDas:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(64, 68, 165, 18);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(239, 68, 57, 18);
		contentPane.add(spinner);
		JLabel lblHoras = new JLabel("Horas:");
		lblHoras.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHoras.setBounds(64, 143, 66, 18);
		contentPane.add(lblHoras);
		
		JLabel lblMinutos = new JLabel("Minutos:");
		lblMinutos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMinutos.setBounds(64, 185, 77, 18);
		contentPane.add(lblMinutos);
		
		JLabel lblSegundos = new JLabel("Segundos:");
		lblSegundos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSegundos.setBounds(65, 222, 89, 18);
		contentPane.add(lblSegundos);
		
		JLabel resultado = new JLabel("");
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		resultado.setBounds(10, 294, 330, 14);
		contentPane.add(resultado);
		
		JLabel txtHora = new JLabel("");
		txtHora.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtHora.setBounds(171, 147, 141, 14);
		contentPane.add(txtHora);
		
		JLabel txtMinuto = new JLabel("");
		txtMinuto.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtMinuto.setBounds(171, 189, 141, 14);
		contentPane.add(txtMinuto);
		
		JLabel txtSegundo = new JLabel("");
		txtSegundo.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSegundo.setBounds(171, 226, 141, 14);
		contentPane.add(txtSegundo);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Integer myint = (Integer) spinner.getValue();
				int num1 = myint;
				
				txtHora.setText((num1 * 24)+ "");
				txtMinuto.setText((num1 * 1440)+ "");
				txtSegundo.setText((num1 * 86400)+ "");
				
				resultado.setText(num1 + " dias tienen "+ (num1*24) + " horas = " + (num1*1440) + " minutos = " + (num1*86400) + " segundos" );


			    
			    
			}
		});
		btnNewButton.setBounds(128, 97, 89, 23);
		contentPane.add(btnNewButton);
		

	}
}
