import java.util.LinkedHashSet;  
class LinkedHashSet{  
 public static void main(String args[]){  
  LinkedHashSet<Integer> al=new LinkedHashSet<>();  
  al.add('0');  
  al.add('1');  
  al.add('1');  
  al.add('2');
  al.add('2');
  al.add('2');  
  al.add('3');
  al.add('3');
  al.add('3');
  al.add('3');
  /*Iterator<Integer> num=al.iterator();  
  while(num.hasNext()){  
   System.out.println(num.next()); */
           System.out.println("Iterating over the LinkedHashSet:");
        for (Integer value : a1) {
            System.out.println(value);
 
  }  
 }  
}  