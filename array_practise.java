class array_practise{
    public static void main(String[] args) {
         int[] array_method=m1();
        for(int i=0;i<array_method.length;i++){
            System.out.println(array_method[i]);
        }
          int[] arr={1,2,3,4,5};
        sum(arr);
        Student[] array;
        array=new Student[5];
        array[0]=new Student("Alice",1);
        array[1]=new Student("bob",2);
        array[2]=new Student("charlie",3);
        array[3]=new Student("david",4);    
        array[4]=new Student("eve",5);
        for(int i=0;i<array.length;i++){
            System.out.println("Name: "+array[i].name+" Roll No: "+array[i].rollno);
        }
       
     
    }
    
public static void sum(int[] arr){
    int add=0;
    for(int i=0;i<arr.length;i++)
        add=add+arr[i];
    System.out.println(add);

}
public static int[] m1(){
    return new int[] {1,2,3,4,5};
}
}
class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}