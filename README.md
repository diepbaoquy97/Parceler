# Parceler

### The introduction
Parceler is a code generation library that generates the Android Parcelarable familar source code. Parceler is easy to transfer data from one activity to another activity such as transferring the text that user input in one activity to another activity. For example, when a user enters a keyword in search box, the keyword that user enters should be shown up with the search result in another activities. Therefore, the parceler uses for passing data object, data objects with simple code 
#### Feature
Android Parceler is 10 time faster than using Serializable, but it is required to create a lot of boiler plate code . 

#### To use parceler, we have to import

`import android.os.Parcel;`</br>
`import android.os.Parcelable;`
#### Implementation needed in app gradle
Add these two following in app gradle

`implementation 'org.parceler:parceler-api:1.1.12'`</br>
 `annotationProcessor 'org.parceler:parceler:1.1.12'`


### The library
The library of Parceler includes Parceler utility class to wrap and unwrap object. This could be very handy if we want to get the parceler object from intent.

### Major method

writeToParcel() and createFromParcel() are methods that read and write to parcel in same order. We don't have to implement the Parcel interface, it already had in its library.</br>
The methods getter and setter and non-empty constructor are using in order to serialize.

### How to pass an object
First, we have to create an object. I have created an user java class which contain the name and age. By android studio, It will create all the getter and setter method and constructor.


[source,java]


@Parcel
public class User {
    String Name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.Name = name;
        this.age = age;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
 } 



