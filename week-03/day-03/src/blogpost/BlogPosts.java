//Reuse your BlogPost class
//Create a Blog class which can
//        store a list of BlogPosts
//        add BlogPosts to the list
//        delete(int) one item at given index
//        update(int, BlogPost) one item at the given index and update it with another BlogPost

package blogpost;

import java.util.ArrayList;
import java.util.List;

public class BlogPosts {
    List<BlogPost> blogPosts = new ArrayList<>();

    public void addPost(BlogPost newPost) {
        blogPosts.add(newPost);
    }

    public void deletePost(int numPost) {
        blogPosts.remove(numPost);
    }

    public void update(int num, BlogPost newPost) {
        blogPosts.set(num, newPost);
    }

    public void publish() {
        for (BlogPost blog :
                blogPosts) {
            System.out.println(blog.title);
        }
    }
}
