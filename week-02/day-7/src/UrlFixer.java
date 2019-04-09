// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crutial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!

public class UrlFixer {
    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        //solution 1
        String correctedUrl = url.replace("s/", "s:/");
        System.out.println(correctedUrl.replace("bots", "odds"));

        //solution 2
        String https = url.substring(0, 5);
        System.out.println(https);

        String correctedHttps = https + "://";
        System.out.println(correctedHttps);

        String www = url.substring(7,21);
        System.out.println(www);

        String reddit = url.substring(21,24);
        System.out.println(reddit);

        String nevertellmethe = url.substring(24, 38);
        String odds = "nevertellmethe" + "odds";
        System.out.println(odds);

        System.out.println(correctedHttps + www + reddit + odds);
    }
}
