# EditTextInputValidatorLibrary
Validator library
for compare the password

# The UI view

![Screenshot_4](https://user-images.githubusercontent.com/104067484/164770785-994cb581-2991-4f1f-9a02-689d1e6251d1.png) ![Screenshot_5](https://user-images.githubusercontent.com/104067484/164770822-89b11774-8d01-47f5-a3ad-5c15ce7f06a2.png)

# XML view

&lt;
EditText  
        android:paddingLeft="10dp"          
        android:paddingRight="10dp"        
        android:id="@+id/edit1"        
        android:layout_width="match_parent"        
        android:layout_height="50dp"/>        
        
&lt;
EditText  
        android:paddingLeft="10dp"          
        android:paddingRight="10dp"        
        android:id="@+id/edit2"        
        android:layout_width="match_parent"        
        android:layout_height="50dp"/> 

# Use in activity

var edit1 = findViewById&lt;EditText>(R.id.edit1)
  
var edit2 = findViewById&lt;EditText>(R.id.edit2)

InputValidator.validator(edit1, edit2)

# Maven

maven {

     url 'https://jitpack.io' 
     
}

# Gradle

dependencies {

    implementation 'com.github.AkmalValiev:EditTextInputValidatorLibrary:1.1.2'
    
}



        
        


