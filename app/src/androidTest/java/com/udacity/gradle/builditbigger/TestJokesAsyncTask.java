package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.test.mock.MockContext;
import android.test.suitebuilder.annotation.LargeTest;
import android.text.TextUtils;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by eslam on 2/3/18.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestJokesAsyncTask {

    @Test
    public void testJokeApi() {
        String joke = new MainActivity.EndpointsAsyncTask(new MockContext()).doInBackground();
        Assert.assertFalse(TextUtils.isEmpty(joke));
    }

}
