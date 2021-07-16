package virtuso2;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.*;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import virtuso2.backend.JHistogramD;

public class Main extends JFrame{
    
     
     public Main(){
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     


    public static void main(String[]args){
        
        
        try {
             String[] cab = new String[14];
        cab[0] = "AcrylLook";
        cab[1] = "Aero";
        cab[2] = "Aluminium";
        cab[3] = "Bernstein";
        cab[4] = "Fast";
        cab[5] = "Graphite";
        cab[6] = "Hifi";
        cab[7] = "Luna";
        cab[8] = "McWin";
        cab[9] = "Mint";
        cab[10] = "Noire";
        cab[11] = "Smart";
        cab[12] = "Texture";
        
        File imagefile = new File("E:\\select.png");
        
         BufferedImage bi = ImageIO.read(imagefile);
         int width2 = bi.getWidth();
         int height2 = bi.getHeight();
         
      
         Graphics2D g2d = (Graphics2D) bi.getGraphics();
          g2d.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING,
          RenderingHints.VALUE_ANTIALIAS_ON);
          g2d.setRenderingHint(
           RenderingHints.KEY_TEXT_ANTIALIASING,
           RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
           g2d.setRenderingHint(
           RenderingHints.KEY_FRACTIONALMETRICS,
           RenderingHints.VALUE_FRACTIONALMETRICS_ON);
   

         
        
         
         
         ImageIcon image = new ImageIcon(bi);
//         UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
       

       
       
         
         
        
       
        Object selectedCab = JOptionPane.showInputDialog(null, "CHOOSE THE THEME", "SELECT THEME  ", JOptionPane.QUESTION_MESSAGE,image, cab, "SUPERCAB");
         
        if (selectedCab.equals("Smart") ) {
            Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
               props.put("macStyleWindowDecoration", "on");
               SmartLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("AcrylLook") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               AcrylLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Aero") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               AeroLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Aluminium") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               AluminiumLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Bernstein") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               BernsteinLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Fast") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               FastLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Graphite") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               GraphiteLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Hifi") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               HiFiLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals(" Luna") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
                LunaLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("McWin") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               McWinLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Mint") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               MintLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Texture") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
               MintLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         if (selectedCab.equals("Noire") ) {
                Properties props = new Properties();
               props.put("logoString", "VIRTUSO");
               props.put("centerWindowTitle", "on");
                props.put("macStyleWindowDecoration", "on");
                props.put("controlTextFont", "Montserrat Medium  14");
                props.put("userTextFont", "Montserrat Medium  14");
                props.put("menuTextFont", "Montserrat Medium  14");
                props.put("windowTitleFontt", "Montserrat Medium  14");
                props.put("subTextFont", "Montserrat Medium  14");
                
               MintLookAndFeel.setCurrentTheme(props);
             try {
                 UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
             
             
             Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
            int width = (int)size.getWidth();
            int height = (int)size.getHeight();
            Virtuso2 jfImageEditor;
            jfImageEditor = new Virtuso2(JFrame.EXIT_ON_CLOSE, width, height);
            
            
            
		jfImageEditor.setVisible(true);
		JHistogramD jHistogram = new JHistogramD(jfImageEditor);
                                             jHistogram.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
        } catch (IOException ex) {
            Logger.getLogger(Virtuso2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}