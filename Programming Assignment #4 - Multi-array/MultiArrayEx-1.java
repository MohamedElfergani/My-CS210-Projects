import java.util.*;

public class MultiArrayEx {
	
	public static int[][] multiArray;

	public static void main(String[] args) {
		
		MultiArrayEx y = new MultiArrayEx();
        
        y.outPut(multiArray);
        System.out.println();
        
        y.outPut(patternRow());
        System.out.println();
        
        y.outPut(patternCheckered());
        System.out.println();
        
        y.outPut(userChoice());
        System.out.println();
        
        y.sumNumbers();
    }
		

		public MultiArrayEx() {
			multiArray = new int[10][10];
			for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {
			multiArray[i][j]=1; 
			}
		}
	}
		private void outPut(int[][] x) {
			
			for(int i = 0; i < x.length; i++) {
	            
	            for(int j = 0; j < x[i].length; j++) {
	                
	                System.out.print(x[i][j]);
	            }
	            System.out.println();
			}
		}
		
		public static int[][] patternRow(){
			 for(int i = 0; i < multiArray.length; i+= 2) {
		            
		            for(int j = 0; j < multiArray[i].length;) {
		            	
		            	return multiArray;
		            }
			 }
			return multiArray;
		            }
		            
		            public static int[][] patternCheckered(){
		            	 for(int i = 0; i < multiArray.length; i+= 2) {
		                     
		                     for(int j = 0; j < multiArray[i].length; j+= 2) {
		                         
		                         multiArray[i][j] = 0;
		                         multiArray[i][j+1] = 1;
		                         
		                         multiArray[i+1][j] = 1;
		                         multiArray[i+1][j+1] = 0;
		                     }
		                 }
		            return multiArray;
		            
		            }
		            
		            public static int[][] userChoice() {
		            	int counter = 0;    
		                Scanner scanner = new Scanner(System.in);
		                
		                System.out.print("Please enter your choice:  ");
		                int x = scanner.nextInt();
		                
		                System.out.print("Please enter your choice:  ");
		                int y = scanner.nextInt();
		                
		                System.out.print("Please enter your choice:  ");
		                int z = scanner.nextInt();
		                
		                System.out.println();
		               
		                int[] listNum = new int[] {x, y, z};
		                
		                for(int i = 0; i < multiArray.length; i++) {
		                    
		                    for(int j = 0; j < multiArray[i].length; j++) {
		                        
		                        multiArray[i][j] = listNum[counter];
		                        counter++;
		                        if (counter == 3) {
		                            
		                            counter = 0;
		                        }
		                    }
		                }
		                
		                return multiArray;
		            }
		            
		            public void sumNumbers() {
		                
		                int sumTotal = 0, sumRow = 0;
		                
		                System.out.println("       Row Total:\n");
		                
		                for(int i = 0; i < multiArray.length; i++) {
		                    
		                    for(int j = 0; j <multiArray[i].length; j++) {
		                        
		                        System.out.print(multiArray[i][j]);
		                        sumRow += multiArray[i][j];
		                    }
		                    
		                    System.out.println("    " + sumRow);
		                    sumTotal += sumRow;
		                    sumRow = 0;
		                }
		                
		                System.out.println(" Grand Total: " + sumTotal);
		            }

		        }
		                

		
