
public class DisektoApp {

    public static void main(String[] args) {
        int etos;
		    boolean disekto;
        //etos pou eisagei o xristis
		    etos=Integer.parseInt(args[0]);
		              disekto=(((etos%4==0)&&(etos%100!=0))||(etos%400==0));
		if ((etos!=0)&&(etos>0))
		{       //an to etos einai disekto vale sti metavliti disketo true.
			if(disekto)
			{
				disekto=true;
			}
			else disekto=false;
		}
        //typwse tin timi tis metavlitis boolean
		System.out.println(disekto);
    }

}
