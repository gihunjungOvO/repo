public class Main {
	public static void main(String[] args) 
	{
		int goal[][] = {  {1, 2, 3},
				   {4, 5, 6},
				   {7, 8, 0} };

		int start[][] = { {1, 8, 2}, 
	   			     {0, 4, 3}, 
	   			     {7, 6, 5} };
		
		int x = 1, y = 0;
		
		EightPuzzle eightPuzzle = new EightPuzzle();
		
		if (eightPuzzle.isSolvable(start)) 
		{ eightPuzzle.solve(start, goal, x, y); }
		
		else 
		{ System.out.println("도달 불가능한 목표"); }
	}
}