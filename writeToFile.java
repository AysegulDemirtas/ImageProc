package sdCard;

//yazma işlemi başarılı **
//File dir verisini kendi bilgisayarınızdakine göre girmelisiniz

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;

import org.omg.CORBA.Environment;

@SuppressWarnings("unused")
public class writeToFile
{

	 
	public static void main (String[] args){
		
	String fileName, body;
//	Scanner datum = new Scanner(System.in);
//	fileName = datum.nextLine();
//	body= datum.nextLine();
	
	fileName = "veri2";
	body = "result2";
	
    FileOutputStream fos = null;
    
    try {
        //final File dir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/folderName/" );

    	final File dir = new File("E:\\");
    	
        if (!dir.exists())
        {
                 if(!dir.mkdirs()){
                     System.out.print("ALERT: could not create the directories");
                 }
        }

        final File myFile = new File(dir, fileName + ".txt");

        if (!myFile.exists()) 
        {    
            myFile.createNewFile();
        } 

        fos = new FileOutputStream(myFile);

        fos.write(body.getBytes());
        fos.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
    	System.out.print("exception");
        e.printStackTrace();
    }
	}
}
