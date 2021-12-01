package br.senai.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.arquivo.Arquivo;
import br.senai.arquivo.Texto;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JFrameArquivo extends JFrame {

	private JPanel contentPane;
	int posicao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameArquivo frame = new JFrameArquivo();
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
	public JFrameArquivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 85, 343, 110);
		contentPane.add(textPane);
		
		JLabel lblArquivo = new JLabel("ARQUIVO");
		lblArquivo.setForeground(Color.WHITE);
		lblArquivo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblArquivo.setBounds(10, 11, 92, 25);
		contentPane.add(lblArquivo);
		
		JLabel lblNewLabel = new JLabel("TEXTO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGravar.setBounds(10, 206, 123, 31);
		contentPane.add(btnGravar);
		
		
		JButton btnNewButton = new JButton("LIMPAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(230, 206, 123, 31);
		contentPane.add(btnNewButton);
		
		btnGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Texto texto = new Texto();
				texto.setTextinho(textPane.getText());
				posicao ++;

				
			
				
			}
		});
		
		
	}
}
