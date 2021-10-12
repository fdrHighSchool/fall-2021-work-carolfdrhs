class Animation {
  //declaring variables
  float x;
  float y;
  float Width;
  float Height;
  Animation(float tempX, float tempY, float tempW, float tempH) {
    //setting a temporary X,Y,width,and height 
    x = tempX;
    y = tempY;
    Width = tempW;
    Height = tempH;
  }
  void straight(){
    x =x + random(2,5);//the car goes straight at a random speed
  }
  void display1(){
    imageMode(CENTER);//the image is centered at the point given
    image(car1,x,y,Width,Height);//the image is shown
  }
   void display2(){
    imageMode(CENTER);//the image is centered at the point given
    image(car2[0],x,y,Height,Width);//the image is shown
  }
  void turn(){

  }
  void up(){
  y=y - random(2,8);
  }
  
}
