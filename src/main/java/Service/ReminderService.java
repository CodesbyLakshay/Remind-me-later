package Service;

import Model.Reminder;
import Repository.ReminderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ReminderService {
    private final ReminderRepository reminderRepository;

    //Service Layer which saves the datapoints in Database using defined JPA operation
    public Reminder saveReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }
}
