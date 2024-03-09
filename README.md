# GrowSkill E-Learning Platform 

## Description
GrowSkill is an e-learning platform that provides paid online live courses in Baking, Makeup, and Handicrafts. This README specifically focuses on describing the backend functionality of the platform.

## Functionality
The backend of the GrowSkill platform is implemented using Java with the Spring Boot framework. Below are the key functionalities implemented on the backend:

1. **User Management**: Users can register for an account on the platform by providing basic information such as name, email, and password.

2. **Course Management**: Courses are managed by the platform administrators. Admins can create, read, update, and delete courses. Each course has attributes such as name, description, instructor, schedule, and Zoom link for live classes.

3. **Instructor Management**: Instructors are managed by the platform administrators. Admins can create, read, update, and delete instructor profiles. Each instructor profile contains details about the instructor's expertise and the courses they offer.

4. **Class Management**: Classes are the individual sessions within each course. They have specific dates, times, topics, and Zoom links. Class management functionalities include creating, reading, updating, and deleting classes.

5. **Enrollment and Payment**: Users can enroll in courses and make payments. Upon successful payment, users gain access to live classes and course materials.

6. **Data Persistence**: Data related to users, courses, instructors, and classes are persisted using Spring Data JPA. The backend uses an MySQL database for development and can be configured to use other databases for production.


## Setup
1. Clone the repository: `git clone https://github.com/sudharshan2151/GrowSkill.git`
2. Navigate to the project directory: `cd growskill`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`
5. Access the application in your web browser: `http://localhost:8080`

## Database
![Untitled (1)](https://github.com/sudharshan2151/GrowSkill/assets/123924081/91c5500d-581b-433d-88f5-df2f92b500f9)

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
