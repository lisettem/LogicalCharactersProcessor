# LogicalCharactersProcessor
Worked in a team to create a program that uses test-driven development. The program resembles a processor that will receive a series of characters as input and produce a series of characters as output. The processor may house any number of processing blocks. Not all blocks that are available may be used when creating a processor. Also, a block may be used more than once at the same time.
 Blocks used in this program are as follows:
 1. UpperCaseConverter Block
	Given a character, this block will send out or return the character in uppercase.

2. LowerCaseConverter Block
	Given a character, this block will send out or return the character in lowercase.
	
3. Multiplier Block
  Given a character, this block will send out or return two of the same character. For example, if it received 'a', it will produce 'aa'. If it receives '1', it will produce '11'.

4. z-blocker Block
  Given a character, if the character is a lowercase 'z', this block will not return or produce anything. If it is any other character, it will produce the given character as output. For example, 'a' will result in an output of 'a'.

5. Z-blocker Block
	This block will not return or produce an output if the character given is an uppercase 'Z'.
	
6. k-blocker Block
   This block will not return or produce an output if the character given is lowercase 'k'.
   
The user may also create their own block and use it in conjunction with the rest or on its own. 
