package Controler;

import Model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeControler {
    @RequestMapping("posts")
    public String getAllPosts(Model model)
    {
        Post post1 = new Post();
        post1.setTitle("Post Title -1");
        post1.setBody("Post Body -1");
        post1.setDate(new Date());


        Post post2 = new Post();
        post2.setTitle("Post Title -2");
        post2.setBody("Post Body -2");
        post2.setDate(new Date());

        ArrayList <Post> posts = new ArrayList();
        posts.add(post1);
        posts.add(post2);
        model.addAttribute("posts", posts);

        return "index";

    }
}
