AudioSample doh;
AudioSample woohoo;
void setup() {
      PImage waldo = loadImage("waldo.jpg"); // 5. Change this to match your file name.
      size(1000, 726);
      image(waldo, 0, 0);
      woohoo = minim.loadSample("yay.wav");
      doh = minim.loadSample("wrong.wav");
}

void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
      //println("X: " + mouseX + " Y: " + mouseY); 
      println("X: " + mouseX + " Y: " + mouseY);
      // 7. If the mouse is on Waldo, print “Waldo found!”
      if(mousePressed){
        if(mouseX > 413 && mouseX < 449 && mouseY > 490 && mouseY < 561){
          println("Yay! You found Waldo!");
          playWoohoo();
        }
        else{
          println("That's not Waldo!");
          playDoh();
        }
      }
      // 8. If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 