public class Project{
    String name;
    String desc;
    public Project(){}
    public Project(String name){
        this.name=name;
        this.desc="";
    }
    public Project(String name,String desc){
        this.name=name;
        this.desc = desc;
    }
    public String getName(){
        return name;
    } 
    public String getDesc(){
        return desc;
    }
    public void setName(String n){
        name=n;
    }
    public void setDesc(String d){
        desc=d;
    }
}