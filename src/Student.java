public class Student {
    private String name;
    public int age;
    public String group; // В какой группе


    public Student(String name, int age, String group){
        this.name = name;
        this.age = age;
        this.group = group;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void Lets_get_acquainted(){
        System.out.println("Hello " + name + "!");
    }

    public void change_group(String new_group){
        this.group = new_group;
        System.out.print("New group: " + group);
    }


}
