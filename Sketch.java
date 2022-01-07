import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(400, 400);
    }

    String message = "";
       public void setup() {
        background(51, 204, 255);
        textSize(25);
    }

    // different lines of code which change the background depending on mouse input
    public void mousePressed() {
      background(150, 150, 150);
    }

    public void mouseReleased() {
      background(51, 204, 255);
    }
    
    // creates a moon whenever the mouse is being dragged
    public void mouseDragged() {
      background(0, 0, 0);
      fill(255, 255, 255);
      ellipse(mouseX, mouseY, 50, 50);
    }

    public void draw() {
        
      // sun follows wherever mouse moves  
      fill(247, 237, 40);
      ellipse(mouseX, mouseY, 50, 50);
        
      
        strokeWeight(4);
        stroke(0, 0, 0);
        fill(117, 73, 41);
        triangle(200, 100, 375, 240, 25, 240);
        
        strokeWeight(3);
        fill(222, 158, 113);
        rect(25, 240, 350, 380);
        
        // when a key is pressed, a copy of a window will be drawn on the other side of the house
        if (keyPressed) { 
        strokeWeight(2);
        fill(60, 189, 222);
        rect(260, 250, 75, 75);
        }
        else{
          strokeWeight(2);
          fill(60, 189, 222);
          rect(60, 250, 75, 75); 
        }

        strokeWeight(2);
        fill(60, 189, 222);
        rect(60, 250, 75, 75);

        // "grass" changes to "dirt" when mouse is pressed, and changes back to "grass" once released
        if (mousePressed) {
          fill(117,104,84);
          rect(0, 380, 400, 300);
        }
        else{ 
        fill(102, 255, 102);
        rect(0, 380, 400, 300);
        }

        float rectX = 150;
        float rectY = 100;
        rect(rectX, rectX + 125, rectY, rectY + 175);
        strokeWeight(2);
        fill(117, 73, 41);

        background(50);
        text(message, 150, 210);
      }
      
        public void keyTyped(){ 
          message += key;
    }
  }
