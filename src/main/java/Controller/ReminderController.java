package Controller;

import Model.Reminder;
import Service.ReminderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/reminder")
public class ReminderController {

    private final ReminderService reminderService;


    // Single Endpoint as asked in the Assignment to save Reminder in Datbase


    @PostMapping(value = "save-reminder")
    public ResponseEntity<Reminder> saveReminder(@RequestBody Reminder reminder){
        return new ResponseEntity<>(reminderService.saveReminder(reminder), HttpStatus.OK);
    }

}
