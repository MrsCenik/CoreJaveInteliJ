package day13loops;
public class DoWhileLoop01 {
    public static void main(String[] args) {
/*
 For the String "1234_?!abcdef", type a code to count the number of letters, 
    the number of digits and the number of others by using do-while loop
 */
        
        String str = "1234_?!abcdef";
        
        int digitCount = 0;
        int letterCount = 0;
        int otherCount = 0;
        
        int i = 0; 
        
        do {
            if(str.charAt(i)>='a' && str.charAt(i)<='z') {
                
                letterCount++;
                
            }else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                
                digitCount++;
                
            }else {
                
                otherCount++;
            }
            
            i++;
                        
        }while(i<str.length());
        
        System.out.println("The # of letter is  "+letterCount);
        System.out.println("The # of digits is " + digitCount);
        System.out.println("The # of other is " +otherCount);
        
        
        
        
        
        
    }
}

