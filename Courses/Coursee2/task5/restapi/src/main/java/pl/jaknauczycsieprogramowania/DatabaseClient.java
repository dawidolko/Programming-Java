package pl.jaknauczycsieprogramowania;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DatabaseClient {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/users")
    public String getUsers() throws JsonProcessingException {
        List users = jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
        return objectMapper.writeValueAsString(users);
    }

    @GetMapping("/users/{username}")
    public String getUser(@PathVariable("username") String username) throws JsonProcessingException {
        List users = jdbcTemplate.query("SELECT * FROM users WHERE username = :username",
                new MapSqlParameterSource()
                        .addValue("username", username), new BeanPropertyRowMapper<>(User.class));

        return objectMapper.writeValueAsString(users.get(0));
    }

    @PostMapping("/users")
    public ResponseEntity addUser(@RequestBody User user) {
        String sql = "INSERT into USERS(username, age, name) VALUES(:username, :age, :name)";
        MapSqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("username", user.getUsername())
                .addValue("age", user.getAge())
                .addValue("name", user.getName());

        jdbcTemplate.update(sql, parameters);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/users/{username}")
    public ResponseEntity deleteUser(@PathVariable("username") String username) {
        String sql = "DELETE FROM users where username = :username";
        MapSqlParameterSource parameters = new MapSqlParameterSource().addValue("username", username);

        jdbcTemplate.update(sql, parameters);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/posts")
    public String getPosts() throws JsonProcessingException {
        List posts = jdbcTemplate.query("SELECT * FROM posts", new BeanPropertyRowMapper<>(Post.class));

        return objectMapper.writeValueAsString(posts);
    }

    @GetMapping("/posts/{postId}")
    public String getPost(@PathVariable("postId") int postId) throws JsonProcessingException {
        List posts = jdbcTemplate.query("SELECT * FROM posts WHERE id = :id",
                new MapSqlParameterSource()
                        .addValue("id", postId), new BeanPropertyRowMapper<>(Post.class));

        return objectMapper.writeValueAsString(posts);
    }

    @PostMapping("/posts")
    public ResponseEntity addPost(@RequestBody Post post) {
        String sql = "INSERT INTO posts(username, content) VALUES(:username, :content)";
        MapSqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("username", post.getUsername())
                .addValue("content", post.getContent());

        jdbcTemplate.update(sql, parameters);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/posts/{postId}")
    public void deletePost(@PathVariable("postId") int postId) {
        String sql = "DELETE from posts WHERE id = :id";
        MapSqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("id", postId);

        jdbcTemplate.update(sql, parameters);
    }
}
