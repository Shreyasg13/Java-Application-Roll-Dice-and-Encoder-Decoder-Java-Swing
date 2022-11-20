package PartIV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RollDice extends JFrame {
	
	JPanel dicePanel;
	private JLabel resultLabel;
	private JButton rollDiceButton;
	
	int firstdie=1,seconddie=1;
	ImageIcon die_image1,die_image2;
	JButton die1Button, die2Button;
		
	public RollDice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.LIGHT_GRAY);
		setupPanels();
		setSize(500,500);
		setVisible(true);		
	}

	private void setupPanels() {
		dicePanel = new JPanel();
		
		JPanel controlPanel = new JPanel();
		
		controlPanel.setLayout(new GridLayout(2,1));
		controlPanel.setSize(5,5);
		
		die_image1 = new ImageIcon("PartIV\\die1.png");
		die1Button = new JButton();
		die1Button.setIcon(die_image1);
		die1Button.setBackground(Color.LIGHT_GRAY);
		die_image2 = new ImageIcon("PartIV\\die1.png");
		die2Button = new JButton();
		die2Button.setIcon(die_image1);
		die2Button.setBackground(Color.LIGHT_GRAY);
				
		resultLabel = new JLabel("Result: " + (firstdie+seconddie));
		rollDiceButton = new JButton("Roll Dice");
				
		
		die1Button.addActionListener((e)->{
			firstdie = (int)(Math.random()*100)%6 + 1;
			resultLabel.setText("Result:" + (firstdie + seconddie));
			die_image1 = new ImageIcon("PartIV\\die"+firstdie+".png");
			
			die1Button.setIcon(die_image1);			
			
			System.out.println("Die1 changed to: "+firstdie);
			
		});
		
		die2Button.addActionListener((e)->{
			seconddie = (int)(Math.random()*100)%6 + 1;
			resultLabel.setText("Result:" + (firstdie + seconddie));
			die_image2 = new ImageIcon("PartIV\\die"+seconddie+".png");			
			die2Button.setIcon(die_image2);			
			
			System.out.println("Die2 changed to: "+seconddie);
		});
		
		rollDiceButton.addActionListener((e)->{
			firstdie = (int)(Math.random()*100)%6 + 1;
			seconddie = (int)(Math.random()*100)%6 + 1;
			resultLabel.setText("Result:" + (firstdie + seconddie));
			
			System.out.println("Die1: "+firstdie + " Die2: "+seconddie);
			
			die_image1 = new ImageIcon("PartIV\\die"+firstdie+".png");
			die_image2 = new ImageIcon("PartIV\\die"+seconddie+".png");
			
			die1Button.setIcon(die_image1);
			die2Button.setIcon(die_image2);
			
			System.out.println("Button Clicked!");
			repaint();
		});
	
		dicePanel.add(die1Button);
		dicePanel.add(die2Button);
		controlPanel.add(resultLabel);
		controlPanel.add(rollDiceButton,BorderLayout.SOUTH);
		this.add(dicePanel, BorderLayout.NORTH);
		this.add(controlPanel, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) {
		RollDice rollDice = new RollDice();
	}
}
