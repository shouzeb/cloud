/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReding {

    
static String[] tokens;
static ArrayList<String> list;
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String file="C:\\Users\\shah\\Desktop\\java\\Assigment3\\src\\assigment3\\pollution report.txt";
//        String file2="data.txt";
//        File file3= new File("/home/ashfaq/NetBeansProjects/AssociationAggregationComposition/src/data.txt");
//        FileReader fr=new FileReader(file);
//   //     System.out.println((char)fr.read());
//    int i; 
//    while ((i=fr.read()) != -1) 
//      System.out.print((char) i); 
//    
    BufferedReader br = new BufferedReader(new FileReader(file)); 
//        System.out.println(br.readLine());
//    System.out.println(br.readLine());
String line;
tokens=new String[80];
//while((line=(br.readLine()!=null)))
while ((line = br.readLine()) != null) 
{
 makeTokens(line);
    
}
for(int i=0;i<tokens.length;i++){
    System.out.println(tokens[i]);

}
    }
    static String[] makeTokens(String line){
    String token[]=line.split(" ");
    return token;
    }
    
}
