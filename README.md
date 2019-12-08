# Parceler

## Table of Contents
1. [Introduction](#introduction)
2. [Feature](#feature)
3. [The Library](#the-library)
4. [Major methord](#major-method)
5. [How to pass an object](#how-to-pass-an-object)
6. [Reference](#Reference)
 

### The simple project of parceler
So here is the link to my parceler project. I placed it under the Parceler branch.
[Demo Project](https://github.com/diepbaoquy97/Parceler/tree/Parceler).
### Introduction
Parceler is a code generation library that generates the Android Parcelarable familar source code. Parceler is easy to transfer data from one activity to another activity such as transferring the text that user input in one activity to another activity. For example, when a user enters a keyword in search box, the keyword that user enters should be shown up with the search result in another activities. Therefore, the parceler uses for passing data object, data objects with simple code 
#### Feature
Android Parceler is 10 time faster than using Serializable, but it is required to create a lot of boiler plate code . 
The boiler code such as getter and setter are easy to generate by the android studio
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

```
@Parcel
public class User{
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
```

The data type filed must not be private in order to create a new object.
The Parceler library works by using the @Parcel annotation to generate the wrapper classes. It works with many of the most standard Java types, including: </br>

`byte`

`double`

`float`

`int`

`long`

`char`

`boolean`

`String`

`IBinder`

`Bundle`

`SparseArray of any of the mapped types*`

`SparseBooleanArray`

`ObservableField`

`List, ArrayList and LinkedList of any of the mapped types*`

`Map, HashMap, LinkedHashMap, SortedMap, and TreeMap of any of the mapped types*`

`Set, HashSet, SortedSet, TreeSet, LinkedHashSet of any of the mapped types*`

`Parcelable`

`Serializable`


### The Wrap function that wrap object and put it to parceler
This is in the main activity which is the sender
```
public void gotoSecondActivity(){
        User user = new User("CENG",1);// This is to create a new object
        Parcelable parcelable = Parcels.wrap(user); // Wrap the object

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("DATA_KEY",parcelable); Put the wrap in the parceler
        startActivity(intent);
    }
```
In this code, the wrap function wraped the object and put it in the parceler and ready to transfer it into a new activity.
### Unwrap function
On the receiver side which is the new activity, we unwrap the object
```
 Parcelable parcelable = getIntent().getParcelableExtra("DATA_KEY");
 User user = Parcels.unwrap(parcelable);
```
### Reference
There are a lot of reference about Pareceler but I found that the github of user johncarl81 is the one which has a lot useful tutorial code about parceler. Below is the link of my reference.</br>
[reference](https://github.com/johncarl81/parceler)
