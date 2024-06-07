import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        EventRepository eventRepository = new EventRepositoryImpl();

        // Создание хозяина мероприятия
        Host host = new Host(UUID.randomUUID(), "host@example.com", "John Doe", "johndoe", "image.png");

        // Создание мероприятия
        Event event = new Event(UUID.randomUUID(), "Conference", LocalDateTime.now().plusDays(10), "Annual Tech Conference", "Technology", false, host);
        eventRepository.createEvent(event);

        // Получение всех мероприятий
        List<Event> allEvents = eventRepository.getAllEvents();
        allEvents.forEach(e -> System.out.println("Event: " + e.getTitle() + ", Date: " + e.getDate()));

        // Поиск мероприятия по ID
        Event foundEvent = eventRepository.getEventById(event.getId());
        if (foundEvent != null) {
            System.out.println("Found Event: " + foundEvent.getTitle() + ", Host: " + foundEvent.getHost().getDisplayName());
        }

        // Обновление мероприятия
        foundEvent.setTitle("Updated Conference");
        eventRepository.updateEvent(foundEvent);

        // Проверка обновления
        Event updatedEvent = eventRepository.getEventById(foundEvent.getId());
        System.out.println("Updated Event: " + updatedEvent.getTitle());

        // Удаление мероприятия
        eventRepository.deleteEvent(foundEvent.getId());
        System.out.println("Event deleted.");

        // Проверка удаления
        Event deletedEvent = eventRepository.getEventById(foundEvent.getId());
        if (deletedEvent == null) {
            System.out.println("Event not found.");
        }
    }
}
