import java.time.LocalDateTime;
import java.util.UUID;

public class Event {
    private UUID id;
    private String title;
    private LocalDateTime date;
    private String description;
    private String eventTypeCategory;
    private boolean isCancelled;
    private Host host;

    public Event(UUID id, String title, LocalDateTime date, String description, String eventTypeCategory, boolean isCancelled, Host host) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
        this.eventTypeCategory = eventTypeCategory;
        this.isCancelled = isCancelled;
        this.host = host;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventTypeCategory() {
        return eventTypeCategory;
    }

    public void setEventTypeCategory(String eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }
}
