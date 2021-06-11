
public class ProjectTest{
    public static void main(String[] args){
        Project elevatorPitch  = new Project("saad","instructor");
        System.out.println(elevatorPitch.name + "," + elevatorPitch.desc);
        elevatorPitch.setName("lana");
        elevatorPitch.setDesc("Student");
        String name= elevatorPitch.getName();
        String desc= elevatorPitch.getDesc();
        
        System.out.println("name is " + name + ", Description: " + desc);

    }
}
    

