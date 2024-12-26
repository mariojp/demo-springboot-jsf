package br.com.mariojp.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController()
@RequestMapping("/api/users")
public class UserRestController {

    private final UserRepository userRepository;

    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping
    public List<User> list() {
        return userRepository.findAll();
    }

    @RequestMapping("/{id}")
    public User get(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @RequestMapping(method = POST)
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @RequestMapping(method = DELETE)
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    // Novo método que retorna um JSON com um texto
    @RequestMapping(value = "/message", method = GET)
    public Map<String, String> getMessage() {
        return Map.of("message", "Hello, this is a JSON response!");
    }


}
