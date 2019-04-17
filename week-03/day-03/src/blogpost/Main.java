package blogpost;

public class Main {
    public static void main(String[] args) {

        BlogPost postOne = new BlogPost(
                "John Doe",
                "Lorem ipsum",
                "Lorem ipsum dolor sit amet.",
                "2000.05.04.");

        BlogPost postTwo = new BlogPost(
                "Tim Urban",
                "Wait but why",
                "A popular long-form, stick-figure-illustrated blog about almost everything.",
                "2010.10.10.");

        BlogPost postThree = new BlogPost(
                "William Turton",
                "One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
                "2017.03.28.");

        BlogPosts site = new BlogPosts();

        site.addPost(postOne);
        site.addPost(postTwo);
        site.addPost(postThree);

        site.publish();

        site.deletePost(2);

        site.publish();
    }
}
