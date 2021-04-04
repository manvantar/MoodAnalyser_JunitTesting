package com.moodanalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ReturnSad(){
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood=moodAnalyser.analysemood("SAD");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    void givenMessage_WhenHappy_ReturnHappy() {
        MoodAnalyser moodAnalyser1= new MoodAnalyser();
        String mood=moodAnalyser1.analysemood("Happy");
        Assertions.assertEquals("SAD",mood);
    }
}
