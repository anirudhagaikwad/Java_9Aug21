package swingGUI;
//JTable



/**
 * @author Vaishnavi
 *
 */

import javax.swing.*;    
public class TablDemo 
{    
    JFrame table_f;    
    TablDemo(){    
    table_f=new JFrame();    
    String table_data[][]={ {"1001","Cherry"}, {"1002","Candy"}, {"1003","Coco"}};    
    String table_column[]={"SID","SNAME"};         
    JTable table_jt=new JTable(table_data,table_column);    
    table_jt.setBounds(30,40,200,300);          
    JScrollPane table_sp=new JScrollPane(table_jt);    
    table_f.add(table_sp);          
    table_f.setSize(300,400);    
    table_f.setVisible(true);    
}     
public static void main(String[] args) 
{    
    new TablDemo();    
}    
}  
  