package programmingforbeginner;


public class MainWeek01 {

	
	public static void main(String[] args) {
		SolutionWeek01 solution = new SolutionWeek01();
		
//		solution.printNameVertical("Jhon");
		
//		System.out.println(solution.ifExistCharInString('r', "mary"));
		
		String str = "rrghhdbhbsnyg3dsrrede";
		char[] ch = {'r','d','e'};
		//String str1 = "rrrdde";
		//char[] ch = {'r','d','e'};
		//String str1 = "errsgh";
		//char[] ch = {'r','s','g'};
		System.out.println(solution.ifCharSeqExistsInString(ch , str));
		
	}

}
