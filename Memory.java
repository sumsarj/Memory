package Memory;


import java.awt.Color;
import java.io.File;

import javax.swing.*;

public class Memory extends JFrame{
	
	Card[] allcards;

	JPanel panel = new JPanel();
	
	
	public Memory()
	{
		File folder = new File("mypictures");
		File[] pictures = folder.listFiles();
		
		allcards = new Card[pictures.length];
		
		for(int i = 0; i < allcards.length; i++)
		{
			
			allcards[i] = new Card(new ImageIcon(pictures[i].getPath()));
		}
		
	
	}
	
	public void newGame() throws NumberFormatException 
	{
		
		Tools.randomOrder(allcards);
		Card[] useCards;
		int amount = 0;
		amount = Integer.parseInt(JOptionPane.showInputDialog("MAta in antal kort"));
		useCards = new Card[amount * 2];
		
		for(int i  = 0; i < amount; i++)
		{
			useCards[i] = allcards[i];
			
		}
		
		Tools.randomOrder(useCards);
		
		for(int j = 0; j < amount; j++)
		{
			useCards[j + amount] = allcards[j];
		}
		
		Tools.randomOrder(useCards);
		
		for(int i = 0; i <useCards.length; i++)
		{
			panel.add(useCards[i]);
		}
		add(panel);
		
	    // JFrame properties
	    setSize(400, 400);
	    setBackground(Color.BLACK);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);

				
	}
	
}
