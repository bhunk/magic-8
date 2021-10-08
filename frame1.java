package headFirst;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class frame1 extends JFrame implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void answer() {
		String[] wordListOne = {"It is certain.","It is decidedly so.","Without a doubt.","Yes – definitely.","You may rely on it.","As I see it, yes.","Most likely.","Outlook good.",
				"Yes.","Signs point to yes.","Reply hazy, try again.","Ask again later.","Better not tell you now.",
				"Cannot predict now.","Concentrate and ask again.","Don't count on it.","My reply is no.","My sources say no.",
				"Outlook not so good.","Very doubtful."};
				int oneLength = wordListOne.length;
				int rand1 = (int) (Math.random() * oneLength);
				String phrase = wordListOne[rand1]; 
				JTextArea textArea = new JTextArea();
				textArea.setEditable(false);
				textArea.setBounds(15, 151, 200, 100);
				contentPane.add(textArea);
				textArea.append(phrase);
				textArea.repaint();
				
	}
	public frame1() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mystery 8 ball");
		lblNewLabel.setBounds(5, 5, 286, 34);
		contentPane.add(lblNewLabel);
		
		final JTextField textField = new JTextField("put your questions here");
		textField.setBounds(5, 120, 345, 20);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().equals("put your questions here"))
	            {
	                textField.setText("");
	                repaint();
	                revalidate();
	            }
			}
		});
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("please enter a yes or no question");
		label.setBounds(5, 50, 265, 23);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("shake 8 ball");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			    //System.out.println(phrase);
				answer();
						
									    
			}
		});
		btnNewButton.setBounds(229, 84, 153, 23);
		contentPane.add(btnNewButton);
		
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
	

