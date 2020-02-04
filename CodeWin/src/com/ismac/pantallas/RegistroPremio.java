package com.ismac.pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class RegistroPremio {

	private JFrame frmRegistroDePremio;
	private JTextField txtCantidadProducto;
	private JTextField txtNombreProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroPremio window = new RegistroPremio();
					window.frmRegistroDePremio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistroPremio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDePremio = new JFrame();
		frmRegistroDePremio.setTitle("Registro de premio");
		frmRegistroDePremio.setBounds(100, 100, 383, 270);
		frmRegistroDePremio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblProducto = new JLabel("Producto");
		
		JLabel lblCantidadProducto = new JLabel("Cantidad");
		
		txtCantidadProducto = new JTextField();
		txtCantidadProducto.setColumns(10);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setEditable(false);
		txtNombreProducto.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btnGuardar.setForeground(Color.BLUE);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.BLUE);
		btnCancelar.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(frmRegistroDePremio.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProducto)
						.addComponent(lblCantidadProducto))
					.addGap(107)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNombreProducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCantidadProducto, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(84, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(68)
					.addComponent(btnGuardar)
					.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
					.addComponent(btnCancelar)
					.addGap(71))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtNombreProducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProducto))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCantidadProducto)
						.addComponent(txtCantidadProducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnGuardar))
					.addGap(38))
		);
		frmRegistroDePremio.getContentPane().setLayout(groupLayout);
	}

}
