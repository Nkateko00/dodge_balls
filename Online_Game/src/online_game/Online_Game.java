/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_game;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Nkateko Nkuna
 */


public class Online_Game extends JComponent implements ActionListener, KeyListener {
      //private javax.swing.JLabel picLabel;
     //Movements
        int highscore = 0;
        int count = 0;
              int x = 550, s = 270, u = 170, y = 330, f = 3,
                    m = 3, velX = 2, velY = 2, brX = 3, brY = 3;
                        int z = 10, n = 320;
                             int  bm1 =25,bm2 =25,bmb = 50,bmb2 =50,bmr = 50, bmr2 = 50,bmg =50,bmg2 =50,bmo = 50, bmo2 = 50;
                                 int j=3,c=3;
                                    int b = 540,q =0;
                                    int scoreBoard =5;
                                       //More Movements
                                       int belX = 5, belY = 5;
                                  int celX = 2,celY =2;
                            int zelX =3,zelY=3;
                        int goal;
                   int boal;
              
       int bY,bX,zX,zY,sX,sY;//BULLETS
    //declared the Timer here instead of in main method
      Timer t = null;

    public Online_Game() {

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
        //picLabel = new javax.swing.JLabel();
        //picLabel.setSize(600,400);
        //this.add(picLabel);
    }


     public void paint(Graphics g) {
     	
        Rectangle r1 = new Rectangle(s, u, bm1, bm2);//S-green
        Rectangle r2 = new Rectangle(x, y, bmb, bmb2);//Blue
        Rectangle r3 = new Rectangle(j, c, bmr, bmr2);//Red
        Rectangle r4 = new Rectangle(z, n, bmg, bmg2);//B-green
        Rectangle r5 = new Rectangle(b ,q, bmo, bmo2);//Orange  
         
        //R1 & R4
        g.setColor(Color.green);
        g.setFont(new Font("arial",Font.BOLD,50));
        g.drawString("Yung Game :),",250,100);
        g.setColor(new Color(120,21,220));
        g.fillRect(0, 0, 600, 400);
                       
                                // jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skyf/airport.png")));
//                                picLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gar/gameplay.png")));
             
              g.drawString("",200,120);
              g.setColor(new Color(75,0,130));
              g.fillOval(r4.x, r4.y, r4.width,  r4.height);
              g.setColor(new Color(75,0,130));    //PURPLE
              g.fillOval(r1.x, r1.y, r1.width, r1.height);
              g.setColor(Color.RED);//
              g.fillOval(r3.x, r3.y, r3.width, r3.height);
              g.setColor(Color.PINK);
              g.fillOval(r2.x, r2.y, r2.width, r2.height);//PINK
          
//              if(t.equals(20))  { 
//               r5.t = new Timer(15,r5);
//               r5.t.start();
             g.setColor(new Color(80,0,70));
             g.fillOval(r5.x,r5.y,r5.width,r5.height);
              
//              }
              
          if (r1.intersects(r2)) {
                          bmo =  bmo +4;
                          bmo2 = bmo2 +4;
                          bmr = bmr +4;
                          bmr2 = bmr2 +4;
                          bmb = bmb +4;
                          bmb2 = bmb2 +4 ;
                          f = f -brY;
                          m = m -brX;
                          t.stop();
                          gameOver(g);
                           /*
                          close();
                           */
        }
           if(r1.intersects(r3)){
                         bmo =  bmo +4;
                         bmo2 = bmo2 +4;
                         bmr = bmr +4;
                         bmr2 = bmr2 +4;
                         bmb = bmb +4;
                         bmb2 = bmb2 +4;
                         f = f -brY ;
                         m = m -brX;

                         t.stop();
                         gameOver(g);
        }
            if(r1.intersects(r4)){
        
                        scoreBoard ++;
                        System.out.println("Score Is "+scoreBoard);
  
                        bmo =  bmo++;
                        bmo2 = bmo2 ++;
                        bmr = bmr ++ ;
                        bmr2 = bmr2 ++;
                        bmb = bmb ++;
                        bmb2 = bmb2 ++ ;
                        f = f -brY;
                        m = m -brX;
 
        	   
                       g.setColor(Color.GREEN);
                       g.drawString("+Z-POINTS",250,100);
        	
        }
          
              
            
           if(r1.intersects(r5)){
              bmo =  bmo +4;
              bmo2 = bmo2 +4;
              bmr = bmr +4;
              bmr2 = bmr2 +4;
              bmb = bmb +4;
              bmb2 = bmb2 +4 ;
              f = f -brY;
              m = m -brX;
        	
              t.stop();
             gameOver(g);
           }
    
   
     
     }
     
