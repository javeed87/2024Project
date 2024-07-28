package Interface;

interface inter 
{
	int a=10;
    void show();
}

public class SingleInterface implements inter
{

	public void show()
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingleInterface s=new SingleInterface();
		s.show();
		
		
	}

}
