void setup(){
  size(1000, 1000);
}
void draw(){
  int w = 500;
  int h = 500;
  for(int i=50; i>0; i--){
  ellipse(500, 500, w, h);
  w= w-10;
  h= h-10;
  if(i % 2 == 0){
  fill(255, 0, 0);
}
else{
  fill(255);
}
}
}