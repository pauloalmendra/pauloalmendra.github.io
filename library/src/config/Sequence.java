package config;

/*---------------------------------------------------------------------------*/
/**
 * @class Sequence
 * 
 * @brief Sequence class brief description 
 *  
 * @author almendra
 */
public abstract class Sequence {

	/**
	 * Set all needed initial conditions to run the test case 
	 */
	public abstract void initialCondition();
	
	/**
	 * Execute all test steps
	 */
	public abstract void exec();
	
}
