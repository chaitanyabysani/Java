/*The whole idea behind encapsulation is to hide the implementation details from users. 
 *If a data member is private it means it can only be accessed within the same class. 
 *No outside class can access private data member (variable) of other class. 
 *However if we setup public getter and setter methods to update 
 *(for e.g. void setEmpID(int empID))and read (for e.g.  int getEmpID()) 
 *the private data fields then the outside class can access those private data fields via public methods. 
 *This way data can only be accessed by public methods thus making the private fields and their implementation 
 *hidden for outside classes. That’s why encapsulation is known as data hiding. 
 *Lets see an example to understand this concept better.*
 * 
 */
/**
 * @author Chaitanya
 *
 */
package encapsulation;