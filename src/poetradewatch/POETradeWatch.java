/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poetradewatch;

/**
 *
 * @author Dan
 */
import java.awt.Desktop;
import java.net.MalformedURLException;
import java.net.URI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;



public class POETradeWatch {
    
        int[] found = new int[12];

	public static void main(String[] args) throws FileNotFoundException {


                
                GUI gui = new GUI();
                gui.setVisible(true);
                
                File saved = new File("saved.txt");
          	Scanner scanner = new Scanner(saved);      
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField1.setText(bits[0]);
                        gui.jTextField2.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField3.setText(bits[0]);
                        gui.jTextField4.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField5.setText(bits[0]);
                        gui.jTextField6.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField7.setText(bits[0]);
                        gui.jTextField8.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                                        
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField9.setText(bits[0]);
                        gui.jTextField10.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField11.setText(bits[0]);
                        gui.jTextField12.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField13.setText(bits[0]);
                        gui.jTextField14.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField15.setText(bits[0]);
                        gui.jTextField16.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField5.setText(bits[0]);
                        gui.jTextField6.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField17.setText(bits[0]);
                        gui.jTextField18.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField19.setText(bits[0]);
                        gui.jTextField20.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField21.setText(bits[0]);
                        gui.jTextField22.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                    
                    if(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] bits = line.split(" ");
                        gui.jTextField23.setText(bits[0]);
                        gui.jTextField24.setText(line.substring((bits[0].length() + 1), line.length())); 
                    }
                                    
                                    
                
                
                
                
                
                
                while(true){  
  
                    
                String result = "";
                result = Boolean.toString(search(gui.jTextField1.getText()));
                gui.jButton1.setText(result);   
                
                                result = Boolean.toString(search(gui.jTextField3.getText()));
                gui.jButton2.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField5.getText()));
                gui.jButton3.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField7.getText()));
                gui.jButton4.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField9.getText()));
                gui.jButton5.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField11.getText()));
                gui.jButton6.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField13.getText()));
                gui.jButton7.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField15.getText()));
                gui.jButton8.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField17.getText()));
                gui.jButton9.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField19.getText()));
                gui.jButton10.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField21.getText()));
                gui.jButton11.setText(result);
                
                                result = Boolean.toString(search(gui.jTextField23.getText()));
                gui.jButton12.setText(result);
                
                }

	}

	public static boolean search(String hash){
		URL url;
		boolean found = false;
                if(hash.length() > 0)
		try {
			// get URL content

			String a = hash;
			a = "http://poe.trade/search/" + a;
			url = new URL(a);
			URLConnection conn = url.openConnection();

			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));

			
			int resultsCount = 0;
			String inputLine;		
			while ((inputLine = br.readLine()) != null && !inputLine.contains("protip")) {
				//System.out.println(inputLine);
				if(inputLine.contains("result"))
					resultsCount++;
				if(resultsCount == 2)
					found = true;
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return found;
	}


}


