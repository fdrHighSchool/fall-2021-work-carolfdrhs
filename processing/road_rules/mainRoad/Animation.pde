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
  void display(){
    imageMode(CENTER);//the image is centered at the point given
    image(photo,x,y,Width,Height);//the image is shown
  }

  
}
