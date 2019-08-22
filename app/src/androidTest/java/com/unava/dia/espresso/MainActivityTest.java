package com.unava.dia.espresso;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private String str = "Ann";
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testScenarion() {
        // input some text into et
        Espresso.onView(withId(R.id.et)).perform(typeText(str));

        // close soft keyboard
        Espresso.closeSoftKeyboard();

        // perform click
        Espresso.onView(withId(R.id.bt)).perform(click());

        // check the text in the tv
        Espresso.onView(withId(R.id.tv)).check(matches(withText(str)));
    }

    @After
    public void tearDown() throws Exception {
    }
}