color red = color(255, 0, 0);
color green = color (0, 255, 0);
color yellow = color (255, 255, 0);
color grey = color (128, 128, 128);

void setup() {
  size(200, 500);
  background(0);
  frameRate(1);
  ellipseMode(CENTER);
  fill(128);
  ellipse(100, 100, 150, 150);
  ellipse(100, 260, 150, 150);
  ellipse(100, 420, 150, 150);
}
void draw() {
  if (frameCount == 1) {
    fill(red);
    ellipse(100, 100, 150, 150);
  } else if (frameCount>1 && frameCount <=2) {
    fill(grey);
    ellipse(100, 100, 150, 150);
    fill(yellow);
    ellipse(100, 260, 150, 150);
  } else if (frameCount >2 && frameCount <=3) {
    fill(grey);
    ellipse(100, 100, 150, 150);
    fill(grey);
    ellipse(100, 260, 150, 150);
    fill(green);
    ellipse(100, 420, 150, 150);
  } else if (frameCount >3) {
    fill(grey);
    ellipse(100, 420, 150, 150);
  }
}
