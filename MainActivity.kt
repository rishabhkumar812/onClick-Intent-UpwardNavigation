package com.rishabh.practiceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE="com.rishabh.practiceApplication.MESSAGE"
/*Your key is a public constant EXTRA_MESSAGE because the next activity uses the key to retrieve the text value.
It's a good practice to define keys for intent extras with your app's package name as a prefix.
This ensures that the keys are unique, in case your app interacts with other apps.*/


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View)
    {

        val editText=findViewById<EditText>(R.id.editTextTextPersonName)
        val message=editText.text.toString()

        val intents = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }

        /*The Context parameter is used first because the Activity class is a subclass of Context.
        The Class parameter of the app component, to which the system delivers the Intent, is, in this case, the activity to start.*/

        startActivity(intents)

        /*The putExtra() method adds the value of EditText to the intent.
        An Intent can carry data types as key-value pairs called extras.*/
    }
}