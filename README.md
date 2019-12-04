# Parceler

### The introduction
Parceler is a code generation library that generates the Android Parcelarable familar source code. Parceler is easy to transfer data from one activity to another activity such as transferring the text that user input in one activity to another activity. For example, when a user enters a keyword in search box, the keyword that user enters should be shown up with the search result in another activities. Therefore, the parceler uses for passing data object, data objects with simple code 

#### To use parceler, we have to import

import android.os.Parcel;
import android.os.Parcelable;

The library of Parceler includes Parceler utility class to wrap and unwrap object. This could be very handy if we want to get the parceler object from intent.
