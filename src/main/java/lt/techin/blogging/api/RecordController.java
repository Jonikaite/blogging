package lt.techin.blogging.api;

import lt.techin.blogging.dao.RecordRepository;
import lt.techin.blogging.model.Record;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/records")
public class RecordController {

//    public static Logger logger = LoggerFactory.getLogger(RecordController.class);

    private final RecordRepository recordRepository;

    public RecordController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

@PostMapping
public Record createRecord(@RequestBody Record record) {
    return recordRepository.save(record);
}

//@PostMapping(/{recordId})

}
