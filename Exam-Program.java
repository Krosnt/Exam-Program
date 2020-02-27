package jframe.Exam_Program;

/**
 * @author Mirac Emin Akdağ
 */
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Exam_Program{

    public static void main(String[] args) {      
         JFrame frame = new JFrame("Exam");
         frame.setSize(500,500);
         frame.setLocation(100,100);
         frame.setVisible(true);
         frame.setResizable(false);
         frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);       
         frame.addWindowListener(new WindowAdapter()
               {
                @Override
                //Doesn't allow the minimize the window
                public void windowIconified(WindowEvent we){
                frame.setState(JFrame.NORMAL);
                    }             
               });       
         frame.addComponentListener(new ComponentAdapter(){
           @Override
           //Doesn't allow move the window to user
           public void componentMoved(ComponentEvent e){
               frame.setLocation(100,100);           
             }
         });
       }
}
