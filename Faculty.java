import java.util.ArrayList;
import java.lang.System;
/**
 * Student class
 *
 * @author (Liam Kelly, 22346317)
 * @version (20/11/2023)
 */
public class Faculty extends Person
{
    private String teachingRole; //ie, lecturer, tutorials, etc.
    private String password ="example"; //example password
    
    //initialising
    public Faculty(String teachingRole,String firstName, String lastName)
    {
        super(firstName,lastName);
        this.teachingRole=teachingRole;
        
    }
    
    @Override //overriding getEntry in Person.
    public String getEntry(int studentNum,String moduleName){
        return super.getEntry(studentNum,moduleName);//if password is right, go to the getEntry in Person
    }
    
}