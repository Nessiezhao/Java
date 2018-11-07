public class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false ;
        }
        if(this == obj) {
            return true ;
        }
        // 不是Person类对象
        if (!(obj instanceof Person)) {
            return false ;
        }
        Person person = (Person) obj ; // 向下转型，比较属性值
        return this.name.equals(person.name) && this.age==person.age ;
    }
    public static void main(String[] args){
        Person per1 = new Person("nihao",10);
        Person per2 = new Person("nihao",10);
        System.out.println(per1.equals(per2));
    }
}



