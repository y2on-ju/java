package ch05.check;

import java.util.Arrays;
import java.util.Scanner;

public class checkQ09 {
	 //static int value;
    static int[] arr;
    static int sum;

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        System.out.println("------------------------------------------------ ");
	        System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
	        System.out.println("------------------------------------------------ ");
	        System.out.print("선택>");
	        boolean tf = true;
	        
	        while(tf){
	            int num = sc.nextInt();
	            int value;
	       
	  
	             switch (num) {
	            
	                case 1:  
	                        
	                	
	                        System.out.print("학생수 > ");
	                         int A = sc.nextInt();
	                         value = A;
	                         arr = new int[value];
	                         break;
	                         
	                         
	                        //  break;
	                         

	                case 2:  System.out.println("점수입력");
	                        
	                        for(int i = 0 ; i < arr.length; i ++){
	                            System.out.print("scores" + i + ":");
	                            int B = sc.nextInt();
	                            arr[i] = B;
	                            sum += B;
	                           
	                        }
	                        System.out.print("선택>");
	                     
	                       
	                         break;
	                case 3:  System.out.println("점수리스트");
	                        for(int i = 0 ; i < arr.length; i ++){
	                            System.out.println("score"+ i  + ":"+arr[i]);
	                        }
	                        System.out.print("선택>");
	                         break;
	                case 4:  System.out.println("분석");
	                        Arrays.sort(arr);
	                        System.out.println("최고 점수: " + arr[arr.length-1]);
	                        System.out.println("평균 점수: " +  sum/arr.length);

	                         break;
	                case 5:  System.out.println("종료");
	                        tf = false;
	                         break;
	    
	            }

	        }
	        
	        
	     
	    }
	    


		
	}


