PFont marvel;


void setup(){
  size(600,600);
  background(255);
  marvel = createFont("Marvel-Regular.ttf",200);
 
}
void draw(){
  //quad(x1, y1, x2, y2, x3, y3, x4, y4)
  fill(240, 19, 30);
  rect(50, 60, 475, 180);
  fill(255);
  textSize(140);
  textFont(marvel);
  text("MARVEL", 80,220);
  
  
  
}
