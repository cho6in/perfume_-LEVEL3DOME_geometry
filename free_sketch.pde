float r = 300;
int num = 12;

void setup() {
  size(800, 800);
}

void draw() {
  background(255, 255, 255);

  pushMatrix();
  translate(width * 0.5, height * 0.5);
  stroke(0);
  for (int i = 0; i < num; i++) {
    for (int j = 0; j < num; j++) {
      if (i != j) {
        // line(r * cos(2.0 * PI / num * i), r * sin(2.0 * PI / num * i), r * cos(2.0 * PI / num * i), r * sin(2.0 * PI / num * i));
        line(r * cos(2.0 * PI / num * i), r * sin(2.0 * PI / num * i), r * cos(2.0 * PI / num * j),r * sin(2.0 * PI / num * j));
        line(r * cos(2.0 * PI / num * (i+0.5)), r * sin(2.0 * PI / num * (i+0.5)), r * cos(2.0 * PI / num * (j+0.5)), r * sin(2.0 * PI / num * (j+0.5)));
      }
    }
  }
  popMatrix();
}
