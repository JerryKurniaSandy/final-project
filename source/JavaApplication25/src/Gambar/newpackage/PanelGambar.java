package Gambar.newpackage;
//Mengimport java awt
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
//Mengimport java swing
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGambar extends JPanel {
    private Image image;
    
    public PanelGambar(){
      image = new ImageIcon(getClass().getResource("/Gambar/jijij.jpg")).getImage();
     
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
     
        Graphics gd = (Graphics2D) g.create();
     
        gd.drawImage(image, 0,0,getWidth(),getHeight(), this);
        // menggambar image
        gd.dispose();
}
}
