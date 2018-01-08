/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tut_1_mode_value;

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
public class Tut_1_mode_value {

    public static void main(String[] args) {
        
        BufferedReader br = null;
        String[][] arr = new String[5000][15];
        int i=0,count=0,record_count=0,new_value=0,no_of_diff_number=0,mode=0,mode1=0;
        //int[] flag= new int[15];
        
        try {

                String sCurrentLine;
                br = new BufferedReader(new FileReader("D://4th year/DWDM/LAB(tutorial)/tut1/adult.txt"));

                File file = new File("D://4th year/DWDM/LAB(tutorial)/tut1/mode_value.txt");
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
                int[][] frequency = new int[record_count][2];
                
                while (i<record_count) {
                        
                        //System.out.println(sCurrentLine);
                        //arr[i] = sCurrentLine.trim(); 
                        
                        for ( String ss : arr[i]){
                            if(ss.equals("?"))
                            { 
                               /*if(count==0 || count==2 || count==4 || count==10 || count==11 || count==12)
                                */
                                int flag = 0;
                                if(count==0)
                                {
                                    for(int j=0;j<record_count;j++)
                                    {
                                        if(!arr[j][count].equals("?")) 
                                        {
                                            new_value = Integer.parseInt(arr[j][count]);
                                            for(int l=0; l< frequency.length; l++){
                                                if((new_value+"").equals(frequency[l][0]+"")){
                                                    frequency[l][0]=new_value;
                                                    frequency[l][1]= frequency[l][1] + 1;
                                                    flag = 1;
                                                }
                                            }
                                            if(flag == 0){
                                                frequency[no_of_diff_number][0]=new_value;
                                                frequency[no_of_diff_number][1]=1;
                                            }
                                            flag = 0;
                                            //if(Arrays.asList(yourArray).contains(yourValue));
                                        }
                                        no_of_diff_number++;
                                    }
                                    for(int l=0; l< frequency.length; l++){
                                        if(mode1 < frequency[l][1]){
                                            mode1 = frequency[l][1];
                                            mode = frequency[l][0];
                                        }
                                    }
                                    arr[i][count] = mode+"";
                               }
                                else if(count==2)
                                {
                                    for(int j=0;j<record_count;j++)
                                    {
                                        if(!arr[j][count].equals("?")) 
                                        {
                                            new_value = Integer.parseInt(arr[j][count]);
                                            for(int l=0; l< frequency.length; l++){
                                                if((new_value+"").equals(frequency[l][1]+"")){
                                                    frequency[l][1]=new_value;
                                                    frequency[l][2]= frequency[l][2] + 1;
                                                }
                                                else{
                                                    frequency[no_of_diff_number][1]=new_value;
                                                    frequency[no_of_diff_number][2]=1;
                                                }
                                            }
                                            //if(Arrays.asList(yourArray).contains(yourValue));
                                        }
                                        no_of_diff_number++;
                                    }
                                    for(int l=0; l< frequency.length; l++){
                                        if(mode1 < frequency[l][2]){
                                            mode1 = frequency[l][2];
                                            mode = frequency[l][1];
                                        }
                                    }
                                    arr[i][count] = mode+"";
                               }
                                else if(count==4)
                                {
                                    for(int j=0;j<record_count;j++)
                                    {
                                        if(!arr[j][count].equals("?")) 
                                        {
                                            new_value = Integer.parseInt(arr[j][count]);
                                            for(int l=0; l< frequency.length; l++){
                                                if((new_value+"").equals(frequency[l][1]+"")){
                                                    frequency[l][1]=new_value;
                                                    frequency[l][2]= frequency[l][2] + 1;
                                                }
                                                else{
                                                    frequency[no_of_diff_number][1]=new_value;
                                                    frequency[no_of_diff_number][2]=1;
                                                }
                                            }
                                            //if(Arrays.asList(yourArray).contains(yourValue));
                                        }
                                        no_of_diff_number++;
                                    }
                                    for(int l=0; l< frequency.length; l++){
                                        if(mode1 < frequency[l][2]){
                                            mode1 = frequency[l][2];
                                            mode = frequency[l][1];
                                        }
                                    }
                                    arr[i][count] = mode+"";
                               }
                                else if(count==10)
                                {
                                    for(int j=0;j<record_count;j++)
                                    {
                                        if(!arr[j][count].equals("?")) 
                                        {
                                            new_value = Integer.parseInt(arr[j][count]);
                                            for(int l=0; l< frequency.length; l++){
                                                if((new_value+"").equals(frequency[l][1]+"")){
                                                    frequency[l][1]=new_value;
                                                    frequency[l][2]= frequency[l][2] + 1;
                                                }
                                                else{
                                                    frequency[no_of_diff_number][1]=new_value;
                                                    frequency[no_of_diff_number][2]=1;
                                                }
                                            }
                                            //if(Arrays.asList(yourArray).contains(yourValue));
                                        }
                                        no_of_diff_number++;
                                    }
                                    for(int l=0; l< frequency.length; l++){
                                        if(mode1 < frequency[l][2]){
                                            mode1 = frequency[l][2];
                                            mode = frequency[l][1];
                                        }
                                    }
                                    arr[i][count] = mode+"";
                               }
                               else if(count==11)
                                {
                                    for(int j=0;j<record_count;j++)
                                    {
                                        if(!arr[j][count].equals("?")) 
                                        {
                                            new_value = Integer.parseInt(arr[j][count]);
                                            for(int l=0; l< frequency.length; l++){
                                                if((new_value+"").equals(frequency[l][1]+"")){
                                                    frequency[l][1]=new_value;
                                                    frequency[l][2]= frequency[l][2] + 1;
                                                }
                                                else{
                                                    frequency[no_of_diff_number][1]=new_value;
                                                    frequency[no_of_diff_number][2]=1;
                                                }
                                            }
                                            //if(Arrays.asList(yourArray).contains(yourValue));
                                        }
                                        no_of_diff_number++;
                                    }
                                    for(int l=0; l< frequency.length; l++){
                                        if(mode1 < frequency[l][2]){
                                            mode1 = frequency[l][2];
                                            mode = frequency[l][1];
                                        }
                                    }
                                    arr[i][count] = mode+"";
                               }
                               else if(count==12)
                                {
                                    for(int j=0;j<record_count;j++)
                                    {
                                        if(!arr[j][count].equals("?")) 
                                        {
                                            new_value = Integer.parseInt(arr[j][count]);
                                            for(int l=0; l< frequency.length; l++){
                                                if((new_value+"").equals(frequency[l][1]+"")){
                                                    frequency[l][1]=new_value;
                                                    frequency[l][2]= frequency[l][2] + 1;
                                                }
                                                else{
                                                    frequency[no_of_diff_number][1]=new_value;
                                                    frequency[no_of_diff_number][2]=1;
                                                }
                                            }
                                            //if(Arrays.asList(yourArray).contains(yourValue));
                                        }
                                        no_of_diff_number++;
                                    }
                                    for(int l=0; l< frequency.length; l++){
                                        if(mode1 < frequency[l][2]){
                                            mode1 = frequency[l][2];
                                            mode = frequency[l][1];
                                        }
                                    }
                                    arr[i][count] = mode+"";
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
