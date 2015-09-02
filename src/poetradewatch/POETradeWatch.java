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
import java.awt.Toolkit;
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
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;



public class POETradeWatch {
    
        int[] found = new int[12];

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException, LineUnavailableException, UnsupportedAudioFileException, IOException {

            

                Clip clip = AudioSystem.getClip();
                // getAudioInputStream() also accepts a File or InputStream
                File audioFile = new File("alert.wav");
                AudioInputStream ais = AudioSystem.getAudioInputStream(audioFile);
                clip.open(ais);
            
            
            
            
            
            
            

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
                int temp = 0;
                
                result = Integer.toString(search(gui.jTextField1.getText()));
                int oldFound = Integer.parseInt(gui.jButton1.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton1.setText(result);   
                
                result = Integer.toString(search(gui.jTextField3.getText()));
                oldFound = Integer.parseInt(gui.jButton2.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton2.setText(result); 
                                
                result = Integer.toString(search(gui.jTextField5.getText()));
                oldFound = Integer.parseInt(gui.jButton3.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton3.setText(result); 
                
                                
                result = Integer.toString(search(gui.jTextField7.getText()));
                oldFound = Integer.parseInt(gui.jButton4.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton4.setText(result); 
                
                
                result = Integer.toString(search(gui.jTextField9.getText()));
                oldFound = Integer.parseInt(gui.jButton5.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton5.setText(result);                 
                
                
                result = Integer.toString(search(gui.jTextField11.getText()));
                oldFound = Integer.parseInt(gui.jButton6.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton6.setText(result);                 
                
                
                result = Integer.toString(search(gui.jTextField13.getText()));
                oldFound = Integer.parseInt(gui.jButton7.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton7.setText(result);  
                
                
                
                
                result = Integer.toString(search(gui.jTextField15.getText()));
                oldFound = Integer.parseInt(gui.jButton8.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton8.setText(result);  
                
                
                result = Integer.toString(search(gui.jTextField17.getText()));
                oldFound = Integer.parseInt(gui.jButton9.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton9.setText(result);                  
                
                                
                result = Integer.toString(search(gui.jTextField19.getText()));
                oldFound = Integer.parseInt(gui.jButton10.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton10.setText(result); 
                
                
                                               
                result = Integer.toString(search(gui.jTextField21.getText()));
                oldFound = Integer.parseInt(gui.jButton11.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton11.setText(result); 
                
                                                               
                result = Integer.toString(search(gui.jTextField23.getText()));
                oldFound = Integer.parseInt(gui.jButton12.getText());
                if(Integer.parseInt(result) > oldFound){
                    clip.stop();
                    clip.setFramePosition(0);
                    clip.start();
                }
                gui.jButton12.setText(result); 
                
                }

	}

	public static int search(String hash){
		URL url;
		int found = 0;
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
                                
                                if(inputLine.endsWith("results)")){
                                    //System.out.println(inputLine);  
                                
                                    String[] split = inputLine.split(" ");
                                
                                    //System.out.println(split.length);
                                    //System.out.println(split[4]);  
                                    if(split[4].length() > 3)
                                        found = 99;
                                    else
                                        found = Integer.parseInt(split[4].substring(1));
                                }
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


