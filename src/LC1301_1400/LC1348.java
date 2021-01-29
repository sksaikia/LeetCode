package LC1301_1400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC1348 {

    //     "TweetCounts",                      []                              Initilize the hashMap
//     "recordTweet",                      ["tweet3",0]                    <"tweet3", [0]>
//     "recordTweet",                      ["tweet3",60]                   <"tweet3", [0,60]>
//     "recordTweet",                      ["tweet3",10]                   <"tweet3", [0,60,10]>
//     "getTweetCountsPerFrequency",       ["minute","tweet3",0,59]        no of buckets = (59-0)/60 + 1 = 1
//                                                                         count the tweet3 from 0-59 seconds,
//                                                                         i.e. 0 , 10 seconds . return [2]

//     "getTweetCountsPerFrequency",       ["minute","tweet3",0,60]        no of buckets = (60-0)/60 + 1 = 2
//                                                                         count the tweet3 from 0-59 seconds, 60-61 seconds
//                                                                         i.e. 0,10 | 60 seconds . return [2,1]
//     "recordTweet",                      ["tweet3",120]                   <"tweet3", [0,60,10,120]>
//     "getTweetCountsPerFrequency"       ["hour","tweet3",0,210]          as freq = hour,buckets = 210/3600 + 1 = 1
//                                                                         Count tweets from 0-3599 seconds and put them into the list



    //This hashmap contains all the tweets and their timestamps.
    HashMap<String,List<Integer>> hashMap;
    public LC1348() {
        //initilize the hashmap in the constructor
        hashMap = new HashMap<>();
    }

    //This method inserts a tweet into the hashmap.
    public void recordTweet(String tweetName, int time) {

        //If that tweet is present, we have to append the new time in the exisiting list.
        if (hashMap.containsKey(tweetName)){


            List<Integer> list = hashMap.get(tweetName);
            list.add(time);

            hashMap.put(tweetName,list);

        }
        else{
            //If the tweet is not present, then we have to create a new list and put the timestamp in that .

            List<Integer> list = new ArrayList<>();
            list.add(time);

            hashMap.put(tweetName,list);
        }
    }

    //This method acts as an utility method. We pass different parameters to the getFreq method depending upon the frequency.
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {

        //delta value is set as 60 if the freq is minute. 1 minute = 60 seconds
        //delta value is set as 3600 if the freq is hour, 1 hour = 60*60 seconds
        //delta value is set as 3600*24 if the freq is day . 1 day = 24 hours = 24*3600 seconds

        if (freq.equals("minute"))

            return getFreq(60,startTime,endTime,tweetName);

        if (freq.equals("hour"))

            return getFreq(3600,startTime,endTime,tweetName);

        if (freq.equals("day"))

            return getFreq(3600*24,startTime,endTime,tweetName);

        else

            return null;
    }

    // This is the method where all the logic of this problem resides.
    //Here we can treat the timeframes as some buckets, and we will put those into their respective buckets with this method. eg : Suppose we are given a time frame we will find the total no of required buckets and place the tweets to their respective suppose.
    // eg : time frame  : 0-210 seconds, frequency = minutes . Therefore we will divide it in buckets of 60 seconds.
    // 0-59 | 60-119 | 120-179 | 180-209
    // (210-0)/60 + 1 = 4 . So 4 should be the no of buckets .

    public List<Integer> getFreq(int delta,int startTime,int endTime,String tweetName){

        //length is the total no of buckets.
        int length = (endTime-startTime)/delta + 1;

        //This is the list which needs to be returned. It will contain the frequency of tweet .
        List<Integer> ans = new ArrayList<>();

        //We make a list of size length and initialize it with 0. As our timestamps are not sorted , we have             to do this step. We don't know at what sequence our inputs are given.
        for (int i=0;i<length;i++)
            ans.add(0);

        //This gets the all the timestamps where this tweetName was made. We have to return total no of occurances for the given tweetName depending upon the frequency .
        List<Integer> timestamps = hashMap.get(tweetName);


        //SO we run a loop for each integer in the timestamps list and place them into their respective buckets. We have to count the no of tweets per bucket , therefore we are incrementing the value from that index.
        for (int timestamp : timestamps){

            //We check this condition so that the timestamp is in range of our timeframe.
            if(timestamp>=startTime && timestamp<=endTime){

                //Also the index of the bucket needs to be found out by using this . Because if the startTime is not zero , the range of the bucket will be different .
                // eg ::: startTime = 135 , endTime = 345 . freq = minutes
                //So the buckets should be 135-194| 195-254| 255-314 | 315- 344
                // So the respective indexs  0    |    1    |   2    |     3
                // Therefore the startTime needs to be substracted from the timeStamp.


                int index = (timestamp-startTime)/delta;
                ans.set(index,ans.get(index)+1);

            }
        }

        return ans;
    }

}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */


