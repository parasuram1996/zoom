package zoom;



public class Orders {
	int sid;
	String sname;
	float ssal;

	public Orders(int sid,String sname,float ssal)
	{
		this.sid=sid;
		this.sname=sname;
		this.ssal=ssal;
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	Orders s1=new Orders(101,"parasuram",2000);
	System.out.println(s1.sid+"---"+s1.sname+"---"+s1.ssal);

	Orders s2=new Orders(102,"parasuram",1000);
	System.out.println("========================");
	System.out.println(s2.sid+"---"+s2.sname+"---"+s2.ssal);

	}
}
