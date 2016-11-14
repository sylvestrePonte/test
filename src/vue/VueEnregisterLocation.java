package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import controller.ControllerGeneral;
import controller.RecupererVéhicule;
import model.réservation.Véhicule;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VueEnregisterLocation {

	private JFrame frame;
	private JTextField textDebut;
	private JTextField textFin;
	private JComboBox comboClient = new JComboBox();
	private ArrayList<Véhicule> listvehic = new ArrayList<Véhicule>();
	private JComboBox comboVehic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueEnregisterLocation window = new VueEnregisterLocation();
					window.frame.setVisible(true);
		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VueEnregisterLocation() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		RecupererVéhicule rec = new RecupererVéhicule();
		listvehic = rec.listVéhicule("C:/Users/Sylvestre/workspace/Location/src/xml/vehicule.xml");
		System.out.println(listvehic.get(1));
		comboVehic = new JComboBox();
		
		for(int i=0 ; i <listvehic.size() ; i++ ) {
			comboVehic.addItem(listvehic.get(i));
		}
		
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		comboVehic.setBounds(176, 235, 444, 20);
		frame.getContentPane().add(comboVehic);
		
		JLabel lblDateDbut = new JLabel("Date D\u00E9but");
		lblDateDbut.setBounds(27, 40, 81, 14);
		frame.getContentPane().add(lblDateDbut);
		
		JLabel lblDateFin = new JLabel("Date Fin");
		lblDateFin.setBounds(27, 72, 63, 14);
		frame.getContentPane().add(lblDateFin);
		
		JLabel lblVhicule = new JLabel("V\u00E9hicule");
		lblVhicule.setBounds(30, 238, 46, 14);
		frame.getContentPane().add(lblVhicule);
		
		
		comboClient.setBounds(176, 189, 314, 20);
		frame.getContentPane().add(comboClient);
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setBounds(27, 192, 46, 14);
		frame.getContentPane().add(lblClient);
		
		textDebut = new JTextField();
		textDebut.setBounds(100, 37, 86, 20);
		frame.getContentPane().add(textDebut);
		textDebut.setColumns(10);
		
		textFin = new JTextField();
		textFin.setBounds(100, 69, 86, 20);
		frame.getContentPane().add(textFin);
		textFin.setColumns(10);
	}
}
