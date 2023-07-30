PROJECT TITLE :-
-----------------
Standalone T-Shirt Product Search Program with Hibernate :-
------------------------------------------------------------
The Standalone T-Shirt Product Search Program with Hibernate is a Java application designed to assist users in finding T-shirts from popular brands like Nike, Puma, and Adidas. The program utilizes CSV files containing T-shirt data for each brand, and these files are loaded into a database using Hibernate for efficient data storage and retrieval. The program allows users to customize their search based on color, size, gender, and output preference, and all search operations are performed on the database using Hibernate.

Key Features:
-------------
1.CSV Data Source and Hibernate Integration: The program reads and parses T-shirt data from three CSV files, one for each brand (Nike, Puma, and Adidas). The data from these files is persisted in a relational database using Hibernate. This integration ensures that T-shirt details are efficiently managed and readily available for search operations.

2.User Input: Upon execution, the program prompts the user to input the desired T-shirt attributes:
a. Color: The user can specify the preferred color of the T-shirt (e.g., "Red," "Blue," "Black," etc.).
b. Size: The user can select the desired size of the T-shirt (e.g., "Small," "Medium," "Large," etc.).
c. Gender: The user can choose between "M" for male and "F" for female, indicating the intended gender of the T-shirt.
d. Output Preference: The user can define the sorting order for the search results based on "Price," "Rating," or "Both Price and Rating."

3.Dynamic CSV File Loading: The program is designed to handle additional CSV files for more brands or T-shirt data. A separate thread is implemented to periodically check for new files at a configurable location and load the provided file into the database. This ensures that the system can easily accommodate new data sources without requiring manual intervention.

4.Matching Products Search: The program queries the database using Hibernate to find T-shirts that match the user's input criteria. The search results are then listed on the standard output, sorted as per the user's output preference.

5.User-Friendly Output: If no matching T-shirt is found for the given input, the program displays a user-friendly output on the screen, indicating that no products meet the specified criteria.

Overall, the Standalone T-Shirt Product Search Program with Hibernate offers a robust and efficient solution for finding T-shirts from popular brands. Its seamless integration with Hibernate enables smooth data storage and retrieval, while the dynamic CSV file loading feature ensures scalability to accommodate additional data sources. Users can easily search for T-shirts based on their preferences, and the program provides a user-friendly output to facilitate an enjoyable shopping experience.

# Standalone-T-Shirt-Product-Search-Program-with-Hibernate
the Standalone T-Shirt Product Search Program with Hibernate offers a robust and efficient solution for finding T-shirts from popular brands. Its seamless integration with Hibernate enables smooth data storage and retrieval, while the dynamic CSV file loading feature ensures scalability to accommodate additional data sources. 

TECHNOLOGY USED :-
------------------

Maven 3.x Integration: The project uses Maven as the build tool to manage dependencies, making it easy to compile, package, and run the application.

Java 8 Features: The application leverages the new features introduced in Java 8 wherever possible, enhancing code readability and performance.

MySql: Used as a relation database.

PROJECT SCREENSHOT :-
---------------------
<img width="700" alt="t-shirt data searching on console in database using hibernate" src="https://github.com/satyam131/Standalone-T-Shirt-Product-Search-Program-with-Hibernate/assets/73646662/a7f42711-ca01-48bb-a115-7f9198fbe9c4">


