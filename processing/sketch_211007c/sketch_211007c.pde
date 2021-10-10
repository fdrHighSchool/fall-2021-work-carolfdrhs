PImage photo;

void setup(){
  size(800,800);
  background(255);
  photo = loadImage("car.png");
}

void draw(){
  image(photo,400,200);
  
}
