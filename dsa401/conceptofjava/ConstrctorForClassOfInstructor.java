package conceptofjava;

      class ConstrctorForClassOfInstructor{
        // complete the class as mentioned in the problem statement
        String name;
        int age;
        String course_name;
        String coding_language;
        
        ConstrctorForClassOfInstructor(String name, int age,String course_name,String coding_language) {
            this.name = name;
            this.age = age;
            this.course_name = course_name;
            this.coding_language= coding_language;
            name();
            age();
            courseName();
            codingLanguage();
        }
        
        void name(){
           System.out.println(this.name);
        }


        void age(){
           System.out.println(this.name+" "+this.age);
        }
        void courseName(){
           System.out.println(this.name+" "+this.course_name);
        }
        void codingLanguage(){
           System.out.println(this.name+" "+this.coding_language);
        }

        public static void main(String[] args) {
            ConstrctorForClassOfInstructor m = new ConstrctorForClassOfInstructor("Hoshiyar",24,"JA111","JAVA");
        }
      }
      
      






// Class of Instructor 
// Description

// You have to create a class namedinstructor_details, having the following attributes
// String name;
// int age;
// String course_name;
// String coding_language;
// It also contains the following functions
// void name() - This function prints the name of the Instructor on a new line
// void age() - This function prints the age of the Instructor along with the Instructor's name
// void courseName() - This function prints the name of the course, along with the Instructor's name
// void codingLanguage() - This function prints the name of the coding language along with the Instructor's name
// You have to write a class, containing the constructor which will accept the value for the 4 attributes

// You don't have to take the input, just complete the function along with the functions, and the required parameters

// The main function is being handled by the backend, you will just have to complete the function


// Input
// You don't have to take the input or the print the output, just complete the class as mentioned in the problem statement

// Output
// You don't have to take the input or the print the output, just complete the class as mentioned in the problem statement

// Sample Input 1 

// NA
// **Not Applicable**
// Sample Output 1

// Albert
// Albert 28
// Albert RCT101
// Albert Javascript
// -------------------
// Aman
// Aman 27
// Aman DSA501
// Aman C++
// -------------------
// Nrupul
// Nrupul 30
// Nrupul JA111
// Nrupul PHP