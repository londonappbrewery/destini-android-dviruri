package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int NO_ANSWER = -1;

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;

    private StoryStep[] mStoryBank = {
            new StoryStep(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryStep(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryStep(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryStep(R.string.T4_End,NO_ANSWER,NO_ANSWER),
            new StoryStep(R.string.T5_End,NO_ANSWER,NO_ANSWER),
            new StoryStep(R.string.T6_End,NO_ANSWER,NO_ANSWER)
    };

    private int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 0) mStoryIndex = 2;
                else if (mStoryIndex == 2) mStoryIndex = 5;
                else if (mStoryIndex == 1) mStoryIndex = 2;
                UpdateStory();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 0) mStoryIndex = 1;
                else if (mStoryIndex == 1) mStoryIndex = 3;
                else if (mStoryIndex == 2) mStoryIndex = 4;
                UpdateStory();
            }
        });

    }

    private void UpdateStory()
    {
        mStoryTextView.setText(mStoryBank[mStoryIndex].getStoryText());
        if (mStoryIndex>2) {
            mButtonBottom.setVisibility(View.GONE);
            mButtonTop.setVisibility(View.GONE);
        }
        else
        {
            mButtonTop.setText(mStoryBank[mStoryIndex].getTopButton());
            mButtonBottom.setText(mStoryBank[mStoryIndex].getBottomButton());
        }
    }
}
