package OOPs;
import java.util.*;
public class Question02 {
    /* Access Modifiers:-
    1) public:- all packages
    2) private:- same class
    3) default:- same package
     */

    /*You can import a public class from different package using import 'packagename'.'classname'
    for eg:- if i want to use my class student in other package than OOPs than i need to wirte
    import OOPs.student;*/

    /* In the students class data types like(name,roll,percentage) are writen with no access modifier(like public,private)
    which automatically puts them in 'default'.

    Now if i imported the student class in package using import OOPs.student; it wont show any error but i wont be able to
    access (name,roll,percentage) because they all lie in 'default'.

    For making them accessable outside that particular package, I need to write:- public String name, public int roll & etc.
     */
}