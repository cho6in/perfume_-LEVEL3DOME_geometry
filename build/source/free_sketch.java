import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class free_sketch extends PApplet {

// void setup() {
//   // background(0, 100, 150);
//   size(600, 600);
//
// }
//
// void draw() {
//   background(255, 255, 255);
//
//   pushMatrix();
//   translate(width/2, height/2);
//
//   int d = 10;
//   int num = 360;
//   int t = 4;
//   for (int i = 0; i < num; i++) {
//     noStroke();
//     if (i % 3 == 0) {
//       fill(0, 0, 200);
//       d = 10;
//     } else {
//       fill(0, 150, 200);
//       d = 5;
//     }
//     float R = 150 * abs(sin(radians(i*t)));
//     float x = R * cos(radians(i * 360 / num));
//     float y = R * sin(radians(i * 360 / num));
//     ellipse(x,y,d,d);
//   }
//   popMatrix();
// }


float r = 300;
int num = 12;

public void setup() {
  
}

public void draw() {
  background(255, 255, 255);

  pushMatrix();
  translate(width * 0.5f, height * 0.5f);
  stroke(0);
  for (int i = 0; i < num; i++) {
    for (int j = 0; j < num; j++) {
      if (i != j) {
        // line(r * cos(2.0 * PI / num * i), r * sin(2.0 * PI / num * i), r * cos(2.0 * PI / num * i), r * sin(2.0 * PI / num * i));
        line(r * cos(2.0f * PI / num * i), r * sin(2.0f * PI / num * i), r * cos(2.0f * PI / num * j),r * sin(2.0f * PI / num * j));
        line(r * cos(2.0f * PI / num * (i+0.5f)), r * sin(2.0f * PI / num * (i+0.5f)), r * cos(2.0f * PI / num * (j+0.5f)), r * sin(2.0f * PI / num * (j+0.5f)));
      }
    }
  }
  popMatrix();
}
  public void settings() {  size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "free_sketch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