    public void actionPerformed(ActionEvent e) {
    	
      //  System.out.println("Action performed ...." + e);
    
        if (j < 0 || j > 560) {
            brX = -brX;
    
     }

         if (c < 0 || c > 360) {
           brY = -brY;
 
     }

         if (x < 0 || x > 560) {
            velX = -velX;    

     }               

         if (y < 0 || y > 360) {
            velY = -velY;   
     }

         if (z < 0 || z > 560 ){
            celX = -celX;
                    	
     }

        if (n <0 || n >360){
        	celY =-celY;
            
        	
     }
        if(b<0 || b >560){
        	zelX = -zelX;
        	
     }
        if(q<0 || q>360){
        	zelY = -zelY;
                
    }

        x = x + velX;
          repaint();
        y = y + velY;
          repaint();
        c = c + brY;
          repaint();
        j = j + brX;
          repaint();
        z = z + celX;
          repaint();
        n = n + celY;
          repaint();
        b = b +zelX;
          repaint();
        q = q+zelY;
          repaint();  

 }
    public void right(){
    	s = s+10;
    	u = u +0;
    	repaint();
    	perimeter();
    }
    public void left(){
    	s =s -10;
    	u = u +0;
    	repaint();
    	perimeter();
    }

    public void down() {
        u = u + 10;
        s = s + 0;
        repaint();
        perimeter();
    }

    public void up() {
        u = u - 10;
        s = s + 0;
        repaint();
        perimeter();
    }
    public void perimeter(){
        //
    
    	if(s>=560){
    		s = 560;
    	}
    	if(s<=0){
    		 s = 0;
    	}
    	
    	if(u<=0){
    		u = 0;		 

    	}
    	if(u>=360){
    		u =360;
    	
    	}
    }

    
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_DOWN) {
            count = count + 1;
            System.out.println("The count = " + count);
            down();
     }
         if (code == KeyEvent.VK_UP) {
            up();
            System.out.println("X value:" + s + "\n" + "Y value:" + u);
    }
         if (code == KeyEvent.VK_RIGHT) {
            right();
            System.out.println("X value:" + s + "\n" + "Y value:" + u);
     }
         if (code == KeyEvent.VK_LEFT) {
            left();
            System.out.println("X value:" + s + "\n" + "Y value:" + u);
     }
      
         if(code == KeyEvent.VK_SPACE){
           restart();
           
     }
         if(code == KeyEvent.VK_ENTER){
            System.exit(0);
      }
        if(code ==KeyEvent.VK_F11){
            t.stop();
        }   
        if(code ==KeyEvent.VK_F12){
            t.start();
            
     
       }
  
    }
    public void gameOver(Graphics g) {
        //added this line -- t.stop() -- to stop timer
        // (this has the effect of stopping the animation)
        
        if(scoreBoard<30){
            
        g.setColor(Color.white);
        g.setFont(new Font("arial",Font.BOLD,50));
        g.drawString("Game Over !",165,160);
        g.setFont(new Font("arial",Font.BOLD,20));
        g.drawString("Space to Retry or Enter to Exit",160,200);
         g.setFont(new Font("arial",Font.BOLD,25));
        g.drawString("SCORE : "+scoreBoard,180,230);
        
        }
        else if(scoreBoard>50){
            g.setColor(Color.white);
        g.setFont(new Font("arial",Font.BOLD,50));
        g.drawString("Game Over Champ!!:),",100,160);
        g.setFont(new Font("arial",Font.BOLD,20));
        g.drawString("Space to Retry or Enter to Exit",160,200);
        
       g.setFont(new Font("arial",Font.BOLD,25));
        g.drawString("SCORE : "+scoreBoard,180,250);
      
        }   
                }
      public void restart(){
           JFrame jg = new JFrame()  ;
           Online_Game g = new Online_Game();
           g.t = new Timer(15,g);
           g.t.start();
           jg.add(g);
           jg.setVisible(true);
           jg.setSize(600,400);
    
      }
   /* public void close() {
        WindowEvent we = new WindowEvent(null, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
       
    }
     */

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }


    public static void main(String[] args) {
        JFrame gf = new JFrame();
        Online_Game st = new Online_Game();
        //declared the Timer outside of the main method as a class variable
        //so that i can access t in GameOver() and call its t.stop()
        //to stop the timer. Once the timer is stopped, then it wont call the actionPerformed()
        st.t = new Timer(15, st);
        st.t.start();
        gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         gf.setTitle("Moving to Stop");
        gf.add(st);
        gf.setVisible(true);
    }

}


