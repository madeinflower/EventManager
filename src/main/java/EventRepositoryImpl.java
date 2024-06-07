import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class EventRepositoryImpl implements EventRepository {
    private List<Event> events = new ArrayList<>();

    @Override
    public void createEvent(Event event) {
        events.add(event);
    }

    @Override
    public Event getEventById(UUID id) {
        return events.stream().filter(event -> event.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Event> getAllEvents() {
        return new ArrayList<>(events);
    }

    @Override
    public List<Event> findEventsByCriteria(String criteria) {
        // Пример простой фильтрации по названию
        return events.stream().filter(event -> event.getTitle().contains(criteria)).collect(Collectors.toList());
    }

    @Override
    public void updateEvent(Event event) {
        Event existingEvent = getEventById(event.getId());
        if (existingEvent != null) {
            existingEvent.setTitle(event.getTitle());
            existingEvent.setDate(event.getDate());
            existingEvent.setDescription(event.getDescription());
            existingEvent.setEventTypeCategory(event.getEventTypeCategory());
            existingEvent.setCancelled(event.isCancelled());
            existingEvent.setHost(event.getHost());
        }
    }

    @Override
    public void deleteEvent(UUID id) {
        events.removeIf(event -> event.getId().equals(id));
    }
}
