//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
//Carson irons 
//P2
public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  //Method for finding factors of input integer

//Create an arrayList which will be our output
ArrayList<Integer> output= new ArrayList<Integer>(); 
//make a for loop which starts at the input number and ends at 2
for(int i=2;i<number;i++){
//make an if statement that takes the modulus between input number and current number and check if it equals 0
if(number%i==0){
//if it does… add current number to the arrayList
output.add(i);
}
//end for loop 
}
//return the arrayList
return output;
//end method
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   

//Method for removing all prime numbers

//declare a boolean variable checker and set to false 
boolean checker=false;
//make a for loop which traverses the array 
for(int i=0; i<nums.size();i++){
//make a for loop which goes through each value from 2 to the current index and constantly checks that checker is false 
for(int j=2; j<nums.get(i) && !checker;j++){
//check whether it has any factors (besides 1 and itself)... if it does, set checker to true 
if(nums.get(i)%j==0)
checker=true;
//end nested for loop
}
//check if checker is still false
if(!checker){
//if so remove the current index and decrement the current index by 1 (to compensate for missing index)
nums.remove(i);
i--;
 }
//else
else
//reset checker to false 
checker=false; 
//end for loop 
 }
//end method :)
 }
}