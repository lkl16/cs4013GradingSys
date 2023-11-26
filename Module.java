import java.util.ArrayList;

/**
 * Module Class
 *
 * @author (Liam Kelly,22346317)
 * @version (20/11/2023)
 */
public class Module
{
    private String moduleName;
    private ArrayList<Student> classList;
    private ArrayList<Faculty> staffList;
    public Module(String name)
    {
        this.moduleName=name;
        classList=new ArrayList<Student>();
        staffList=new ArrayList<Faculty>();
    }
    public String getName(){
        return moduleName;
    }
}
