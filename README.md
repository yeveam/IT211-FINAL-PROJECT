# CICS Room Reservation (IT211-FINAL-PROJECT)
	➡️SHAIAME D. GRANADOS
	➡️IT-2106
	➡️IT211: OBJECT-ORIENTED PROGRAMMING

## **I. PROJECT OVERVIEW**
	The CICS Room Reservation aims to provide a streamlined and efficient platform for reserving rooms in various settings such as classrooms and laboratories. The application will facilitate the reservation process, ensuring that users can easily view available rooms, make and manage their reservations. 
 	
	This system aims to help the students, professors, and staff of CICS on reserving rooms within the building. The application exclusively for viewing, reserving, and managing the status of the rooms. This console application covers the OOP principles including encapsulation, inheritance, polymorphism, and abstraction. This console does not include the lessons beyond OOP like Jframe which is for creating graphical user interfaces. 
 
	The target users of this console application are the College of Informatics and Computing Sciences students, professor and staff. This can be used by other Colleges when checking the availability of CICS classrooms.
		
	The CICS Room Reservation system aims to achieve the following specific:
		- To increase the average room utilization rate by 25% within the first six months of implementation.
		- To reduce the average room reservation processing time to under 2 minutes within the first three months of usage.
		- To provide real-time availability information for all rooms, ensuring that 100% of room availability is accurately reflected within the first month of operation.
	
## **II. OOP Principles**
	The CICS Room Reservation project utilizes several key Java concepts and libraries to achieve its functionality. 
 
		1. Java Classes and Objects:
		- Classes are blueprints for creating objects. Room, ComputerLab, SmartRoom, User, AdminUser, GuestUser, Reservation, Login, and Main are all classes used in the project. Objects are instances of classes. When the program runs, it creates objects from these classes to manage room reservations and user logins.
	
		2. Inheritance:
		- Inheritance allows one class to inherit fields and methods from another class. For example, ComputerLab and SmartRoom inherit from the Room class, and AdminUser and GuestUser inherit from the User class. This helps in reusing code and creating a hierarchy of classes.
		
		3. Polymorphism:
		- Polymorphism allows methods to do different things based on the object they are called on. In this project, the displayRoomInfo method in Room is overridden in ComputerLab and SmartRoom to provide specific information for each type of room.
	
		4. Encapsulation:
		- Encapsulation means keeping the internal details of an object hidden from the outside world and only exposing necessary parts. For example, the name and isAvailable fields in the Room class are protected and can only be accessed or modified through methods like getName, isAvailable, reserve, and cancel.
	
		5. Abstraction:
		- Abstraction involves creating a simple model of a complex system by hiding unnecessary details. The User class is an abstract class that provides a template for AdminUser and GuestUser. This way, common login functionality is defined in the User class and specific details are provided in the subclasses.
	
		6. ArrayList:
		- The Reservation class uses ArrayList to store a list of rooms. ArrayList is a part of the Java Collections Framework and provides a way to store and manage a dynamic list of objects.
	
		7. Scanner:
		- The Scanner class is used to read user input from the console. This is seen in the Login and Main classes where the program asks for user input and processes it.

## **III. Sustainable Development Goals (SDG)**
	The CICS Room Reservation project aligns with the following Sustainable Development Goal (SDG):
 
	- 9: Industry, Innovation, and Infrastructure
		The project enhances the infrastructure of educational institutions by providing an efficient, digital method for managing room reservations. This improves the utilization of facilities, reduces scheduling conflicts, and supports a more organized and effective educational environment. By integrating technology into room management, the project promotes innovation within the institution, showcasing how digital solutions can streamline administrative tasks and enhance overall operational efficiency.

	- 17: Partnerships for the Goals
		The project encourages collaboration and coordination within the institution. By providing a shared platform for room reservations, it fosters better communication and cooperation among students, faculty, and administrative staff. The system could also be extended to include partnerships with other educational institutions or organizations, promoting resource sharing and collaborative events, thus enhancing the overall educational infrastructure through collective efforts.

## **IV. INSTRUCTION**
	To be able to use the CICS Room Reservation console application efficiently, follow these steps: 
 
	1. Login to the System
		- When you start the application, you will be prompted to enter your username and password.
		- Use the following credentials for the initial login. 
				Username: admin
				Password: admin
		- If the credentials are correct, you will see a "Login successful!" message.

 	2. Main Menu Options
		- After successful login, you will be presented with the main menu options.
	
 	3. View Available Rooms
		- To view the list of available rooms, select option 1.
		- The system will display a list of available rooms with their room numbers and names.
		- After viewing the available rooms, you can choose to go back to the main menu.
	
 	4. Reserve a Room
		- To reserve a room, select option 2.
		- You will be prompted to enter the room number you wish to reserve.
		- If the room is available, you will receive a confirmation message that the room has been reserved.
		- If the room is already reserved, you will be informed that the room is not available.
	
 	5. Cancel a Reservation
		- To cancel a reservation, select option 3.
		- You will be prompted to enter the room number for which you wish to cancel the reservation.
		- If the room is currently reserved, you will receive a confirmation message that the reservation has been canceled.
		- If the room is not reserved, you will be informed that there is no reservation to cancel.
	
	6. View Reserved Rooms
		- To view the list of reserved rooms, select option 4.
		- The system will display a list of rooms that are currently reserved along with their reservation details.
		- After viewing the reserved rooms, you can choose to go back to the main menu.
	
 	7. Exit the System
		- To exit the application, select option 5.
		- The system will display a message indicating that it is exiting, and the application will close.
