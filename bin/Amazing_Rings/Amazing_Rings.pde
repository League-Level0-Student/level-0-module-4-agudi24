int x = 250;
int x2 = 750;
int y = 250;
int y2 = 750;
int speed = 10;
void setup(){
  size(1000, 1000);
  noFill();
}
void draw(){
  background(500, 500);
  int w = 250;
  int h = 250;
  for(int i=50; i>0; i--){
  ellipse(x, 500, w, h);
  ellipse(x2, 500, w, h);
  ellipse(500, y, w, h);
  ellipse(500, y2, w, h);
  w= w-10;
  h= h-10;
  }
x=x+speed;
x2=x2-speed;
y=y+speed;
y2=y2-speed;
if (x==1000||x==0||x2==1000||x2==0||y==1000||y==0||y2==1000||y2==0){
  speed=-speed;
}

}