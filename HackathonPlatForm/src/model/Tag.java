package model;

public class Tag {
    public String id;
    public String topic;

    public Tag(String id, String topic) {
        this.id = id;
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
