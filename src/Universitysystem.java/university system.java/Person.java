public abstract class Person extends BaseEntity {
    Private String name;
    Private int id;

    Public person(String name, int id){
        super(id);
        this.name = name;
        
    }
    Public String getname(){
        return name;
    }
    Public abstract void login();
    }
    
}
