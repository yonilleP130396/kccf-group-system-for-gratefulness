/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package for_gratefullness_group;

/**
 *
 * @author VTMEDICS
 */
public class Members {
    
    private String id;
    private String name;
    private String address;
    private String course;
    private String gender;
    private String position;
    private String remarks;
    private String picturelocation;
    
    
    public Members( String id1, String name1, String address1, String course1,String gender1, String position1,String remarks1,String picturelocation1)
    {
        this.id = id1;
        this.name = name1;
        this.address = address1;
        this.course=course1;
        this.gender=gender1;
        this.position=position1;
        this.remarks=remarks1;
        this.picturelocation=picturelocation1;
       
        
     
    }
    
    public String getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    public String getCourse()
    {
        return course;
    }
    
    public String getGender()
    {
        return gender;
    }
    
     public String getPosition()
    {
        return position;
    }
    
    public String getRemarks()
    {
        return remarks;
    }
    public String getPicturelocation()
    {
        return picturelocation;
    }
    
   
}
