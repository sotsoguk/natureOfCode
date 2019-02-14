PVector acc, loc, vel;

int width = 640;
int height = 480;

void setup() {
    size(640,480);
    background(0);
    loc = new PVector(width / 2, height /2);
    vel = new PVector(5,0);
    acc = new PVector(0,0);
    stroke(0);
        
}

void draw() {
    background(0);
    vel = vel.add(acc);
    loc = loc.add(vel);
    if (loc.x > width)
        loc.x = 0;
    if (loc.x < 0 )
        loc.x = width;
    ellipse(loc.x, loc.y, 20, 20);
}

void keyPressed(){
    int keyIndex = -1;
    if (key == 'a')
        vel.x /= 1.1;
    if (key == 's')
        vel.x *= 1.1;
}
