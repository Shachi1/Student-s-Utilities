
package studentsutilities;
import java.io.File;
import java.awt.Desktop;
import javax.swing.JFileChooser;


public class resourseInOut {
    public String resourceDirectory;
    public void viewFiles(String filePath){
        //Desktop.getDesktop().open(new File(filePath));
        try{
            Desktop.getDesktop().open(new File(filePath));
        }
        catch(Exception e){}
    }
    
    public void getFolderDirectory(){
        JFileChooser fl=new JFileChooser();
        fl.setDialogTitle("Set Directory");
        fl.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        /*if(fl.showOpenDialog(openFileChooser) == JFileChooser.APPROVE_OPTION){
            
        }*/
        resourceDirectory=fl.getSelectedFile().getAbsolutePath();
    }
    
}
