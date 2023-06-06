package pl.jaknauczycsieprogramowania;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private int id;
    private String username;
    private String content;

    public Post(String username, String content) {
        this.username = username;
        this.content = content;
    }
}
