# TimerButton  
A button that has a timer :)

![Screenshot](http://i.giphy.com/3o84U7Ge6moW0kbSYU.gif) 
#HOW TO SETUP?
To use this Library in your project you first need to: 

1) Add this to your root ```build.gradle``` file:  
```groovy
allprojects{  
    repositories {  
        ......  
        maven {
        
        url 'https://jitpack.io'//TODO  
        
        }   
    }    
}  
<br></br>
```  
2) And then in your Project's ```build.gradle``` file:  
```groovy  
dependencies {  
    .......  
    
    compile 'com.github.aamirwahid5:TimerButton:1.0' //TODO  
       
}  
```  
#HOW TO USE:  
Firstly include as you include the Simple Button :

```xml
<project.aamir.sheikh.timerbutton.TimerButton
            android:id="@+id/btn"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            />
```  

and then in your java Code:
```java
     TimerButton btn=(TimerButton) findViewById(R.id.btn); //TODO
```
#Methods and Callbacks:
```java
setFinishTime(10); //sets the finish time (in Seconds)
setInterval(1000); //Sets the time interval (in Milliseconds)  
setTimerText("Next"); //Sets the text next to timer

 //Do Something on Timer Completed
        btn.setOnTimerCompleteListener(new TimerButton.onTimeCompleteListener() {
            @Override
            public void onTimeCompleted() {
                //Toast.makeText(MainActivity.this, "Completed", Toast.LENGTH_SHORT).show();
            }
        });
```
