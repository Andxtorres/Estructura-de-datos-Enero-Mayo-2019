import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	private JPanel panelDispatcher;
	private JPanel sellTicket;
	private Dispatcher dispatcher;
	public JLabel soldLabel;
	private JTextField numberToAdd;
	private JButton button;
	
	public Ventana() {
		setSize(500,500);
		setLayout(new GridLayout(1,2));
		initComponents();
		setVisible(true);
		dispatcher= new Dispatcher(this);
		dispatcher.start();
	}
	
	public void initComponents() {
		panelDispatcher= new JPanel();
		soldLabel= new JLabel("Prueba");
		panelDispatcher.add(soldLabel);
		add(panelDispatcher);
		numberToAdd= new JTextField(10);
		button= new JButton("Ingresar");
		button.addActionListener(new AddListener());
		sellTicket= new JPanel();
		sellTicket.add(numberToAdd);
		sellTicket.add(button);
		add(sellTicket);
	}
	
	public class AddListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispatcher.queue.enqueue(Integer.parseInt(numberToAdd.getText()));
		}
		
	}

}
