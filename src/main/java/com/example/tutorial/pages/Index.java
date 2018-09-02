package com.example.tutorial.pages;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Log;

import java.util.Random;

/**
 * Start page of application tutorial1.
 */
public class Index
{
    private final Random random = new Random(System.nanoTime());

    /*
    The InjectPage annotation allows Tapestry to use 'PAGES' in return statements.
    --> when the button start is clicked, the onActionFromStart() method gets called.
    This Method returns 'guess' which means, that after the invocation of the method is
    finished, the guess page will be shown in the browser and its state after guess.setup(target).
     */
    @InjectPage
    private Guess guess;

    /*
    The Log annotation enables logging for the specified method. Further details will follow.
     */
    @Log
    Object onActionFromStart()
    {
        int target = random.nextInt(10) + 1;
        System.out.println(target);

        guess.setup(target);
        return guess;
    }

}
