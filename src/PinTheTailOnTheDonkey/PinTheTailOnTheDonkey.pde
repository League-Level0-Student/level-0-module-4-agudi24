
boolean soundplayed = false;

import ddf.minim.*;    
//at the top of your sketch
PImage donkey;
PImage tail;
int x;
int y;
void setup() {

//in setup
 size (612,408);
 donkey = loadImage("donkey.jpg");
 donkey.resize(612,408);
 background(donkey);
 tail=loadImage("tail.png");
 tail.resize(150,150);
 }

void draw(){

   
  background(0);
  println("X: " + mouseX + " Y: " + mouseY);
  if(mouseX<60&&mouseX>0&&mouseY<50&&mouseY>0){
  background(donkey);
  }
  else{
  background(0);
  }

  if(mousePressed){
  (tail, x, y  
  }
  else{
  image(tail, mouseX, mouseY);
  }
  if(x<561&&x>478&&y<221&&y>160){
    println("You Win!");
    background(donkey);
  }

 if(!soundplayed){
   
 soundplayed=true;
 }  //where you want the sound to play
  }