public class Animal {

    String name;
    public Animal (){};

    public Animal (String name){
        this.name = name;  // để phân biệt thuộc tính hay tham số nếu cùng tên nhau thì dùng this

    }
    public  void  eat (){
        System.out.println(name + " is eating");
    }
    public void  sleep (){
        System.out.println( name + " is sleeping");
    }


}
