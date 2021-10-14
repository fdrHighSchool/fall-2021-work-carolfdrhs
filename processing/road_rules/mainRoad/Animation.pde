class Animation {
  //declaring variables
  float x;
  float y;
  float Width;
  float Height;
  float theta;
  float index = 0; 
  
  
  
  Animation(float tempX, float tempY, float tempW, float tempH) {
    //setting a temporary X,Y,width,and height 
    x = tempX;
    y = tempY;
    Width = tempW;
    Height = tempH;
    
    
  }//end animation
  
  
  void straightRight(){
    x += 4;
  }//end straightright
  
  
  void straightLeft(){
    x -= 4;
  }//end straightLeft
  
  
  void display1(){
    imageMode(CENTER);//the image is centered at the point given
    image(car1,x,y,Width,Height);//the image is shown
    
    if(x <= 400) {
      straightRight();
      
      if(x == 400 && y == 450) {
        noLoop();//stops the loop
      }//end if
      
    }//end if
    loop();//loops
    
  }//end display1
  
  
  
  void up() {
    y -= 3;
  }//end up
  
  
  void display2() {
    pushMatrix();
    imageMode(CENTER);//the image is centered at the point given;
    translate(x, y);
    image(car2[0],0,0,Height,Width);//the image is shown
    //println(y);
    
    if(y == 400) {
      noLoop();
      //delay(2000); //stops the car
      
      if(y == 400) {
        loop();
        up();
      }//end if
      
    } else { 
        loop();
        up();
      }//end else
    popMatrix();
    
    if(y <= 200) {
      //noLoop();
      //redraw();
      //translate(x, y);
      //rotate(PI/3);
      
    }//end if
   
    
  }//end display 2

  

}//end class
