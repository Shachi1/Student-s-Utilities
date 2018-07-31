
package studentsutilities;
import java.io.File;
import java.awt.Desktop;


public class resourseInOut {
    public void viewFiles(String filePath){
        //Desktop.getDesktop().open(new File(filePath));
        try{
            Desktop.getDesktop().open(new File(filePath));
        }
        catch(Exception e){}
    }
    public static void main(String args[]){
        String filePath="D:/Google drive/2.1/CSE 2.1 All sheets _ Books";
        resourseInOut ob=new resourseInOut();
        ob.viewFiles(filePath);
    }
}
