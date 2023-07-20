package pl.jaknauczycsieprogramowania;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class DatabaseClient {

    NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(JdbcConfig.getMysqlDataSource());

    ObjectMapper objectMapper = new ObjectMapper();

    public String getUsers() throws JsonProcessingException {
        List users = jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
        return objectMapper.writeValueAsString(users);
    }

    public String getUser(String username) throws JsonProcessingException {
        List users = jdbcTemplate.query("SELECT * FROM users WHERE username = :username",
                new MapSqlParameterSource()
                        .addValue("username", username), new BeanPropertyRowMapper<>(User.class));

        return objectMapper.writeValueAsString(users.get(0));
    }

    public void addUser(User user) {
        String sql = "INSERT into USERS(username, age, name) VALUES(:username, :age, :name)";
        MapSqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("username", user.getUsername())
                .addValue("age", user.getAge())
                .addValue("name", user.getName());

        jdbcTemplate.update(sql, parameters);
    }

    public void deleteUser(String username) {
        String sql = "DELETE FROM users where username = :username";
        MapSqlParameterSource parameters = new MapSqlParameterSource().addValue("username", username);

        jdbcTemplate.update(sql, parameters);
    }

    public String getPosts() throws JsonProcessingException {
        List posts = jdbcTemplate.query("SELECT * FROM posts", new BeanPropertyRowMapper<>(Post.class));

        return objectMapper.writeValueAsString(posts);
    }

    public String getPost(int postId) throws JsonProcessingException {
        List posts = jdbcTemplate.query("SELECT * FROM posts WHERE id = :id",
                new MapSqlParameterSource()
                        .addValue("id", postId), new BeanPropertyRowMapper<>(Post.class));

        return objectMapper.writeValueAsString(posts);
    }

    public void addPost(Post post) {
        String sql = "INSERT INTO posts(username, content) VALUES(:username, :content)";
        MapSqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("username", post.getUsername())
                .addValue("content", post.getContent());

        jdbcTemplate.update(sql, parameters);
    }

    public void deletePost(int postId) {
        String sql = "DELETE from posts WHERE id = :id";
        MapSqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("id", postId);

        jdbcTemplate.update(sql, parameters);
    }

    public void clearDatabase() {
        String truncateUsers = "TRUNCATE users";
        String truncatePosts = "TRUNCATE posts";

        jdbcTemplate.update(truncateUsers, new MapSqlParameterSource());
        jdbcTemplate.update(truncatePosts, new MapSqlParameterSource());
    }

}
