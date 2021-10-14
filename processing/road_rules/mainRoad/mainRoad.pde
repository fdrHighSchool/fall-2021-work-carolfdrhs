PImage car1;
PImage[] car2 = new PImage[3];
int numFrames = 0;


Animation c1;
Animation c2;


void setup() {
  size(1000, 900);
  strokeCap(0);
  car1 = loadImage("car face right.png");//loading the car image
  
  for (int i =0; i<car2.length;i++){
    if(i != 1) {
      car2[i] = loadImage("car"+i+".png");
    } //loads the images of the array
  }
  //frameRate(60);
  
  c1 = new Animation(-300,450,215,128);
  c2 = new Animation(620,1000,215,128);
  //numFrames++;
  //numFrames %= car2.length;
  //image(car2[numFrames],0,0);
  

}//end setup


void draw() {
  background(50);
  fill(255);

  road();
  c1.display1();//using the function
  c2.display2();

  
}//end draw


//ROAD CREATION
void road(){
  createIntersectLR(0, 240);
  createIntersectLR(0, 720);
  
  createIntersectTB(775, 10);
  createIntersectTB(775, 530);
  
  createLine(240, 300, 163);
  createLine(240, 320, 163);
  
  createLine(width+80, 300, 163);
  createLine(width+80, 320, 163);
  
  createLine(490, 570, 73);
  createLine(510, 570, 73);
  
  
  
}
void createIntersectLR(float direction, float marginLeft) {
  noStroke();
  rotate(direction);
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
