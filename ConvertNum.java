/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertnum;

/**
 *
 * @author Blessing simelane
 */
import java.util.Scanner;
public class ConvertNum {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
   
        // TODO code application logic here
        System.out.print("Enter Numerical Value: ");
        int number = in.nextInt();
        try{
        System.out.println("Words Format is: "+ ConvertIntWords(number));    
        }
        catch(Exception e){
         System.out.println("Number is too large, must be less than or equal to 99");
        }
        
    }
    
    public static String ConvertIntWords(int number){
    
       
       if(number ==0)
           return "Zero";
       
       if(number < 0)
           return "minus" + ConvertIntWords(Math.abs(number));
        
        String words="";
        
        if((number/1000)>0){
        
            words += ConvertIntWords(Math.abs(number)) + "thousand";
        }
        if((number/100)>0){
           words += ConvertIntWords(Math.abs(number)) + "hundrend";
        }
        
        if((number/10)>0){
           String[] unitsMap = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
           "Eleven","Twalve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
           
           String[] teensMap = {"Zero","Teen","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty",
               "Ninety"};
           
           if(number < 20)
              words += unitsMap[number];
             
           else {
            words += teensMap[number / 10];
            if((number % 10) > 0)
                words += "" + unitsMap[number%10];
           }
        }
        
        
        return words;
    }
    
}
