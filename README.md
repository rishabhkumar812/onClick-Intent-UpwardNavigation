# onClickAttribute-Intent-UpwardNavigation
## **onClick**
onClick attribute  for any view can be used for setting up a method to be called by system whenever the view is clicked.
It can be directly accessed from the attribute panel while designing the UI. It has a dropdown from which a compatible method can be selected for onClick property.

This method must satisfy these conditions.
1. Public access.
2. A void or, in Kotlin, an implicit unit return value.
3. A View as the only parameter. This is the View object you clicked.

## **Intent**
An Intent is an object that provides runtime binding between separate components, such as two activities. The Intent represents an app’s intent to do something. In this case, it shows how to start another activity. The ***startActivity() method***  starts an instance of the Activity that's specified by the Intent. Also it shows how to send data from one activity to another using ***putExtra() method*** and recieve data at destination activity though ***getIntent() method or intent***.

## **Add upward navigation**
Each screen in your app that's not the main entry point, which are all the screens that aren't the home screen, must provide navigation that directs the user to the logical parent screen in the app's hierarchy. To do this, add an Up button in the app bar.

To add an Up button, you need to declare which activity is the logical parent in the AndroidManifest.xml file. 

