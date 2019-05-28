package test;

public class Sale {
	public static void main(String[] args){
		SaleTickets t=new SaleTickets();
			new Thread(t).start();
			new Thread(t).start();
			new Thread(t).start();
			new Thread(t).start();
		}
	}


class SaleTickets implements Runnable{
	private int tickets=1;
	public void run(){
		while(true){
			if(tickets<=10)
				System.out.println(Thread.currentThread().getName()+"ÏúÊÛµÚ"+tickets++ +"Æ±");
			else
				break;
		}
	}
}
