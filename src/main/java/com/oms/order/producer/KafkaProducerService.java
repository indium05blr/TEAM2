

public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic = "team2";

    @Autowired
    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(topic, message);
        System.out.println("send successfully");
    }
}
