public class Test
{
public static void main(String args[])
{
Address ad=new Address();
ad.setCityname("Pune");
ad.setAreaname("Karvenagar");

Student stu=new Student();
stu.setRollno(1);
stu.setName("ABC");
stu.setAddr(ad);

System.out.println(stu.getRollno());
System.out.println(stu.getName());
System.out.println(stu.getAddr().getCityname());
System.out.println(stu.getAddr().getAreaname());
}


}
