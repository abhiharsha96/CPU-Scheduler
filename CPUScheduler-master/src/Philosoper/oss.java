package Philosoper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class oss extends JFrame {
	private JPanel contentPane;

	private JButton btnNewButton;
	private JLabel img;
	private JLabel img1;
	private JLabel img2;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oss frame = new oss();
					
					frame.getContentPane().setBackground(new Color(1, 33, 63));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public oss() {
	setIconImage(Toolkit.getDefaultToolkit()
			.getImage("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium.png"));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(300, 100, 1000, 450);
	setResizable(false);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lbluser = new JLabel("OS ALGORITHMS");
	lbluser.setFont(new Font("Times New Roman", Font.BOLD, 46));
	lbluser.setForeground(Color.orange);
	lbluser.setBounds(320, 42, 400, 93);
	contentPane.add(lbluser);

	btnNewButton = new JButton("BANKERS");
	btnNewButton.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
	btnNewButton.setForeground(Color.red);
	btnNewButton.setBounds(150, 300, 150, 50);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			Home us = new Home();
			us.setVisible(true);
		}
	});
	contentPane.add(btnNewButton);
		
	

    
	btnNewButton = new JButton("SCHEDULING");
	btnNewButton.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
	btnNewButton.setForeground(Color.red);
	btnNewButton.setBounds(400, 300, 200, 50);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					dispose();
					new GUI();
		}
	});
	contentPane.add(btnNewButton);
	
	btnNewButton = new JButton("DINING");
	btnNewButton.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
	btnNewButton.setForeground(Color.red);
	btnNewButton.setBounds(700, 300, 150, 50);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			Philosopher.main(null);
			new oss();		
					
		}
	});
	contentPane.add(btnNewButton);
	
	img = new JLabel();
	JLabel lmage=new JLabel(new ImageIcon());
	ImageIcon cx=new ImageIcon("D:\\Downloads\\CPUScheduler-master\\CPUScheduler-master\\src\\Philosoper\\bank.jpg");
	
	img.setIcon(cx);
	img.setBounds(170,100,200,200);

	lmage.setForeground(Color.GREEN);
    Dimension size = lmage.getPreferredSize(); //Gets the size of the image
    lmage.setBounds(50, 30, size.width, size.height); 
    
    
	contentPane.add(img);
	
	
	img1 = new JLabel();
	JLabel lmage1=new JLabel(new ImageIcon());
	ImageIcon cx1=new ImageIcon("D:\\Downloads\\CPUScheduler-master\\CPUScheduler-master\\src\\Philosoper\\cpu.png");
	
	img1.setIcon(cx1);
	
	img1.setBounds(440,100,200,200);
	lmage1.setForeground(Color.GREEN);
    Dimension size1 = lmage1.getPreferredSize(); //Gets the size of the image
    lmage1.setBounds(50, 30, size1.width, size1.height); 
    
    
	contentPane.add(img1);
	
	
	img2 = new JLabel();
	JLabel lmage2=new JLabel(new ImageIcon());
	ImageIcon cx2=new ImageIcon("D:\\Downloads\\CPUScheduler-master\\CPUScheduler-master\\src\\Philosoper\\phil.png");
	
	img2.setIcon(cx2);

	
    img2.setBounds(730,100,200,200);
	lmage2.setForeground(Color.GREEN);
    Dimension size2 = lmage2.getPreferredSize(); //Gets the size of the image
    lmage.setBounds(50, 30, size2.width, size2.height); 
    
    
	contentPane.add(img2);
	
	
	setContentPane(contentPane);
}}
