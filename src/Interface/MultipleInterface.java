package Interface;

interface inter1
{
int x=500;
void display();
}

interface inter2
{
int y=1000;
void show();
}

public class MultipleInterface implements inter1, inter2

{

public void display()
{
System.out.println(x);
}
	
public void show()
{
System.out.println(y);
}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInterface g=new MultipleInterface();
		g.display();
		g.show();
		
		
	}

}
