package com.example.android.courtcounter.testFolder

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.courtcounter.MainActivity
import com.example.android.courtcounter.R
import com.example.android.courtcounter.Utils.BaseTest
import org.hamcrest.Matchers.allOf
import org.junit.Test
import org.junit.runner.RunWith

//type out the run with line and it will import the required parts
@RunWith(AndroidJUnit4::class)
class myFirstTest: BaseTest() {

    @Test
    fun checkTeamAPoints() {

        ActivityScenario.launch(MainActivity::class.java)

        onView(allOf(withId(R.id.team_a_score), withText("0")))
                .check(matches(isDisplayed()))

    }
}