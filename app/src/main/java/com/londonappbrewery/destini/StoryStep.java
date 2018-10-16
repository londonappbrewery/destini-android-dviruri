package com.londonappbrewery.destini;

public class StoryStep {

    private int mStoryText;

    public int getStoryText() {
        return mStoryText;
    }

    public void setStoryText(int storyText) {
        mStoryText = storyText;
    }

    public int getTopButton() {
        return mTopButton;
    }

    public void setTopButton(int topButton) {
        mTopButton = topButton;
    }

    public int getBottomButton() {
        return mBottomButton;
    }

    public void setBottomButton(int bottomButton) {
        mBottomButton = bottomButton;
    }

    private int mTopButton;
    private int mBottomButton;

    public StoryStep(int text, int top, int bottom)
    {
        mStoryText = text;
        mTopButton = top;
        mBottomButton = bottom;
    }

}
