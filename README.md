# Miko_Assignment1
Simple Assembly Language Interpreter

# Simple Assembly Language Interpreter

This is a Java implementation of a simple assembly language interpreter. The interpreter can execute assembly language programs consisting of MOVE (MV) and ADD instructions and display the contents of registers.

## Features

- Supports MOVE (MV) instructions to load constants into registers.
- Supports ADD instructions to perform addition operations on registers and constants.
- Displays the contents of registers using SHOW instructions.

## Classes

* Addreg // For adding reg value in ither reg or constant valiue in reg
* CreateReg // for creating register and store its value 
* ShowReg // for showing the data from the txt file
* WriteData // write data in txt file
* ReadData //read data from txt file
* LoadData // Load the old data Or retrive the old data and use it 
![Screenshot (185)](https://github.com/Tanvirpirjada/Miko_Assignment1/assets/111841729/e7dd994e-0961-487f-b8a9-1144a64adfe1)
![Screenshot (186)](https://github.com/Tanvirpirjada/Miko_Assignment1/assets/111841729/9d27f77c-0943-4e02-8223-b435cb1e891e)
![Screenshot (187)](https://github.com/Tanvirpirjada/Miko_Assignment1/assets/111841729/42c5d228-d1c9-4533-86b5-228e3e0de9d8)
![Screenshot (188)](https://github.com/Tanvirpirjada/Miko_Assignment1/assets/111841729/0615e3fb-7a21-4fc8-bbdd-7389d5477f5c)
![Screenshot (189)](https://github.com/Tanvirpirjada/Miko_Assignment1/assets/111841729/985ad1a5-4dd7-4bb1-a3b6-c1afcd2c3f8d)
![Screenshot (190)](https://github.com/Tanvirpirjada/Miko_Assignment1/assets/111841729/1d7ff163-943f-429f-88ba-41fab88388bb)
![Screenshot (191)](https://github.com/Tanvirpirjada/Miko_Assignment1/assets/111841729/96902754-0d22-4e80-8d97-141b9d4995ce)
![Screenshot (192)](https://github.com/Tanvirpirjada/Miko_Assignment1/assets/111841729/29d57db6-d89c-4654-abe3-b1ded0dc7549)

# How to Run

* Just Create the Object of ShowReg And run The Run Method

## DataStructurea and Languges

* HashMap Data struncture is use for storing reg and its value in key value pair
*  Java langauge Use for this code
*

## Commands
 * MV REG1,#2000
 * MV REG2,#4000
 * ADD REG1, REG2
 * ADD REG1,600
 * SHOW REG1

## Limitations
Supports only MOVE (MV) and ADD instructions.
Registers are represented as strings (e.g., "REG1", "REG2").
Supports only integer constants and register values.
Does not handle errors or exception cases.
