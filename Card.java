package Memory;

import java.awt.Color;

import javax.swing.*;

public class Card extends JButton
{
	Icon image;
	Status state;
	
	
	
	public enum Status{
		HIDDEN, VISIBLE, MISSING
	}
	
	public Card(Icon image)
	{
		this.setIcon(null);
		this.state = Status.MISSING;
		this.setOpaque(true);
		this.setBackground(Color.WHITE);
		this.image = image;
		
	}
	
	public Card(Icon image, Status state)
	{
		this.setOpaque(true);
		this.image = image;
		this.setStatus(state);

	}
	
	public void setStatus(Status state)
	{
		this.state = state;
		if(state == Status.HIDDEN)
		{
			this.setIcon(null);
			this.setBackground(Color.BLUE);
		}
		else if(state == Status.MISSING)
		{
			this.setIcon(null);
			this.setBackground(Color.WHITE);
		}
		else
		{
			this.setIcon(image);
		}
	}
	
	public Status getStatus()
	{
		return this.state;
	}
	
	public Card copy()
	{
		return ( new Card(this.image, this.state));
	}
	
	public boolean equalIcon(Card testCard)
	{
		return(this.image == testCard.image);
	}
	
	
	
	
	
	
	
}
