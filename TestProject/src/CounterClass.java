
public class CounterClass {
	
	public static void main (String[] args){
		int wineNum = 99;
		String word = "bottles";
		
		System.out.println("Counter:" + wineNum);
		
		while (wineNum > 0){
			System.out.println(wineNum+" "+word+ " of wine in the wall");
			System.out.println(wineNum+" "+word+ " of wine");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			wineNum = wineNum-1;
			
			if (wineNum ==1){
				word = "bottle";
			}
			else if (wineNum ==0){
				System.out.println("No more bottles of wine on the wall");
			}
		}
	}

}
