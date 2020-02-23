/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.expression;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;

     


public class LambdaExpression {
    
     class compareStudentIdAsc implements Comparator<Student>{

        @Override
        public int compare(Student a, Student b) {
            return (int) (a.getId() - b.getId());
            
        }
        
    }
    
        class compareStudentIdDse implements Comparator<Student>{

        @Override
        public int compare(Student a, Student b) {
            return (int) (b.getId() - a.getId());
            
        }
        
    }
        
         class compareStudentGpaAsc implements Comparator<Student>{

        @Override
        public int compare(Student a, Student b) {
            return (int) (a.getGpa()*100 - b.getGpa()*100);
            
        }
        
    }
    
  
    public void integerArraySorting(){
         System.out.println("\nInteger sortng");
         int array[]={2,5,14,35,23,91,10};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(array));
        
        Arrays.sort(array);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(array));
        
}
        public void StringArraySorting(){
            System.out.println("\nString sortng");
         String array[]={"2","5","14","35","23","91","10"};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(array));
        
        Arrays.sort(array);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(array));
        
}
   
          public void StudentArraySorting(){
            System.out.println("\nStudent sortng");
         Student array[]= {
               new Student(2016152,"antor",LocalDate.of(1996, Month.AUGUST, 25),3.35),
             new Student(2016160,"abdullah",LocalDate.of(1995, Month.JANUARY, 20),3.60),
             new Student(2016153,"ziad",LocalDate.of(1997, Month.FEBRUARY, 15),2.25),
             new Student(2016136,"Arko",LocalDate.of(1994, Month.MARCH, 10),3.00),
             new Student(2016134,"Emmran",LocalDate.of(1992, Month.APRIL, 05),2.75),
         };
        System.out.println("before sorting");
        //System.out.println(Arrays.toString(array));
        for(Student student:array){
            System.out.println(student);
        }
        
        //Arrays.sort(array,new compareStudentIdAsc());
       // Arrays.sort(array,new compareStudentIdDse());
       // Arrays.sort(array,new compareStudentGpaAsc());
       
       //Anonymus Inner class
       Arrays.sort(array,new Comparator<Student>() {
                @Override
                public int compare(Student a, Student b) {
                    return (int) (b.getGpa()*100 - a.getGpa()*100);
                }
            });
       
       //lambda expression(version 1)
           Arrays.sort(array,
                (Student a, Student b)-> {
                    return (int) (a.getGpa()*100 - b.getGpa()*100);
                }
            );
           
            //lambda expression(version 2)
           Arrays.sort(array,
                ( a,  b)-> {
                    return (int) (a.getGpa()*100 - b.getGpa()*100);
                }
            );
           
               //lambda expression(version 3)
           Arrays.sort(array,( a, b) -> (int) (a.getGpa()*100 - b.getGpa()*100));
           
            //lambda expression(version 4)  //method reference
           Arrays.sort(array,Comparator.comparing(Student :: getGpa).reversed()); 
   
        System.out.println("After sorting");
        for(Student student:array)
            System.out.println(student);
        
        
        
}

    public LambdaExpression() {
        System.out.println("Hello AJ!");
        integerArraySorting();
        StringArraySorting();
        StudentArraySorting();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        new LambdaExpression();
        
    }
    
}
