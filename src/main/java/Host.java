import java.util.UUID;

public class Host {
    private UUID id;
    private String email;
    private String displayName;
    private String username;
    private String image;

    // Конструкторы, геттеры и сеттеры
    public Host(UUID id, String email, String displayName, String username, String image) {
        this.id = id;
        this.email = email;
        this.displayName = displayName;
        this.username = username;
        this.image = image;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
