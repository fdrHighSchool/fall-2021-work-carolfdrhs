PImage photo;

Animation c1;

void setup() {
  size(1000, 900);
  strokeCap(0);
  photo = loadImage("car face right.png");//loading the car image
  c1 = new Animation(-300,150,215,128);
}
void draw() {
  background(50);
  fill(255);
  
  
  createIntersectLR(0, 240);
  createIntersectLR(0, 720);
  
  createIntersectTB(775, 10);
  createIntersectTB(775, 530);
  
  createLine(240, 300, 163);
  createLine(240, 320, 163); //matrix solves relativety
  
  createLine(490, 570, 73);
  createLine(510, 570, 73);
  
  c1.straight();//using the function
  c1.display();//using the function
  
}
void createIntersectLR(float direction, float marginLeft) {
  noStroke();
  rotate(direction); //optional?
  int begin_y = 20;
  for(int i = 0; i < 12; i++) {
    int increment_y = begin_y += 40;
    fill(255);
    rect(marginLeft, increment_y, 40, 20);
  }
}
void createIntersectTB(float justifyX, float justifyY) {
  pushMatrix();
  translate(justifyX, justifyY);
  rotate(HALF_PI);
  int x_space = 0;
  for(int i = 0; i < 12; i++) {
    fill(255);
    rect(0, x_space += 40, 40, 20);
  }
  popMatrix();
}

void createLine(float left, float top, float rotation) {
  pushMatrix();
  translate(left, top);
  rotate(radians(rotation));
  stroke(255,255,0);
  strokeWeight(10);
  line(0, 0, 300, 90);
  popMatrix();
}



//git 
