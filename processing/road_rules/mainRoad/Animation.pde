class Animation {
  //declaring variables
  float x;
  float y;
  float Width;
  float Height;
  float index = 0; 
 
  
  Animation(float tempX, float tempY, float tempW, float tempH) {
    //setting a temporary X,Y,width,and height 
    x = tempX;
    y = tempY;
    Width = tempW;
    Height = tempH;
    
    
  }//end animation
  
  
  void straight(int count){
    x += count;
  }//end straightright
  
  
  void display1(){
    imageMode(CENTER);//the image is centered at the point given
    image(car1,x,y,Width,Height);//the image is shown
    
    if(x <= 120) {
      straight(4);
      if(x == 120) {
        noLoop();//stops the loop
        delay(500);
        delay(3000);
      }
      
      if(y <= 200) {
        
        loop();
        straight(6);
      }
      
    }//end if
    loop();//loops
    
  }//end display1
  
  
  
  void up(float count) {
    y -= count;
  }//end up
  
  
  void display2() {
    pushMatrix();
    imageMode(CENTER);//the image is centered at the point given;
    //translate(x, y);
    //rotate(radians(270));
    image(car2[0],x,y,Height,Width);//the image is shown
    //println(y);
    
    if(y == 400) {
      noLoop();
      delay(4000); //stops the car
      
      if(y == 400) {
        loop();
        up(3.2);
      }//end if
      
    } else { 
        loop();
        up(3.2);
        
        if(y <= 200) {
          translate(x,y);
          rotate(radians(270));
          noLoop();
          loop();
          up(-4.5);
          straight(-6);
        }
        
      }//end else
      
    //end if
    popMatrix();
    
    
   
    
  }//end display 2

  

}//end class
