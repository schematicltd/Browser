/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JFlashPlayer;

/**
 * @author Christopher Deckers
 */
public class SimpleFlashExample {

  public static JComponent createContent() {
    JFlashPlayer flashPlayer = new JFlashPlayer();
    String loc = "C:\\graham\\DJProject\\src\\DJNativeSwing-SWTDemo\\chrriis\\dj\\nativeswing\\swtimpl\\demo\\examples\\flashplayer\\resource\\Movement-pointer_or_click.swf";
    flashPlayer.load(loc);
    //flashPlayer.load(SimpleFlashExample.class, "resource/Movement-pointer_or_click.swf");
    
    return flashPlayer;
  }

  /* Standard main method to try that test as a standalone application. */
  public static void main(String[] args) {
    NativeInterface.open();
    UIUtils.setPreferredLookAndFeel();
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        JFrame frame = new JFrame("DJ Native Swing Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(createContent(), BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
      }
    });
    NativeInterface.runEventPump();
  }

}
