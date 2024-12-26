package br.com.mariojp.demo;

import jakarta.faces.view.ViewScoped;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.Map;

@Component
@Scope("view")
public class HelloBean implements Serializable {

    private String message = "Welcome to PrimeFaces 14.0.6 with Jakarta Faces!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void updateMessage() {
        System.out.println("Updating message..."+message);
        message = "Updated Message: " + message;
    }


    public void updateMessage2() {
        System.out.println("Fetching message from /api/users/message...");

        // Criando uma instância de RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Consumindo o endpoint /api/users/message
        String url = "http://localhost:8080/api/users/message";
        Map<String, String> response = restTemplate.getForObject(url, Map.class);

        if (response != null && response.containsKey("message")) {
            // Atualizando a mensagem com o valor retornado pelo endpoint
            message = "Updated Message: " + response.get("message");
        } else {
            message = "Updated Message: Error fetching message";
        }

        System.out.println("Updated message: " + message);
    }
}