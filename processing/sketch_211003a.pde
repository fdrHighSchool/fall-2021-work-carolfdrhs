void setup() {
  size(680, 658);
  background(255);
}
void draw() {
  
   if (mousePressed) {
    background(29,28,26);
    fill(225);
    circle(340,329,400);
    arc(340, 450, 260, 260, PI, TWO_PI);
    fill(0);
    circle(240,250,50);
    circle(440,250,50);
  
   }
   else {
    background(165, 237, 250);
    fill(253,253,150);
    circle(340,329,400);
    fill(255,105,97);
    arc(340, 350, 320, 320, 0, PI, PIE);
    fill(0);
    circle(240,250,50);
    circle(440,250,50);

   }
}
