package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {

		public void criarTela (){
			
			
			JFrame telaRetangulo = new JFrame();
			telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			telaRetangulo.setSize(500, 300);
			telaRetangulo.setTitle(" Cálculos com retângulo");
			telaRetangulo.setLayout(null);
			
			//*** Criar um Label 
			
			JLabel labelAltura = new JLabel ();
			labelAltura.setText("Altura:"); 
			
			//*** Definir a posição e tamanho do label (x,y,width,height)
			labelAltura.setBounds(10, 10, 80, 30);
			
			
			//*** Criar TextField
			JTextField fieldAltura = new JTextField();
			fieldAltura.setBounds(90, 10, 100, 30);
			
			//*** Criar label e textfield da base
			JLabel labelBase = new JLabel();
			labelBase.setText("Base:");
			labelBase.setBounds(10, 45, 80, 30);
			
			JTextField fieldBase = new JTextField();
			fieldBase.setBounds(90, 45, 100, 30);
			
			
				//*** Criar Button
			
			JButton buttonCalcular = new JButton();
			buttonCalcular.setText("Calcular");
			Color laranja = new Color(255,128,0);
			buttonCalcular.setBackground(laranja);
			buttonCalcular.setBounds(10, 95, 180, 30);

			//*** Colocar label alrura dentro 
			//***  do painel de conteudo  - Content Pane	
				
				
			telaRetangulo.getContentPane().add(labelBase);
			telaRetangulo.getContentPane().add(fieldBase);
			telaRetangulo.getContentPane().add(labelAltura);
			telaRetangulo.getContentPane().add(fieldAltura);
			telaRetangulo.getContentPane().add(buttonCalcular);	
			telaRetangulo.setVisible(true);
			
			
			
			//*** Cliques da tela 
			
			buttonCalcular.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					Retangulo r = new Retangulo();
					r.setAltura(Double.parseDouble(fieldAltura.getText()));
					r.setBase(Double.parseDouble(fieldBase.getText()));
					
					labelAltura.setText(String.valueOf(r.calcularArea()));
					labelBase.setText(String.valueOf(r.calcularArea()));
				}
			});
					
		}	
}
