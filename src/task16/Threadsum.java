package task16;

public class Threadsum extends Thread {
	static int sum=0;
	public void  run()
	{
	
		for(int i=1;i<=50;i++)
		{
			sum+=i;
				
		}
		
		}
	public static void main(String[] args) throws InterruptedException {
		Threadsum t = new  Threadsum();
		t.start();
		Thread.sleep(10);
		System.out.println("sum = "+sum);

	}

}
