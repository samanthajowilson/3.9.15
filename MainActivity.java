// Prepare Turtle to Draw
hide();
penUp();

// These six functions draw everything. Order matters
// for how different parts of the picture are layered.
drawBackground();
drawAllSeagrass();
drawAllSeaStars();
drawAllFish();
drawAllBubbles();
drawAllSunbeams();

// To do: Repeatedly draw sea grass
function drawAllSeagrass(){
  for (var i = 0; i < 10; i++) {
  moveTo(randomNumber(0,320),450);
  turnTo(0);
  drawSeagrass(randomNumber(5,20));
}}

// To do: Repeatedly draw sea stars 
function drawAllSeaStars(){
  for (var i = 0; i < 10; i++) {
  moveTo(randomNumber(0,320), randomNumber(360,450));
  drawSeaStar(randomNumber(10,30)); 
  }
}

// To do: Repeatedly draw fish
function drawAllFish(){
  for (var i = 0; i< 30; i++){
  moveTo(randomNumber(0,320),randomNumber(0,300));
	drawFish(randomNumber(5,20),randomNumber(200,255),randomNumber(100,150),120);
}
}

// To do: Repeatedly draw bubbles
function drawAllBubbles(){
for (var i = 0; i < 200; i++) {
   moveTo(randomNumber(0,320),randomNumber(0,450));
  drawBubble(randomNumber(1,5)); 
  }  
}

// To do: Repeatedly draw sunbeams
function drawAllSunbeams(){
  for (var i = 0; i < 75; i++) {
  moveTo(randomNumber(-50,320),0);
  turnTo(randomNumber(165,175));
  drawSunbeam(randomNumber(100,400));  
}
}
// Make the background by drawing a large blue dot
function drawBackground(){
  penColor("LightGray");
  dot(1000);
}

// Draw a five-pointed star with a wide pen of the given size
function drawSeaStar(size){
  for (var i = 0; i < 4; i++) {
  penRGB(255,0,255);
  penWidth(10);
  penDown();
  turnTo(0);
  }
  
  
  moveForward(size);
  turnRight(144);
  moveForward(size);
  turnRight(144);  
  moveForward(size);
  turnRight(144);
  moveForward(size);
  turnRight(144);
  moveForward(size);
  turnRight(144);
  
  penUp();
}

// Switches between left and right arcs to make seaGrass with the given radius
function drawSeagrass(radius){
  for (var i = 0; i < 4; i++) {
  penRGB(0,randomNumber(100,200),0);
  penWidth(3);
  penDown();
  arcLeft(30,radius);
  }
  // Repeatedly switch between left and right
  for(var i = 0; i < 3; i++){
    arcRight(60,radius);
    arcLeft(60,radius);
  }
  penUp();
}

// Draws a fish at the current turtle location with the given size and color
function drawFish(size, red, green, blue){
  penRGB(red,green,blue);
  penWidth(size);
  penDown();
  
  // Fish body
  dot(size);
  turnTo(90);
  moveForward(size);
  
  // Fish tail
  turnLeft(30);
  moveForward(size);
  turnRight(120);
  moveForward(size);
  turnRight(120);
  moveForward(size);
  turnRight(120);
  
  penUp();
}

// Bubbles are semi-transparent dots
function drawBubble(size){
  penRGB(100,100,255,0.2);
  dot(size);
}

// Sunbeams are semi-transparent lines
function drawSunbeam(size){
  penDown();
  penWidth(randomNumber(1,15));
  penRGB(255,255,255,0.1);
  moveForward(size);
  penUp();
}
