class Animation {
  //declaring variables
  float x;
  float y;
  float Width;
  float Height;
  float theta;
  Animation(float tempX, float tempY, float tempW, float tempH) {
    //setting a temporary X,Y,width,and height 
    x = tempX;
    y = tempY;
    Width = tempW;
    Height = tempH;
    theta = 0;
  }
  void straight(){
    x += 4;
  }
  void display1(){
    imageMode(CENTER);//the image is centered at the point given
    image(car1,x,y,Width,Height);//the image is shown
    
    //if(x <= 400) {
    //  straight();
    //  if(x == 400 && y == 450) {
    //    noLoop();
    //  }
    //}
    //loop();
  }
  
  void up() {
    y -= 3;
  }
  void display2() {
    pushMatrix();
    imageMode(CENTER);//the image is centered at the point given;
    translate(x, y);
    image(car2[0],0,0,Height,Width);//the image is shown
    //println(y);
    if(y == 400) {
      noLoop();
      delay(2000);
      if(y == 400) {
        loop();
        up();
      }
    } else {
      loop();
      up();
    }
    popMatrix();
    if(y <= 200) {
      noLoop();
      redraw();
      translate(x, y);
      rotate(PI/3);
    }
  }
}
