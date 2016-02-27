# Design Documentation 

The interface is the same as Part 1 except for some small changes. 

First, we added a row of fields for the condition codes. 

Second, we also added a command prompt at the bottom for users to type in the instruction and run a program. 

We have two new classes:

## Translate.java

This class serves as a compiler for the processor. 

It takes the instruction from the interface (Controller) and turns it into a short value for the CPU to process. 

## cache.java

Implemented following the specifications:

1. Fully associative
2. Uniform
3. 16 lines
4. block size: 4 words

The API consists of a getter and setter:

1. cache.write: Takes an address and a value to write to. 
2. cache.read: Takes an address to read form. 


Other changes:

Since the cache now sits between the CPU and interface, both the CPU and the interface will only interact with cache. Memory is initialized in cache and handled by cache. 

All of the instructions for part II were added to CPU, including 
JZ, JNE, JCC, JMA, JSR, RFS, SOB, JGE, MLT, DVD, TRR, AND, ORR, NOT, 
SRC, RRC, IN, OUT. 








