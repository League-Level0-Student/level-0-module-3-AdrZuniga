
void setup() {
 size(500, 500);
  // set the size of your sketch
  
}

void draw() {
  int w=110;
 int h=110;
  for(int i = 0; i<24; i++){
    if( w % 2 == 0){
      Color(red); 
    } else {
      Color(blue);
    }
      

//ellipse(200,160,110,110);
//ellipse(200,160,85,85);
// ellipse(200,160,50,50);
 ellipse(200,160,w,h);
 
 w = w - 5;
h = h -5;
 
 
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
