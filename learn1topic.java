public class sample {
    public static void main(String arg[]){
        student Student1=new student();
       // student Stud2=new student();
        Student1.regno=6;
        Student1.name="Mahila";
        Student1.marks=87;
        System.out.println(Student1.regno);
        System.out.println(Student1.name);
        System.out.println(Student1.marks);

        System.out.println("\n------------------------------------");

        student Stud2=new student(4,"revathi",88);
        System.out.println(Stud2.regno);
        System.out.println(Stud2.name);
        System.out.println(Stud2.marks);

        System.out.println("\n------------------------------------");
        customer client1=new customer();
        customer client2=new customer();
        client1.name="Nethish kumar";
        client2.name="Naveen";
        client2.changedname("Robin Antony");
        client1.gretting();
        client2.gretting();

       // client1.changedname("Robin Antony");

        System.out.println("\n------------------------------------");

        owner person1=new owner();

        System.out.println(person1.id);
        System.out.println(person1.name);
        System.out.println(person1.companyname);
        System.out.println(person1.rank);
        //System.out.println(person1.companyname);
        //System.out.println(person1.companyname);


        System.out.println("\n------------------------------------");
        owner person2=new owner();
        System.out.println(person2.companyname);

        System.out.println("\n------------------------------------");

        owner person3=new owner(7,"Dharani","Bank",3);

        System.out.println(person3.id);
        System.out.println(person3.name);
        System.out.println(person3.companyname);
        System.out.println(person3.rank);
       // System.out.println(person3.companyname);



    }
}
class student{
    int regno;
    String name;
    int marks;

    student(){

    }

    student(int regno,String name,int marks){
        this.regno=regno;
        this.name=name;
        this.marks=marks;
    }
}

class customer{
    String name;

    void gretting(){
        System.out.println("Welcome to my Beauty shop "+name);
    }
    void changedname(String name){
        this.name=name;
    }
}

class owner{
    int id=1;
    String name="Krish";
    String companyname="Bosch";
    int rank=75;
   // String companyname="hdf";

    owner(){
       this(4,"kaviya","IT",56);
    }

    owner(int id,String name,String companyname,int rank){
        this.id=id;
        this.name=name;
        this.companyname=companyname;
        this.rank=rank;
    }

}
