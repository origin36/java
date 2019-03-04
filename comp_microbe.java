/*********************************************************************************
*ComputerMicrobe.java
*Daniel Wight
*
*Class for WightDanielWeek7Prog with Microbe DNA objects and calculations
**********************************************************************************/

import java.util.Random;

public class ComputerMicrobe
{
	private Random random = new Random();
	private String name;  //Auxiliar ComputerMicrobe name
	private String dNACode;  //Auxiliar ComputerMicrobe DNA Code

	public String toString(){  //converts values to strings
		return String.format("[%s] %s",this.getDNACode(), this.getName());
	}
	public ComputerMicrobe(String newName, String newDNACode){  //Overloaded constructor
		this.setName(newName);
		this.setDNACode(newDNACode);
	}
	public ComputerMicrobe(){  //Default Constructor
		this ("NN", "NN");
	}

//Accessor Methods

	public String getName(){
		return this.name;
	}
	public String getDNACode(){
		return this.dNACode;
	}

//Mutator Methods

	public void setName(String name){
		this.name = name;
	}
	public void setDNACode(String dNACode){
		this.dNACode = dNACode;
	}

//Calculation Methods

	public ComputerMicrobe mutate()  //inserts an "X" in place of a randomly chosen location in the name
	{
		String tempMutate = new String(this.getDNACode());  //creation of constant string used in calculations
		int rand = random.nextInt(this.getDNACode().length());  //creation of random number

		this.dNACode = tempMutate.substring(0, rand) + 'X' + tempMutate.substring(rand + 1);
		return this;
	}  //end mutate
	public ComputerMicrobe reverse()  //reverses the order of the DNACode
	{
		String tempReverse = new String();  //creation of constant string used for constructing reverse

		for (int i = this.getDNACode().length() - 1; i >= 0; i--)
		{
			tempReverse += this.getDNACode().charAt(i);
		}  //end for
		this.dNACode = tempReverse;
		return this;
	}  //end reverse
	public ComputerMicrobe reproduce(ComputerMicrobe otherComputerMicrobe)  //reproduction of two computerMicrobes
	{
		String dnaString1 = new String(this.getDNACode());  //DNA string of first computerMicrobe
		String dnaString2 = new String(otherComputerMicrobe.getDNACode());  //DNA string of second computerMicrobe
		int dnaLength1 = this.getDNACode().length();  //length of DNA string of first computerMicrobe
		int dnaLength2 = otherComputerMicrobe.getDNACode().length();  //length of DNA string of second computerMicrobe

		String combineName = new String(this.getName() + otherComputerMicrobe.getName());  //creation of new name
		String combineDNA = dnaString1.substring(0, dnaLength1/2) + dnaString2.substring(0, dnaLength2/2);  //creation of new DNA

		ComputerMicrobe computerMicrobe = new ComputerMicrobe(combineName, combineDNA);  //creation of new computerMicrobe
		return computerMicrobe;
	}  //end reproduce
	public ComputerMicrobe invadedBy(ComputerMicrobe otherComputerMicrobe)  //invasion of one computerMicrobe DNA with another
	{
		this.dNACode = otherComputerMicrobe.getDNACode();  //swapping DNA
		return this;
	}  //end invadedBy
}  //end class