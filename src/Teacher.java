public class Teacher {
    private String name;
    private String surname;
    public Student[] list = new Student[3];

    public Teacher(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void Full_array(){
        list[0] = new Student("John", 22, "HJIO");
        list[1] = new Student("Alex",21,"klop");
        list[2] = new Student("Marcus",20,"klcdhbcop");
        }

    public void show_info(){
        System.out.println();
        System.out.println("Hello " + name + " " + surname + "!");
        System.out.println("This is a list of students: ");
        System.out.println("First student: ");
        System.out.println("Name: " + list[0].getName());
        System.out.println("Age: " + list[0].age);
        System.out.println("Group: " + list[0].group);
        System.out.println();
        System.out.println("Second student: ");
        System.out.println("Name: " + list[1].getName());
        System.out.println("Age: " + list[1].age);
        System.out.println("Group: " + list[1].group);
        System.out.println();
        System.out.println("Third student: ");
        System.out.println("Name: " + list[2].getName());
        System.out.println("Age: " + list[2].age);
        System.out.println("Group: " + list[2].group);
        System.out.println();

    }
    public void Calling_student_methods(){
        list[0].Lets_get_acquainted();
        list[0].change_group("2-JAKB-3");
        System.out.println();
        list[1].Lets_get_acquainted();
        list[1].change_group("2-JAKB-3");
        System.out.println();
        list[2].Lets_get_acquainted();
        list[2].change_group("2-JAKB-3");
        System.out.println();
    }

}
