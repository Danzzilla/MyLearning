/*
Daniel Svirida
11/3/21
script.js

file responsible for the skyline painted in html canvas
*/

"use strict";
//constants
/*
"Height" relates to the height of the object itself
"Position" relates to the x or y position of the object
*/

const CANVAS_WIDTH = 600;
const CANVAS_HEIGHT = 400;

const WATER_HEIGHT = 125;
const GROUND_HEIGHT = 8;
const GROUND_POSITION = 270;

const BUILDING_Y_POSITION = 274;
const BUILDING_MARGIN = 40;
const NUM_BUILDINGS = 20;
const BUILDING_WIDTH = 55;
const BUILDING_MIN_HEIGHT = 60;
const BUILDING_MAX_HEIGHT = 200;

const WINDOW_SIZE = 5;
const WINDOW_MARGIN_INNER = 5;
const WINDOW_MARGIN_OUTER = 10;


//canvas
let canvas = document.getElementById("canvas");
let ctx = canvas.getContext("2d");

//start paint canvas
scene();

function scene(){
    drawBackground();
    drawWater();
    drawGround();
    drawSkyline();
    writeCityName();
}

//----------------------------------------------------------------------------------

function drawBackground(){
    let background = new Path2D();
    background.rect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);

    ctx.fillStyle = "#4287f5";
    ctx.fill(background);
}

function drawWater(){
    let water = new Path2D();
    water.rect(0, CANVAS_HEIGHT - WATER_HEIGHT, CANVAS_WIDTH, WATER_HEIGHT);
    
    ctx.fillStyle = "#002e78";
    ctx.fill(water);
}

function drawGround(){
    let ground = new Path2D();
    ground.rect(0, GROUND_POSITION, CANVAS_WIDTH, GROUND_HEIGHT);

    ctx. fillStyle = "#525559";
    ctx.fill(ground);
}

function drawSkyline(){
    for(let i = 0; i < NUM_BUILDINGS; i++){
        drawBuilding();
    }
}

function drawBuilding(){
    const BUILDING_HEIGHT = random(BUILDING_MIN_HEIGHT, BUILDING_MAX_HEIGHT);
    const BUILDING_X_POSITION = random(BUILDING_MARGIN,
        CANVAS_WIDTH - (BUILDING_MARGIN + BUILDING_WIDTH));

    let building = new Path2D();
    building.rect(BUILDING_X_POSITION, BUILDING_Y_POSITION - BUILDING_HEIGHT,
        BUILDING_WIDTH, BUILDING_HEIGHT);

    ctx.fillStyle = "#0a0a0a";
    ctx.fill(building);

    drawWindows(BUILDING_HEIGHT, BUILDING_X_POSITION);
}

function drawWindows(buildingHeight, buildingPosition){
    for(let windowHeight = buildingHeight - WINDOW_MARGIN_OUTER; windowHeight >= WINDOW_MARGIN_OUTER * 1.3; 
     windowHeight -= (WINDOW_SIZE + WINDOW_MARGIN_INNER)){
        for(let i = WINDOW_MARGIN_OUTER; i < BUILDING_WIDTH - WINDOW_MARGIN_OUTER; i += (WINDOW_SIZE + WINDOW_MARGIN_INNER)){
            const WINDOW_X_POSITION = buildingPosition + i;

            let window = new Path2D();
            window.rect(WINDOW_X_POSITION, BUILDING_Y_POSITION - windowHeight, WINDOW_SIZE, WINDOW_SIZE);

            ctx.fillStyle = "#bfbfbf";
            ctx.fill(window);
        }
    }
}

function writeCityName(){
    ctx.fillStyle = "#dedede";
    ctx.font = "32px sans-serif";
    ctx.fillText("Boston", 10, 35);
}

function random(low, high){
    return Math.random() * (high - low + 1) + low;
}