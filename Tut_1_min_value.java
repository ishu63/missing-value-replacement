package tut_1_min_value;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author ISHITA
 */

public class Tut_1_min_value {

    public static void main(String[] args) {
        
        BufferedReader br = null;
        String[][] arr = new String[5000][15];
        int i=0,count=0,record_count=0,new_value=0;
        int[] flag= new int[15];
        
        try {

                String sCurrentLine;
                br = new BufferedReader(new FileReader("D://4th year/DWDM/LAB(tutorial)/tut1/adult.txt"));

                File file = new File("D://4th year/DWDM/LAB(tutorial)/tut1/min_value.txt");
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                
                // if file doesnt exists, then create it
                if (!file.exists()) {
                        file.createNewFile();
                }
                
                while ((sCurrentLine = br.readLine()) != null) {
                    arr[record_count] = sCurrentLine.split(", "); 
                    record_count++;
                }
                i=0;
                while (i<record_count) {
                        
                        //System.out.println(sCurrentLine);
                        //arr[i] = sCurrentLine.trim(); 
                        
                        for ( String ss : arr[i]){
                            if(ss.equals("?"))
                            { 
                               if(count==0 || count==2 || count==4 || count==10 || count==11 || count==12)
                                {
                                    if(flag[count]==0)
                                    {
                                        int min=10000000;
                                        for(int j=0;j<record_count;j++)
                                        {
                                            if(!arr[j][count].equals("?")) 
                                            {
                                                new_value = Integer.parseInt(arr[j][count]);
                                                if( min > new_value )
                                                min = new_value;
                                            }
                                        }
                                        flag[count]=(min);
                                        //System.out.println(sum);
                                        arr[i][count] = flag[count]+"";
                                    }

                               }
                               else
                               {
                                   arr[i][count]="NIL";
                               }
                            }
                            //System.out.println(arr[i][count]);
                            bw.write(arr[i][count]);  
                            bw.write(", ");
                            count++;
                        }
                        i++;
                        count=0;
			bw.newLine();
                }
                bw.close();

        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (br != null)br.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
    }
}
