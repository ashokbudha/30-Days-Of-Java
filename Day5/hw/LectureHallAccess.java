public class LectureHallAccess{

    static int maxNoOfStudent = 35;
    static Boolean isTeacherPresent = false;
    static int studentCount = 0;

    static public void grantAccess(String name, String designation){ 
        if (designation.equalsIgnoreCase("Teacher")){
            if(isTeacherPresent){
                System.out.printf("Teacher %s has taken acces to class. Cannot Enter now.\n",name);
            }
            else{
                isTeacherPresent = true;
                System.out.printf("Teacher %s taken access to class.\n",name);
            }
        }
        else if (designation.equalsIgnoreCase("Student")){
            if(!isTeacherPresent){
                System.out.println("No Teacher has entered the class. So you cannot enter the class now.");
            }
            else if(studentCount>=maxNoOfStudent){
                System.out.println("The class has it maximum capacity so cannot excess ");
            }
            else{
                studentCount++;
                System.out.printf("Access granted to student %s \n",name);
            }
        }
        else{
            System.out.printf("Acess Denied. Only Teacher and Student can access.");
        }
       
        
    } 


  public static void main(String[] args)
  {
        grantAccess("Bivek", "Teacher"); 

        grantAccess("Ashok", "Student"); 
        grantAccess("Ram", "Student"); 

        for (int i = 1; i <= 35; i++) {
            grantAccess("Student" + i, "Student"); 
        }
        grantAccess("sita", "Student"); 

        grantAccess("pushparaj", "Teacher"); 

        grantAccess("anthony", "Staff");
  }
}


