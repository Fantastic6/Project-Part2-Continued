# Test Instructions - Part 2

## LDR

Instruction: LDR 1,0,2[,0]

Load register 1 with the contents of memory location 1. 

Steps:

1. Put the instruction in the console. Hit Enter. 
2. Set mem[2] = 10.
3. Push SSS.
4. R[2] = 10. 

## STR

Instruction: STR 2,1,21[,0]

Store the contents of register 2 into memory location 21.

Steps: 

1. Put the instruction in the console. Hit Enter.  
2. Set R[2] = 7.
3. Set I1 = 1. 
4. Click SSS. Look at memory location 21. It should be 7. 

## LDA

Instruction: LDA 0,1,27[,1]

Load register 0 with address 27. 

Steps:

1. Put the instruction in the console. Hit enter. 
2. Set mem[27] = 15.
3. Set I[1] = 7.
4. Click SSS. Look at the contents of register 0. It should be 15.

## LDX

Instruction LDX 0,1,0[,1]

Load index register from memory location 0.

1. Put the instruction in the console. Hit Enter.
2. Set mem[0] = 31, set PC = 1.  
3. Click SSS. Look at the contents of I1. It should be 31. 

## STX

Instruction: STX 0,2,0[,0]

Store index register 0 to memory location 0

1. Put the instruction in the console. Hit Enter.
2. Set I2[2] = 31.
3. Click SSS. Look at the contents of mem[0]. It should be 31. 

## AMR

Instruction: AMR 3,0,0[,0]

Add the contents of address 0 with the contents of register 3

1. Put the instruction in the console. Hit Enter. 
2. Set mem[0] = 7. 
3. Set R[3] = 3.
4. Click SSS. Look at the contents of R[3]. It should be 10. 

## SMR

Instruction: SMR 3,0,0[,0]

Subtract the contents of memory location 0 from the contents of register 3. 

1. Put the instruction in the console. Hit Enter. 
2. Set mem[0] = 5. 
3. Set R[3] = 3, set PC = 1.
4. Click SSS. Look at the contents R[3]. It should be -2. 

## AIR

Instruction: AIR 3,2

Add the contents of address 0 to the contents of register 3. 

1. Put the instruction in the console. Hit Enter.  
2. Set R[3] = 7. 
3. Click SSS. Look at the contents R[3]. It should be 9. 

## SIR

Instruction: SIR 3,31

Subtract the contents of intermediate from the register.

1. Put the instruction in the console. Hit Enter.  
2. Set R[3] = 47.
3. Click SSS. Look at the contents R[3]. It should be (47 - 31 = 16)