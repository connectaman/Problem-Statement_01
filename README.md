# Problem-Statement_01
Given input N, using N-bit representation the lowest value corresponding to all bits with value '0' and highest value 
corresponds to all bits with value '1'. Taking the lowest value as 1, and highest value as 2n, Generates N sets each having 2n-1 numbers
in it.The set S1 corresponds to all those values where 1st bit i.e bit number 0 (LSB) is set to 0, and set Sn corresponds to all those values where Nth bit(MSB) is set to 0.
For exmaple , if N=3, three sets would be
S1(xx0) = 1,3,5,7
S2(x0x) = 1,5,2,6
s3(0xx) = 1,2,3,4
