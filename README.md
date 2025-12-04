
🎓 Simple Student Management System (SMS) - Java Console Application
This is a basic Command-Line Interface (CLI) based Student Management System developed in Java using Object-Oriented Programming (OOP) principles.

This system allows you to manage Students and Courses, and enroll students into courses.

✨ Features
Course Management: Add new courses with ID, Name, and Credit Hours.

Student Management: Add new students with ID and Name.

Enrollment: Enroll students into existing courses.

Data Display: View information for all students, including their enrollments.

🛠️ Prerequisites
To run this project, you must have the following installed on your system:

Java Development Kit (JDK) 8 or a later version.

A Text Editor (like VS Code, Sublime Text) or an Integrated Development Environment (IDE) (like IntelliJ IDEA, Eclipse).

🚀 Getting Started
1. Compiling the Code
Save your code (currently named LongClassExample.java) in a dedicated folder.

Open your Command Prompt/Terminal and navigate to that folder.

Use this command to compile the code:

Bash

javac LongClassExample.java
2. Running the Code
After successful compilation, run the program using this command:

Bash

java LongClassExample
💡 Usage
Once the program is running, an interactive menu will appear:

=== Student Management System ===
1. Add Course
2. Add Student
3. Enroll Student in Course
4. Show All Students
5. Exit
Enter choice:
You can perform functions by entering the corresponding number:

Add Courses (Option 1): Start by adding a few courses.

Add Students (Option 2): Then add a few students.

Enroll Student (Option 3): Enroll a student into an existing course using their respective IDs.

Show All Students (Option 4): View the list of all students with their enrolled courses.

Exit (Option 5): Close the application.

🏗️ Project Structure
The code consists of three (3) main classes, following OOP's Encapsulation principle:

Course: Stores course details (ID, Name, Credit Hours).

Student: Stores student details (ID, Name) and maintains a list of their enrolled Course objects.

StudentManagementSystem: Handles the core logic, such as adding students/courses and managing enrollments.

LongClassExample: The main class containing the main method and the user interface loop.

🤝 Contribution
If you wish to improve this project, please feel free to:

Fork this repository.

Implement your changes.

Submit a Pull Request.

📄 License
This project is not distributed under a specific license and can be used freely for educational purposes.
