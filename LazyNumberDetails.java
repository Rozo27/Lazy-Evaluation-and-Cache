package optimizare;

public class LazyNumberDetails {
	private int number;

	private boolean verPrime;
	private boolean verPerfect;
	private boolean estePrim;

	private boolean estePerfect;
	public LazyNumberDetails(int number) {
		this.number=number;
		System.out.println("Asta este constructorul");
	}
	public void updateNumber(int number) {
		this.number=number;

		this.verPrime=true;
		this.verPerfect=true;
		System.out.println("Asta este actualizarea");
	}
	public int getNumber() {
		return this.number;
	}
	public boolean isPrime() {
		int i;
		boolean ok=true;
		if(this.verPrime==true) {
			for(i=2;i<=Math.sqrt(this.getNumber()) && ok==true;i++)
				if(this.number%i==0)
					{
					this.estePrim=false;
					ok=false;
					}
			if(ok==true)
				this.estePrim=true;
		
			verPrime=false;
		}
		return this.estePrim;
	}
	private int sumDiv(int n) {
		int s=0;
		for(int i=1;i<n;i++)
			if(n%i==0)
				s=s+i;
		return s;
	}
	public boolean isPerfect() {
		if( this.verPerfect==true) {
			if(sumDiv(this.getNumber())==this.getNumber())
				this.estePerfect=true;
			else estePerfect=false;
			//this.ver=false;
			this.verPerfect=false;
			System.out.println("A intrat in algoritm");
		}
		return this.estePerfect;
	}
	
}
