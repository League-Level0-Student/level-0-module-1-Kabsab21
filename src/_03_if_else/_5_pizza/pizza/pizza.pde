PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(500,500);
    pepperoni = loadImage("pepperoni.png");
    mushroom = loadImage("mushroom.png");
     olive = loadImage("olive.png");
}

void draw() {
   fill(240,230,220);
   ellipse(250,250,200,200);
   image(pepperoni,200,230);
   image(mushroom,130,200);
   image(olive,200,140);
   
}
