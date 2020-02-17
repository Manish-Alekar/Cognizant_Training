class Employe
{
    protected int emp_no;
    protected String name;
    protected int salary;
    public Employe(int empno,String nam,int sal)
    {
        emp_no=empno;
        name=nam;
        salary=sal;
    }
    public void emplo_data()
    {
        System.out.println("\nEmploy no.="+emp_no); 
        System.out.println("Name="+name);
        System.out.println("Salary="+salary);
    }
}
class Manager extends Employe
{
    int reward;
    public Manager(int empno,String nam,int sal,int p)
    {
        super(empno,nam,sal);
        reward=p;
    }
    public void managerdata()
    {
        System.out.println("\nEmploy no.="+emp_no);
        System.out.println("Name="+name);
        System.out.println("Salary="+salary);
        System.out.println("Reward="+reward);
    }
}
class Scientist extends Employe
{
    int perks;
    public Scientist(int empno,String nam,int sal,int s)
    {
        super(empno,nam,sal);
        perks=s;
    }
    public void scientistdata()
    {
        System.out.println("\nEmploy no.="+emp_no);
        System.out.println("Name="+name);
        System.out.println("Salary="+salary);
        System.out.println("Perks="+perks);
    }
}
class Inheritance
{
public static void main(String args[])
{
    Employe emp= new Employe(1,"Varun",20000);
    emp.emplo_data();
    Manager man= new Manager(2,"Arun",50000,1000);
    man.managerdata();
    Scientist scient= new Scientist(3,"Nithin",60000,5000);
    scient.scientistdata();
}
}
