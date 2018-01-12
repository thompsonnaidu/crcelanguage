import java.util.Scanner;
import java.util.Vector;

class Item  {
	private int id;
	private float price;
	private String name;
	
	Item()
	{
		id = 0;
		price = 0;
		name = "New Item";
	}
	Item(int id, float price, String name)
	{
		this.id = id;
		this.price = price;
		this.name = name;
	}
	Item(int id, float price)
	{
		this(id,price,"New Item");
	}
	public int getId()  { return id;  }
	public float getPrice() { return price;  }
	public String getName()  { return name;  }
}
class ShoppingCart  {
	private int id;
	private Vector v;
	private int item_count = 0;
	
	ShoppingCart()
	{
		v = new Vector();
		id = 0;
	}
	
	ShoppingCart (int id)
	{
		this.id = id;
		v = new Vector();
	}	
	public ShoppingCart addItem (Item item)
	{
		v.addElement(item);
		item_count++;
		return this;
	}
	public void removeItem(Item item)
	{
		v.remove(item);
		item_count--;
	}
	public float getBill ()
	{
		float sum =0;
		for(int i=0;i<item_count;i++)
			sum += ((Item)v. elementAt(i)).getPrice();	
		return sum;						
	}
}
public class ShoppingCartDemo   {
	public static void main(String args[])
	{
		ShoppingCart sc = new ShoppingCart(101);
		
		Item bananas = new Item(5845,30,"Bananas");
		Item onions    = new Item(6454,40,"Onions");
		Item c   = new Item(8314,12,"Malboro Mint");
		Item mw    = new Item(7442,200,"Listrene");
		Item donuts    = new Item(9650,500,"Donuts");
		Item lettuce    = new Item(8746,51,"Lettuce");
		Item green_tea    = new Item(5112,70,"Green Tea");		
	
		sc.addItem(bananas)
		.addItem(onions)
		.addItem(c)
		.addItem(mw)
		.addItem(lettuce)
		.addItem(mw)
		.addItem(green_tea)
		.addItem(donuts);
		
		sc.removeItem(lettuce);
		sc.removeItem(c);
		
		System.out.println("Bill is" + sc.getBill());
	}	  
}		
/* OUTPUT
Bill is1040.0
*/