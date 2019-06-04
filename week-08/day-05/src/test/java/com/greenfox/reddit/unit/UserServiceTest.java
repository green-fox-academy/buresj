package com.greenfox.reddit.unit;

import com.greenfox.reddit.entities.Post;
import com.greenfox.reddit.entities.User;
import com.greenfox.reddit.repositories.UserRepo;
import com.greenfox.reddit.services.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceTest {

    @Test
    public void addingExistingUser() {

        UserRepo mockRepository = Mockito.mock(UserRepo.class);
        List<Post> posts = new ArrayList<>();
        posts.add(new Post());
        posts.add(new Post());

        Mockito.when(mockRepository.findAll()).thenReturn(Arrays.asList(
                new User(1, "Name", "password", posts)
        ));

        UserServiceImpl userServiceImpl = new UserServiceImpl(mockRepository);
        User testUser = new User(1, "Name", "password", posts);
        Assert.assertFalse(userServiceImpl.test(testUser));
    }
}
