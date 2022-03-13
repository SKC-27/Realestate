package com.example.meroghar;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


public class UserUpdateTest {

    @Rule
    public ActivityTestRule<ProfileEditActivity> profileEdit = new ActivityTestRule<>(ProfileEditActivity.class);

    @Test
    public void EditProfileTest(){
        onView(withId(R.id.userNameUpdate))
             .perform(typeText("uttam tamang"))
             .perform(closeSoftKeyboard());

     onView(withId(R.id.userAddressUpdate))
             .perform(typeText("kathmandu"))
             .perform(closeSoftKeyboard());
      onView(withId(R.id.userPhoneUpdate))
             .perform(typeText("1234567890"))
             .perform(closeSoftKeyboard());

     onView(withId(R.id.btnUpdateProfile))
             .perform(click());
    }


}
