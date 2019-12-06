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

`androidTestImplementation 'com.android.support.test:runner:1.0.2'`</br>
`androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'`


### The library
The library of Parceler includes Parceler utility class to wrap and unwrap object. This could be very handy if we want to get the parceler object from intent.

### Major method

writeToParcel() and createFromParcel() are methods that read and write to parcel in same order. We don't have to implement the Parcel interface, it already had in its library.</br>
The methods getter and setter and non-empty constructor are using in order to serialize.
