class array_practise{
    public static void main(String[] args) {
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
}
class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}