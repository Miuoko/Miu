package count;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class count {
	int number = 0; 
    File file = new File("count.txt"); 
    synchronized  void countPeople() 
    { 
      if(!file.exists()) 
      { 
        number++; 
        try{ 
          file.createNewFile(); 
          FileOutputStream out = new FileOutputStream("count.txt"); 
          DataOutputStream dataOut = new DataOutputStream(out); 
          dataOut.writeInt(number); 
          dataOut.close(); 
        }catch(IOException ex){} 
      } 
      else  
        try{ 
          FileInputStream in = new FileInputStream("count.txt"); 
          DataInputStream dataIn = new DataInputStream(in); 
          number = dataIn.readInt(); 
          number++; 
          in.close(); 
          dataIn.close(); 
          FileOutputStream out = new FileOutputStream("count.txt"); 
          DataOutputStream dataOut = new DataOutputStream(out); 
          dataOut.writeInt(number); 
          out.close(); 
          dataOut.close(); 
        }catch(IOException ex){} 
    } 
   
}
