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

public class noc_01_car extends PApplet {

PVector acc, loc, vel;

int width = 640;
int height = 480;

public void setup() {
    
    background(0);
    loc = new PVector(width / 2, height /2);
    vel = new PVector(5,0);
    acc = new PVector(0,0);
    stroke(0);
        
}

public void draw() {
    background(0);
    vel = vel.add(acc);
    loc = loc.add(vel);
    if (loc.x > width)
        loc.x = 0;
    if (loc.x < 0 )
        loc.x = width;
    ellipse(loc.x, loc.y, 20, 20);
}

public void keyPressed(){
    int keyIndex = -1;
    if (key == 'a')
        vel.x /= 1.1f;
    if (key == 's')
        vel.x *= 1.1f;
}
  public void settings() {  size(640,480); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "noc_01_car" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
